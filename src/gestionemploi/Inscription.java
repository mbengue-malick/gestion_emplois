/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionemploi;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JFrame;

/**
 *
 * @author Malik ibn Zeynab
 */
public class Inscription extends javax.swing.JFrame {

    public Inscription() {

        initComponents();
        setTitle("Inscription");
        groupSexe.add(homme);
        groupSexe.add(femme);
        groupStatut.add(etudiant);
        groupStatut.add(professionel);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setIconImage(new ImageIcon(getClass().getResource("/gestionemploi/Logo_Entreprise/jobs.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupSexe = new javax.swing.ButtonGroup();
        groupStatut = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        label_photo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        homme = new javax.swing.JRadioButton();
        femme = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        txt_naissance = new javax.swing.JTextField();
        txt_nationalite = new javax.swing.JTextField();
        txt_telephone = new javax.swing.JTextField();
        txt_adress = new javax.swing.JTextField();
        chemin_photo = new javax.swing.JButton();
        jButtonValider = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_niveau = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txt_annee = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txt_domaine = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        etudiant = new javax.swing.JRadioButton();
        professionel = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jcheminCV = new javax.swing.JTextField();
        nom_CV = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_question = new javax.swing.JComboBox();
        txt_reponse = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        txt_pass2 = new javax.swing.JPasswordField();
        txt_email = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_mesage = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(235, 204, 173));

        label_photo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Malik ibn Zeynab\\Documents\\NetBeansProjects\\GestionEmploi\\src\\gestionemploi\\info.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("INFORMATIONS ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nom :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Prénom :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Sexe :");

        homme.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        homme.setText("Homme");
        homme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hommeActionPerformed(evt);
            }
        });

        femme.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        femme.setText("Femme");
        femme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femmeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Date de naissance :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nationalité :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Téléphone :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Adresse :");

        txt_nom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_prenom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_prenomActionPerformed(evt);
            }
        });

        txt_naissance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_nationalite.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nationalite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nationaliteActionPerformed(evt);
            }
        });

        txt_telephone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_telephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telephoneActionPerformed(evt);
            }
        });

        txt_adress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        chemin_photo.setBackground(new java.awt.Color(213, 173, 149));
        chemin_photo.setFont(new java.awt.Font("Courier New", 1, 11)); // NOI18N
        chemin_photo.setText("Photo");
        chemin_photo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chemin_photoActionPerformed(evt);
            }
        });

        jButtonValider.setBackground(new java.awt.Color(213, 173, 149));
        jButtonValider.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jButtonValider.setText("Enregistrer");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(213, 173, 149));
        jButton2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Dernier Diplome obtenu :");

        txt_niveau.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_niveau.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Bac", "Licence 3", "Master I", "Master II", "Doctorat" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Année obtention :");

        txt_annee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_annee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Domaine d'activité :");

        txt_domaine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_domaine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Informatique", "Hydrolique", "Chimie", "Marketing", "Electronique", "Sante", "Developpement", "Mécanique" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Statut :");

        etudiant.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etudiant.setText("Etudiant");
        etudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etudiantActionPerformed(evt);
            }
        });

        professionel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        professionel.setText("Professionnel");
        professionel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professionelActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("CV :");

        nom_CV.setBackground(new java.awt.Color(213, 173, 149));
        nom_CV.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        nom_CV.setText("Parcourir");
        nom_CV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_CVActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Email :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Mot de passe :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Retaper le mot de passe :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Question Secrète :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Réponse :");

        txt_question.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_question.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Nom de ta mere", "Village natale", "Plat préféré", "Sport favori", "Nom de ta copine" }));

        txt_reponse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_pass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_pass2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });

        txt_mesage.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        txt_mesage.setForeground(new java.awt.Color(51, 51, 255));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setText("PERSONNELLE");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addGap(106, 106, 106)
                .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(homme)
                .addGap(49, 49, 49)
                .addComponent(femme))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(txt_naissance, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(txt_nationalite, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(txt_adress, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel10)
                .addGap(7, 7, 7)
                .addComponent(txt_niveau, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(txt_annee, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txt_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(etudiant)
                .addGap(0, 0, 0)
                .addComponent(professionel))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jcheminCV, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(nom_CV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel17)
                .addGap(4, 4, 4)
                .addComponent(txt_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txt_question, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(txt_reponse, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jButtonValider)
                .addGap(19, 19, 19)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(txt_mesage, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(chemin_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel20)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chemin_photo)))
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4))
                    .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homme)
                    .addComponent(femme))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_naissance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nationalite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_adress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_niveau, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_annee, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etudiant)
                            .addComponent(professionel))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jcheminCV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nom_CV))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txt_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_question, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_reponse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonValider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(txt_mesage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hommeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hommeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hommeActionPerformed

    private void femmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femmeActionPerformed

    private void txt_prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prenomActionPerformed

    private void txt_nationaliteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nationaliteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nationaliteActionPerformed

    private void txt_telephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telephoneActionPerformed

    private void chemin_photoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chemin_photoActionPerformed
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            chemin_fichier = f.getAbsolutePath();
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(chemin_fichier).getImage().getScaledInstance(label_photo.getWidth(), label_photo.getHeight(), Image.SCALE_DEFAULT));
            label_photo.setIcon(imageIcon);
        }
        try {

            File image = new File(chemin_fichier);
            FileInputStream fichier = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] binaire = new byte[2048];

            for (int i; (i = fichier.read(binaire)) != -1;) {

                bos.write(binaire, 0, i);
            }
            photo_choisie = bos.toByteArray();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_chemin_photoActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        String chaine = "";
        String chemin2 = "";
        String nom = txt_nom.getText();
        String prenom = txt_prenom.getText();
        String sexe;
        if (homme.isSelected()) {
            sexe = homme.getLabel();
        } else {
            sexe = femme.getLabel();
        }
        String date_de_naissance = txt_naissance.getText();
        String nationalite = txt_nationalite.getText();
        String telephone = txt_telephone.getText();
        String adresse = txt_adress.getText();
        String niveau = txt_niveau.getSelectedItem().toString();
        String annee = txt_annee.getSelectedItem().toString();
        String domaine = txt_domaine.getSelectedItem().toString();
        String statut;
        if (etudiant.isSelected()) {
            statut = etudiant.getLabel();
        } else {
            statut = professionel.getLabel();
        }
        try {
            String chemin1 = jcheminCV.getText();;

            StringTokenizer st = new StringTokenizer(chemin1, "\\");
            while (st.hasMoreTokens()) {
                chemin2 += st.nextToken() + "/";
            }

            FileReader fichier = new FileReader(chemin2);
            BufferedReader buffer = new BufferedReader(fichier);
            String ligne_lue = buffer.readLine();
            while (ligne_lue != null) {
                chaine += ligne_lue + "\n";
                ligne_lue = buffer.readLine();
            }
            buffer.close();
            fichier.close();
        } catch (Exception ex) {
        }
        String cv = chaine;
        String email = txt_email.getText();
        String password = txt_pass.getText();
        String password2 = txt_pass2.getText();
        String question = txt_question.getSelectedItem().toString();
        String reponse = txt_reponse.getText();

        if(nom.length()>0 && prenom.length()>0 && sexe.length()>0 && date_de_naissance.length()>0 && nationalite.length()>0
                && telephone.length()>0 && adresse.length()>0 && niveau.length()>0 && annee.length()>0 && domaine.length()>0
                && statut.length()>0 && email.length()>0 && password.length()>0 && question.length()>0 && reponse.length()>0) {
        
            Demandeur demande = new Demandeur();
            
        if (password.equals(password2)) {
            if (!txt_id.getText().equals("")) {
                int id = Integer.parseInt(txt_id.getText());
                demande.modifier_info(id, 1, nom, prenom, sexe, date_de_naissance, nationalite, telephone, adresse,
                        niveau, annee, domaine, statut, email, password, question, reponse);
                dispose();

            } else if (txt_id.getText().equals("") && (photo_choisie !=null || cv.length()>0)) {
                demande.ajouter_demandeur(1, photo_choisie, nom, prenom, sexe, date_de_naissance, nationalite, telephone, adresse, niveau,
                        annee, domaine, statut, cv, email, password, question, reponse);
                dispose();
            } else JOptionPane.showMessageDialog(null, "Photo ou CV non selectionné !");
        } else {
            txt_mesage.setText("Les mots de passe ne sont pas identiques !");
        }
        }else {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs !");
        }
    }//GEN-LAST:event_jButtonValiderActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void etudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etudiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etudiantActionPerformed

    private void professionelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professionelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professionelActionPerformed

    private void nom_CVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_CVActionPerformed
        JFileChooser choix = new JFileChooser();
        int result = choix.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File fichier = choix.getSelectedFile();
            String nomCV = fichier.getAbsolutePath();
            jcheminCV.setText(nomCV);
        }
    }//GEN-LAST:event_nom_CVActionPerformed

    private void txt_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyPressed

    }//GEN-LAST:event_txt_idKeyPressed

    private void txt_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            label_photo.setIcon(null);
            txt_niveau.setSelectedItem(null);
                txt_annee.setSelectedItem(null);
                txt_domaine.setSelectedItem(null);
                txt_nom.setText("");
                txt_prenom.setText("");
                txt_naissance.setText("");
                txt_nationalite.setText("");
                txt_telephone.setText("");
                txt_email.setText("");
                txt_adress.setText("");
                txt_question.setSelectedItem(null);
                txt_reponse.setText("");

        }
    }//GEN-LAST:event_txt_idKeyReleased

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped
        Connection con = Connexion.BaseDeDonnee();
        Statement stat = null;
        ResultSet res = null;
        int id = 0;
        try {
            id = Integer.parseInt(txt_id.getText());
        } catch (Exception ex) {
        }
        try {

            String sql = "SELECT photo, nomDemandeur, prenomDemandeur, sexe, dateDeNaissance, nationalite, telephone,"
                    + " adresse, diplome, anneeObtention, domaine, statut, emailDemandeur, questionSecret, reponse FROM demandeur"
                    + " WHERE identifiant='" + id + "'";
            stat = con.createStatement();
            res = stat.executeQuery(sql);

            while (res.next()) {
                try {
                    byte[] img = res.getBytes("photo");
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(label_photo.getWidth(), label_photo.getHeight(), Image.SCALE_SMOOTH));
                    label_photo.setIcon(imageIcon);
                } catch (Exception ex) {
                }
                String nom = res.getString("nomDemandeur");
                String prenom = res.getString("prenomDemandeur");
                String sexe = res.getString("sexe");
                if (sexe.equals("Homme")) {
                    homme.setSelected(true);
                } else if (sexe.equals("Femme")) {
                    femme.setSelected(true);
                }
                String date_de_naissance = res.getString("dateDeNaissance");
                String nationalite = res.getString("nationalite");
                String telephone = res.getString("telephone");
                String adresse = res.getString("adresse");
                String niveau = res.getString("diplome");
                String annee = res.getString("anneeObtention");
                String domaine = res.getString("domaine");
                String statut = res.getString("statut");
                if (statut.equals("Etudiant")) {
                    etudiant.setSelected(true);
                } else if (statut.equals("Professionnel")) {
                    professionel.setSelected(true);
                }
                String question = res.getString("questionSecret");
                String reponse = res.getString("reponse");
                String email = res.getString("emailDemandeur");
                txt_niveau.setSelectedItem(niveau);
                txt_annee.setSelectedItem(annee);
                txt_domaine.setSelectedItem(domaine);
                txt_nom.setText(nom);
                txt_prenom.setText(prenom);
                txt_naissance.setText(date_de_naissance);
                txt_nationalite.setText(nationalite);
                txt_telephone.setText(telephone);
                txt_email.setText(email);
                txt_adress.setText(adresse);
                txt_question.setSelectedItem(question);
                txt_reponse.setText(reponse);

            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
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

    }//GEN-LAST:event_txt_idKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chemin_photo;
    private javax.swing.JRadioButton etudiant;
    private javax.swing.JRadioButton femme;
    private javax.swing.ButtonGroup groupSexe;
    private javax.swing.ButtonGroup groupStatut;
    private javax.swing.JRadioButton homme;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jcheminCV;
    private javax.swing.JLabel label_photo;
    private javax.swing.JButton nom_CV;
    private javax.swing.JRadioButton professionel;
    private javax.swing.JTextField txt_adress;
    private javax.swing.JComboBox txt_annee;
    private javax.swing.JComboBox txt_domaine;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JLabel txt_mesage;
    private javax.swing.JTextField txt_naissance;
    private javax.swing.JTextField txt_nationalite;
    private javax.swing.JComboBox txt_niveau;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JPasswordField txt_pass2;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JComboBox txt_question;
    private javax.swing.JTextField txt_reponse;
    private javax.swing.JTextField txt_telephone;
    // End of variables declaration//GEN-END:variables
String chemin_fichier = null;
byte[] photo_choisie = null;
}
