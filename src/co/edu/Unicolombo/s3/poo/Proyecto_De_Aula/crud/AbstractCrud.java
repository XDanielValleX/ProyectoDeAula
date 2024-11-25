/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud.main.ICrudModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public abstract class AbstractCrud<T> implements ICrudModel<T> {
    protected Connection conexion;
    private final String URL = "jdbc:mysql://localhost/plataforma";
    private final String USER = "root";
    private final String PASSWORD = "";
     public AbstractCrud() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver: " + e.getMessage());
        }
    }
      protected Connection getConexion() throws SQLException {
        if (conexion == null || conexion.isClosed()) {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return conexion;
    }
       protected abstract String getTabla();
    protected abstract String[] getColumnas();
    protected abstract Object[] getValues(T objeto);
    protected abstract T mapResultSetToEntity(ResultSet rs) throws SQLException;
    protected abstract String getIdentificador(T objeto);
    public void agregar(T objeto) throws Exception {
        String columnas = String.join(", ", getColumnas());
        String valores = String.join(", ", new String(new char[getColumnas().length]).replace("\0", "?").split(""));
        String sql = "INSERT INTO " + getTabla() + " (" + columnas + ") VALUES (" + valores + ")";
        
        try (Connection conn = getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            Object[] values = getValues(objeto);
            for (int i = 0; i < values.length; i++) {
                stmt.setObject(i + 1, values[i]);
            }
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new Exception("Error al agregar: " + e.getMessage());
        }
    }
    
    public T buscar(String identificador) throws Exception {
        String sql = "SELECT * FROM " + getTabla() + " WHERE " + getColumnas()[0] + " = ?";
        
        try (Connection conn = getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, identificador);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                return mapResultSetToEntity(rs);
            } else {
                throw new Exception("No se encontró el elemento");
            }
        } catch (SQLException e) {
            throw new Exception("Error al buscar: " + e.getMessage());
        }
    }
    
    public void editar(T objeto) throws Exception {
        String[] columnas = getColumnas();
        StringBuilder sql = new StringBuilder("UPDATE " + getTabla() + " SET ");
        
        for (int i = 1; i < columnas.length; i++) {
            if (i > 1) sql.append(", ");
            sql.append(columnas[i]).append(" = ?");
        }
        sql.append(" WHERE ").append(columnas[0]).append(" = ?");
        
        try (Connection conn = getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql.toString())) {
            
            Object[] values = getValues(objeto);
            // Establecer valores para SET
            for (int i = 1; i < values.length; i++) {
                stmt.setObject(i, values[i]);
            }
            // Establecer valor para WHERE
            stmt.setObject(values.length, values[0]);
            
            if (stmt.executeUpdate() == 0) {
                throw new Exception("No se encontró el elemento para actualizar");
            }
        } catch (SQLException e) {
            throw new Exception("Error al editar: " + e.getMessage());
        }
    }
    
    public void eliminar(String identificador) throws Exception {
        String sql = "DELETE FROM " + getTabla() + " WHERE " + getColumnas()[0] + " = ?";
        
        try (Connection conn = getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, identificador);
            
            if (stmt.executeUpdate() == 0) {
                throw new Exception("No se encontró el elemento para eliminar");
            }
        } catch (SQLException e) {
            throw new Exception("Error al eliminar: " + e.getMessage());
        }
    }
    
    public List<T> listarTodo() throws Exception {
        List<T> elementos = new ArrayList<>();
        String sql = "SELECT * FROM " + getTabla();
        
        try (Connection conn = getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                elementos.add(mapResultSetToEntity(rs));
            }
            
            if (elementos.isEmpty()) {
                throw new Exception("No hay elementos en la tabla");
            }
            
            return elementos;
        } catch (SQLException e) {
            throw new Exception("Error al listar: " + e.getMessage());
        }
    }
    
    public int contar() throws Exception {
        String sql = "SELECT COUNT(*) FROM " + getTabla();
        
        try (Connection conn = getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count == 0) {
                    throw new Exception("No hay elementos en la tabla");
                }
                return count;
            }
            throw new Exception("Error al contar elementos");
        } catch (SQLException e) {
            throw new Exception("Error al contar: " + e.getMessage());
        }
    }
}

