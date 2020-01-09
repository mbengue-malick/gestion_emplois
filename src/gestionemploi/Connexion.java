
package gestionemploi;

import java.sql.*;
import javax.swing.*;


public class Connexion {

    public static Connection BaseDeDonnee() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gestionemploi?useSSL=false", "root", "");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Classe introuvable ");
        } catch (SQLException e) {
            //System.out.println("Connexion impossible");
            JOptionPane.showMessageDialog(null, "Connexion impossible ");
        }
        return con;

    }
}
