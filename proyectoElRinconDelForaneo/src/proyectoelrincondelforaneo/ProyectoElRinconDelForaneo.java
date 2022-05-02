/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoelrincondelforaneo;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rheve
 */
public class ProyectoElRinconDelForaneo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatabaseConnection aux = new DatabaseConnection();
        try {
            aux.createpacientes("", "Marco", "Polo", "F");
        } catch (SQLException ex) {
            Logger.getLogger(ProyectoElRinconDelForaneo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
}
