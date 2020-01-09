/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionemploi;

import java.awt.Container;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.sql.PreparedStatement;
import javax.swing.table.TableModel;


public class EspaceDemandeur extends javax.swing.JFrame {

    /**
     * Creates new form EspaceDemandeur
     */
    public EspaceDemandeur() {
        initComponents();
        setTitle("Espace des demandeurs d'emploi");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/gestionemploi/Logo_Entreprise/jobs.png")).getImage());
        Afficher_Table_Entreprise();

    }
    int pos = 0;

    
/**
 * Creation d'une liste qui contient toutes les entreprises enregistrer dans la base de donnee.
 * Cette liste est de type arraylist cela permettra toute type d'information
 * @return 
 */
    public ArrayList<Entreprise> getListEntreprise() {
        ArrayList<Entreprise> listEntreprise = new ArrayList<Entreprise>();
        Connection con = Connexion.BaseDeDonnee();
        Statement stat = null;
        ResultSet res = null;
        String sql = "SELECT * FROM entreprise";
        try {
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            Entreprise societe;
            while (res.next()) {
                societe = new Entreprise(res.getInt("matricule"), res.getBytes("logo"), res.getString("nomEntreprise"), res.getString("telephone"),
                        res.getString("adressePostal"), res.getString("domaine"), res.getString("emailEntreprise"));
                //Afficher_Table_Entreprise();
                listEntreprise.add(societe);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listEntreprise;
    }

 /** 
  * Afficher le contenu de la liste des entreprises dans un JTable
  */
  
    public void Afficher_Table_Entreprise() {
        ArrayList<Entreprise> list = getListEntreprise();
        DefaultTableModel model = (DefaultTableModel) table_entreprise.getModel();

//Effacer le contenu du JTable
        model.setRowCount(0);
//Creation du nombre de clonne en fonction du nombre d'attribut
        Object[] colonne = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            colonne[0] = list.get(i).getNom();
            colonne[1] = list.get(i).getDomaine();
            colonne[2] = list.get(i).getAdresse();
            colonne[3] = list.get(i).getTelephone();
            colonne[4] = list.get(i).getEmail();

            model.addRow(colonne);
        }
    }

/**
 * Cette methode va permettre d'extraire des informations et de les afficher dans des JLabel ou des TextField
 * @param index 
 */
    public void Vu(int index) {

        txt_id.setText(Integer.toString(getListEntreprise().get(index).getMatricule()));
        txt_domaine.setText((getListEntreprise().get(index).getDomaine()));
        byte[] img = (getListEntreprise().get(index).getLogo());
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(label_photo.getWidth(), label_photo.getHeight(), Image.SCALE_SMOOTH));
        label_photo.setIcon(imageIcon);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_entreprise = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        label_photo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_demandeur = new javax.swing.JTable();
        txt_domaine = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_demandeur1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        suivant = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        precedent1 = new javax.swing.JButton();
        precedent2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 204, 173));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setLayout(null);

        table_entreprise.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        table_entreprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Domaine d'activité", "Adresse", "Téléphone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_entreprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_entrepriseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_entreprise);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(290, 60, 580, 350);
        jPanel1.add(jScrollBar1);
        jScrollBar1.setBounds(590, 240, 17, 48);

        label_photo.setText("                                       LOGO");
        jPanel1.add(label_photo);
        label_photo.setBounds(10, 60, 270, 180);

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 260, 40, 40);

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        jPanel1.add(txt_id);
        txt_id.setBounds(70, 260, 50, 40);

        table_demandeur.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        table_demandeur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prenom", "Nom", "Sexe", "Domaine d'activité"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_demandeur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_demandeurMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_demandeur);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(300, 60, 570, 350);

        txt_domaine.setEditable(false);
        txt_domaine.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jPanel1.add(txt_domaine);
        txt_domaine.setBounds(400, 20, 240, 30);

        table_demandeur1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        table_demandeur1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prenom", "Nom", "Sexe", "Domaine d'activité"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_demandeur1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_demandeur1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_demandeur1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(300, 60, 570, 350);

        jButton4.setBackground(new java.awt.Color(213, 173, 149));
        jButton4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionemploi/logout.png"))); // NOI18N
        jButton4.setText("Quiter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(760, 430, 110, 40);

        suivant.setBackground(new java.awt.Color(213, 173, 149));
        suivant.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        suivant.setText("Suivant");
        suivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suivantActionPerformed(evt);
            }
        });
        jPanel1.add(suivant);
        suivant.setBounds(460, 430, 160, 40);

        jButton1.setBackground(new java.awt.Color(213, 173, 149));
        jButton1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jButton1.setText("< Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 0, 100, 30);

        precedent1.setBackground(new java.awt.Color(213, 173, 149));
        precedent1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        precedent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionemploi/delete_16x16.gif"))); // NOI18N
        precedent1.setText("Supprimer");
        precedent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precedent1ActionPerformed(evt);
            }
        });
        jPanel1.add(precedent1);
        precedent1.setBounds(10, 430, 180, 40);

        precedent2.setBackground(new java.awt.Color(213, 173, 149));
        precedent2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        precedent2.setText("Precedent");
        precedent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precedent2ActionPerformed(evt);
            }
        });
        jPanel1.add(precedent2);
        precedent2.setBounds(290, 430, 159, 40);

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setText("Domaine :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 20, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void table_entrepriseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_entrepriseMouseClicked
        int index = table_entreprise.getSelectedRow();
        Vu(index);
    }//GEN-LAST:event_table_entrepriseMouseClicked

    private void table_demandeurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_demandeurMouseClicked
        int index = table_demandeur.getSelectedRow();
        Vu(index);
    }//GEN-LAST:event_table_demandeurMouseClicked

    private void table_demandeur1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_demandeur1MouseClicked
        int index = table_demandeur.getSelectedRow();
        Vu(index);
    }//GEN-LAST:event_table_demandeur1MouseClicked

    private void suivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suivantActionPerformed
        pos++;
        if (pos >= getListEntreprise().size()) {
            pos = getListEntreprise().size() - 1;
        }
        Vu(pos);
    }//GEN-LAST:event_suivantActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GestionDemandeur acceuil = new GestionDemandeur();
        acceuil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void precedent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precedent1ActionPerformed
        Connection con = Connexion.BaseDeDonnee();
        PreparedStatement stat = null;
        ResultSet res = null;
        String id = txt_id.getText();
        JOptionPane jop = new JOptionPane();
        try {
            String passe = jop.showInputDialog(null, " Mot de passe !", "Administrateur !", JOptionPane.QUESTION_MESSAGE);
            if (passe.equals("secret")) {

                try {
                    String sql = "DELETE FROM entreprise WHERE matricule=? ";

                    stat = con.prepareStatement(sql);
                    stat.setString(1, id);
                    stat.execute();
                    Afficher_Table_Entreprise();
                //JOptionPane.showMessageDialog(null, "Demandeur supprimé !");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                } finally {

                    try {

                        res.close();
                        stat.close();
                        con.close();

                    } catch (Exception e) {

                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Mot de passe incorrecte !");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_precedent1ActionPerformed

    private void precedent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precedent2ActionPerformed
        pos--;
        if (pos < 0) {
            pos = 0;
        }
        Vu(pos);
    }//GEN-LAST:event_precedent2ActionPerformed

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
            java.util.logging.Logger.getLogger(EspaceDemandeur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EspaceDemandeur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EspaceDemandeur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EspaceDemandeur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EspaceDemandeur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_photo;
    private javax.swing.JButton precedent1;
    private javax.swing.JButton precedent2;
    private javax.swing.JButton suivant;
    private javax.swing.JTable table_demandeur;
    private javax.swing.JTable table_demandeur1;
    private javax.swing.JTable table_entreprise;
    private javax.swing.JTextField txt_domaine;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
