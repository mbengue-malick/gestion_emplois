package gestionemploi;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Depot_Offre extends javax.swing.JFrame {

    public Depot_Offre() {
        initComponents();
        setTitle("Poster un offre");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setIconImage(new ImageIcon(getClass().getResource("/gestionemploi/Logo_Entreprise/jobs.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_offre = new javax.swing.JTextArea();
        Deposer = new javax.swing.JButton();
        Annuler = new javax.swing.JButton();
        id_offre = new javax.swing.JLabel();
        txt_poste = new javax.swing.JTextField();
        txt_date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        id_offre1 = new javax.swing.JLabel();
        id_offre2 = new javax.swing.JLabel();
        id_offre3 = new javax.swing.JLabel();
        txt_domaine = new javax.swing.JTextField();
        txt_adresse = new javax.swing.JTextField();
        txt_entreprise = new javax.swing.JTextField();
        modifier = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 204, 173));

        txt_offre.setColumns(20);
        txt_offre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_offre.setRows(5);
        jScrollPane1.setViewportView(txt_offre);

        Deposer.setBackground(new java.awt.Color(213, 173, 149));
        Deposer.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        Deposer.setText("Deposer");
        Deposer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeposerActionPerformed(evt);
            }
        });

        Annuler.setBackground(new java.awt.Color(213, 173, 149));
        Annuler.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        Annuler.setText("Annuler");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });

        id_offre.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        id_offre.setText("Nom Entreprise :");

        txt_poste.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_poste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_posteActionPerformed(evt);
            }
        });
        txt_poste.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_posteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_posteKeyTyped(evt);
            }
        });

        txt_date.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setText("Date d'expiration :");

        id_offre1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        id_offre1.setText("Domaine :");

        id_offre2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        id_offre2.setText("Adresse :");

        id_offre3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        id_offre3.setText("Poste :");

        txt_domaine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txt_adresse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txt_entreprise.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        modifier.setBackground(new java.awt.Color(213, 173, 149));
        modifier.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        modifier.setText("Modifier");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID :");

        txt_id.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_idKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(id_offre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id_offre2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(id_offre1)
                                    .addComponent(id_offre3))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_poste)
                        .addComponent(txt_domaine)
                        .addComponent(txt_adresse))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_entreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Deposer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_entreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(id_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_offre2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_offre1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_poste, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_offre3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deposer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeposerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeposerActionPerformed

        String entreprise = txt_entreprise.getText();
        String adresse = txt_adresse.getText();
        String poste = txt_poste.getText();
        String domaine = txt_domaine.getText();
        String date = txt_date.getText();
        String offre = txt_offre.getText();
        Connection con = Connexion.BaseDeDonnee();
        Statement stat = null;
        if (entreprise.length() > 0 && adresse.length() > 0 && poste.length() > 0 && domaine.length() > 0 && date.length() > 0 && offre.length() > 0) {

            String sql = "INSERT INTO offre(Poste,typeOffre,NomEntreprise,Adresse,Domaine,DateExpiration) "
                    + "VALUES('" + poste + "','" + offre + "','" + entreprise + "','" + adresse + "','" + domaine + "','" + date + "')";
            //System.out.println(sql);
            try {
                stat = con.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Vous avez poster un offre ");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (stat != null) {
                    stat.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
        }
    }//GEN-LAST:event_DeposerActionPerformed

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
        dispose();
    }//GEN-LAST:event_AnnulerActionPerformed

    private void txt_posteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_posteActionPerformed

    }//GEN-LAST:event_txt_posteActionPerformed

    private void txt_posteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_posteKeyTyped

    }//GEN-LAST:event_txt_posteKeyTyped

    private void txt_posteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_posteKeyPressed


    }//GEN-LAST:event_txt_posteKeyPressed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed

        String adresse = txt_adresse.getText();
        String poste = txt_poste.getText();
        String domaine = txt_domaine.getText();
        String date = txt_date.getText();
        String offre = txt_offre.getText();
        int id = 0;
        try {
            id = Integer.parseInt(txt_id.getText());
        } catch (NumberFormatException ex) {
        }

        Connection con = Connexion.BaseDeDonnee();
        Statement stat = null;
            if (adresse.length() > 0 && poste.length() > 0 && domaine.length() > 0 && date.length() > 0 && offre.length() > 0) {
                String sql = "UPDATE offre SET Poste='" + poste + "',typeOffre='" + offre + "',Adresse='" + adresse + "',"
                        + "Domaine='" + domaine + "',DateExpiration='" + date + "' WHERE idOffre=" + id;
                //System.out.println(sql);
                try {
                    stat = con.createStatement();
                    stat.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Offre modifié ");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                try {
                    if (stat != null) {
                        stat.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Veuillez remplir les champs vides ");
            }
        
    }//GEN-LAST:event_modifierActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped
        Connection con = Connexion.BaseDeDonnee();
        Statement stat = null;
        ResultSet res = null;
        int id = 0;
        try {
            id = Integer.parseInt(txt_id.getText());
        } catch (NumberFormatException ex) {
        }
        String sql = "SELECT * FROM offre where idOffre=" + id;
        try {
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            while (res.next()) {
                txt_entreprise.setText(res.getString("NomEntreprise"));
                txt_poste.setText(res.getString("Poste"));
                txt_adresse.setText(res.getString("Adresse"));
                txt_domaine.setText(res.getString("Domaine"));
                txt_date.setText(res.getString("DateExpiration"));
                txt_offre.setText(res.getString("typeOffre"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txt_idKeyTyped

    private void txt_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            txt_entreprise.setText("");
            txt_poste.setText("");
            txt_adresse.setText("");
            txt_domaine.setText("");
            txt_date.setText("");
            txt_offre.setText("");
        }
    }//GEN-LAST:event_txt_idKeyPressed

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
            java.util.logging.Logger.getLogger(Depot_Offre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Depot_Offre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Depot_Offre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Depot_Offre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Depot_Offre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JButton Deposer;
    private javax.swing.JLabel id_offre;
    private javax.swing.JLabel id_offre1;
    private javax.swing.JLabel id_offre2;
    private javax.swing.JLabel id_offre3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifier;
    private javax.swing.JTextField txt_adresse;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_domaine;
    private javax.swing.JTextField txt_entreprise;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextArea txt_offre;
    private javax.swing.JTextField txt_poste;
    // End of variables declaration//GEN-END:variables
}
