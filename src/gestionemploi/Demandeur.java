/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionemploi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Demandeur {

    private int identifiant;
    private byte[] photo;
    private String nom;
    private String prenom;
    private String sexe;
    private String date_de_naissance;
    private String nationalite;
    private String telephone;
    private String adresse;
    private String diplome;
    private String annee_obtention;
    private String domaine;
    private String statut;
    private String cv;
    private String email;
    private String mot_de_passe;
    private String question;
    private String reponse;

    
/**
 * Declaration d'un constructeur sans parametre
 */
    public Demandeur() {
    }

/**
 * Decalaration d'un constructeur avec l'ensembles des attribut d'un demandeur ainsi des getters et setters
 * @param identifiant
 * @param photo
 * @param nom
 * @param prenom
 * @param sexe
 * @param date_de_naissance
 * @param nationalite
 * @param telephone
 * @param adresse
 * @param diplome
 * @param annee_obtention
 * @param domaine
 * @param statut
 * @param cv
 * @param email
 * @param mot_de_passe
 * @param question
 * @param reponse 
 */
    public Demandeur(int identifiant, byte[] photo, String nom, String prenom, String sexe, String date_de_naissance,
            String nationalite, String telephone, String adresse, String diplome, String annee_obtention, String domaine,
            String statut, String cv, String email, String mot_de_passe, String question, String reponse) {
        this.identifiant = identifiant;
        this.photo = photo;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.date_de_naissance = date_de_naissance;
        this.nationalite = nationalite;
        this.telephone = telephone;
        this.adresse = adresse;
        this.diplome = diplome;
        this.annee_obtention = annee_obtention;
        this.domaine = domaine;
        this.statut = statut;
        this.cv = cv;
        this.email = email;
        this.mot_de_passe = mot_de_passe;
        this.question = question;
        this.reponse = reponse;
    }

/**
 * Declaration d'un constructeur qui retourne l'ensemble des attribut sauf le mot de passe et la question secrete du demandeur
 * @param identifiant
 * @param photo
 * @param nom
 * @param prenom
 * @param sexe
 * @param date_de_naissance
 * @param nationalite
 * @param telephone
 * @param adresse
 * @param diplome
 * @param annee_obtention
 * @param domaine
 * @param statut
 * @param cv
 * @param email 
 */
    public Demandeur(int identifiant, byte[] photo, String nom, String prenom, String sexe, String date_de_naissance,
            String nationalite, String telephone, String adresse, String diplome, String annee_obtention, String domaine,
            String statut, String cv,
            String email) {
        this.identifiant = identifiant;
        this.photo = photo;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.date_de_naissance = date_de_naissance;
        this.nationalite = nationalite;
        this.telephone = telephone;
        this.adresse = adresse;
        this.diplome = diplome;
        this.annee_obtention = annee_obtention;
        this.domaine = domaine;
        this.statut = statut;
        this.cv = cv;
        this.email = email;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(String date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getAnnee_obtention() {
        return annee_obtention;
    }

    public void setAnnee_obtention(String annee_obtention) {
        this.annee_obtention = annee_obtention;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

/**
 * Cette methode recoie en parametre les informations du formulaire saisies par l'utilisateur.
 * Les informations sont ensuite traiter et envoyer au niveau de la base de donnee.
 * @param code
 * @param photo
 * @param nom
 * @param prenom
 * @param sexe
 * @param date_de_naissance
 * @param nationalite
 * @param telephone
 * @param adresse
 * @param niveau
 * @param annee
 * @param domaine
 * @param statut
 * @param cv
 * @param email
 * @param password
 * @param question
 * @param reponse 
 */
    public void ajouter_demandeur(int code, byte[] photo, String nom, String prenom, String sexe, String date_de_naissance, String nationalite, String telephone, String adresse,
            String niveau, String annee, String domaine, String statut, String cv, String email,
            String password, String question, String reponse) {

        Connection con = Connexion.BaseDeDonnee();
        PreparedStatement stat = null;
        ResultSet res = null;

        try {
            String sql = "INSERT INTO demandeur (code,photo,nomDemandeur,prenomDemandeur,sexe,dateDeNaissance,nationalite,telephone,adresse"
                    + ",diplome,anneeObtention,domaine,statut,cv,emailDemandeur,motDePasse,questionSecret,reponse) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            stat = con.prepareStatement(sql);
            stat.setInt(1, code);
            stat.setBytes(2, photo);
            stat.setString(3, nom);
            stat.setString(4, prenom);
            stat.setString(5, sexe);
            stat.setString(6, date_de_naissance);
            stat.setString(7, nationalite);
            stat.setString(8, telephone);
            stat.setString(9, adresse);
            stat.setString(10, niveau);
            stat.setString(11, annee);
            stat.setString(12, domaine);
            stat.setString(13, statut);
            stat.setString(14, cv);
            stat.setString(15, email);
            stat.setString(16, password);
            stat.setString(17, question);
            stat.setString(18, reponse);
            stat.execute();
            //System.out.println(sql);
            JOptionPane.showMessageDialog(null, "Ajout terminé avec succé !");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            if (con != null) {
                con.close();
            }
            if (stat != null) {
                stat.close();
            }
            if (res != null) {
                res.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

/**
 * Cette methode permet a l'utilisateur de modifier ses informations personnlle.
 * @param identifiant
 * @param code
 * @param photo
 * @param nom
 * @param prenom
 * @param sexe
 * @param date_de_naissance
 * @param nationalite
 * @param telephone
 * @param adresse
 * @param niveau
 * @param annee
 * @param domaine
 * @param statut
 * @param cv
 * @param email
 * @param password
 * @param question
 * @param reponse 
 */

    public void modifier_info(int identifiant, int code, String nom, String prenom, String sexe, String date_de_naissance, String nationalite,
            String telephone, String adresse, String niveau, String annee, String domaine, String statut, String email,
            String password, String question, String reponse) {  
        
        Connection con = Connexion.BaseDeDonnee();
        Statement stat = null;
        
        String sql = "UPDATE demandeur SET code='"+code+"',nomDemandeur='" + nom + "',prenomDemandeur='" + prenom + "',sexe='" + sexe + "',dateDeNaissance='" + date_de_naissance + "'"
                + ",nationalite='" + nationalite + "',telephone='" + telephone + "',adresse='" + adresse + "',diplome='" + niveau + "',anneeObtention='" + annee + "'"
                + ",domaine='" + domaine + "',statut='" + statut + "',emailDemandeur='" + email + "',motDePasse='" + password + "'"
                + ",questionSecret='" + question + "',reponse='" + reponse + "' WHERE identifiant=" + identifiant;
        //System.out.println(sql);
        try {
            stat = con.createStatement();
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Information modifier avec succé !");

        } catch (SQLException ex) {
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
