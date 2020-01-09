/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionemploi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Administrateur {
    
 /** Cette methode permet de supprimer un demandeur a partir de son identifiant
  * 
  * @param id 
  */   
      
    public void supprimer_demandeur(int id) {
        
        Connection con=Connexion.BaseDeDonnee();
        Statement stat=null;
        String sql="DELETE from professionnel where identifiant="+id;
        try {
            stat=con.createStatement();
            stat.executeUpdate(sql);
            System.out.println("Demandeur bien supprimer !");
            
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
}

/**
 * Cette methode supprime une entrprise a partir de son identifiant
 * @param id 
 */
    public void supprimer_entreprise(int id) {
        
        Connection con=Connexion.BaseDeDonnee();
        Statement stat=null;
        String sql="DELETE from entreprise where matricule="+id;
        try {
            stat=con.createStatement();
            stat.executeUpdate(sql);
            System.out.println("Entreprise bien supprimer !");
            
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
        try {
            if (con != null) {
                con.close();
            }
            if (stat != null) {
                stat.close();
            }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
}
}

