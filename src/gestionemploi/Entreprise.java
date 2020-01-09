package gestionemploi;

import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Entreprise {

    private int matricule;
    private byte[] logo;
    private String nom;
    private String telephone;
    private String adresse;
    private String domaine;
    private String email;
    private String password;
    private String question;
    private String reponse;

    public Entreprise() {
    }

    /**
     * Declaration et initialisation d'un constructeur avec les methodes getters
     * et setters
     *
     * @param matricule
     * @param logo
     * @param nom
     * @param telephone
     * @param adresse
     * @param domaine
     * @param email
     * @param password
     * @param question
     * @param reponse
     */
    public Entreprise(int matricule, byte[] logo, String nom, String telephone, String adresse, String domaine, String email, String password, String question, String reponse) {
        this.matricule = matricule;
        this.logo = logo;
        this.nom = nom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.domaine = domaine;
        this.email = email;
        this.password = password;
        this.question = question;
        this.reponse = reponse;
    }

    public Entreprise(int matricule, byte[] logo, String nom, String telephone, String adresse, String domaine, String email) {
        this.matricule = matricule;
        this.logo = logo;
        this.nom = nom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.domaine = domaine;
        this.email = email;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
     * Cette methode permet de se connecter dans la base de donnee et
     * enregistrer les informations d'une entreprise nouvellement inscri.
     *
     * @param code
     * @param logo
     * @param nom
     * @param telephone
     * @param adresse
     * @param domaine
     * @param email
     * @param password
     * @param question
     * @param reponse
     */
    public boolean ToutEstRemplie() {
        if (logo == null || nom == null || telephone == null
                || adresse == null || domaine == null || password == null
                || question == null || reponse == null || email == null) {
            return false;
        } else {
            return true;
        }
    }

    public void ajouter_entreprise(int code, byte[] logo, String nom, String telephone, String adresse, String domaine, String email,
            String password, String question, String reponse) {
        Connection con = Connexion.BaseDeDonnee();
        PreparedStatement stat = null;

        String sql = "INSERT INTO entreprise(code, logo, nomEntreprise, domaine, adressePostal,telephone, emailEntreprise,"
                + " motDePasse, questionSecret, reponse) VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {
            stat = con.prepareStatement(sql);
            stat.setInt(1, code);
            stat.setBytes(2, logo);
            stat.setString(3, nom);
            stat.setString(4, domaine);
            stat.setString(5, adresse);
            stat.setString(6, telephone);
            stat.setString(7, email);
            stat.setString(8, password);
            stat.setString(9, question);
            stat.setString(10, reponse);
            stat.execute();
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
        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }

    /**
     * Cette methode permet de modifier les informations relatives a une
     * entreprise
     *
     * @param matricule
     * @param logo
     * @param nom
     * @param telephone
     * @param adresse
     * @param domaine
     * @param email
     * @param password
     * @param question
     * @param reponse
     */
    public void modifier_info_entreprise(int matricule, String nom, String telephone, String adresse,
            String domaine, String email, String password, String question, String reponse) {
        int code = 1;
        Connection con = Connexion.BaseDeDonnee();
        PreparedStatement stat = null;
        String sql = "UPDATE entreprise SET code=?,nomEntreprise=?,domaine=?,adressePostal=?,telephone=?,"
                + "emailEntreprise=?,motDePasse=?,questionSecret=?,reponse=? WHERE matricule=?";
        //System.out.println(sql);
        try {
            stat = con.prepareStatement(sql);
            stat.setInt(1, code);
            stat.setString(2, nom);
            stat.setString(3, domaine);
            stat.setString(4, adresse);
            stat.setString(5, telephone);
            stat.setString(6, email);
            stat.setString(7, password);
            stat.setString(8, question);
            stat.setString(9, reponse);
            stat.setInt(10, matricule);
            stat.execute();
            JOptionPane.showMessageDialog(null, "Informations modifiées ");

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
