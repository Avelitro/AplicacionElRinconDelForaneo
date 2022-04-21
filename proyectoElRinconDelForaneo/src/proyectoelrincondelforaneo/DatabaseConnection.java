/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoelrincondelforaneo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rheve
 */
public class DatabaseConnection {
    private Connection con;

    // Conceccion a la base de datos
    public DatabaseConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se puede conectar a la base de datos");
        }
    }

    // Ejemplo de consulta GET
    public ResultSet listPacientesByNombresLike(String tfNombre) throws SQLException {
        // TODO add your handling code here:
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("SELECT * FROM pacientes WHERE nombres LIKE '" + tfNombre + "%'");
        return rs;
    }

    // Ejemplo de consulta POST
    public void createpacientes(String tfDocumento, String tfNombres, String tfApellidos, String sexo)
            throws SQLException {
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO pacientes VALUES ('" + tfDocumento + "','" + tfNombres + "','" + tfApellidos
                + "','" + sexo + "')");
    }
}
