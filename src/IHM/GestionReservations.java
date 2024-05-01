/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;
import Utility.BibalExceptions;
import Utility.DBConnection;
import static Utility.Utility.closeStatementResultSet;
import static Utility.Utility.initialiseRequetePreparee;
import static Utility.Utility.showMessageSucces;
import control.ReservationControl;
import control.UsagerControl;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.*;
import static java.lang.Integer.parseInt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modele.Usager;

public class GestionReservations extends javax.swing.JFrame {

    /**
     * Creates new form GestionReservations
     */
      public GestionReservations(Frame parent, boolean modal) {
    
        initComponents();
        setIdentifiant();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));
    }

    public GestionReservations(Frame parent, boolean modal, String titre) {
        this(parent, modal);
        this.titre = titre;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        identifiantLabel = new javax.swing.JLabel();
        nomUsagerLabel = new javax.swing.JLabel();
        identifiantUsagerCombo = new javax.swing.JComboBox<>();
        annulerBouton = new javax.swing.JButton();
        validerBouton = new javax.swing.JButton();
        nomLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Choisir Usager");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        identifiantLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        identifiantLabel.setForeground(new java.awt.Color(108, 92, 92));
        identifiantLabel.setText("Identifiant");

        nomUsagerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nomUsagerLabel.setText("-");

        identifiantUsagerCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        identifiantUsagerCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choisir Identifiant" }));
        identifiantUsagerCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identifiantUsagerComboActionPerformed(evt);
            }
        });

        annulerBouton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        annulerBouton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Apps-Dialog-Close-icon.png"))); // NOI18N
        annulerBouton.setText("Annuler");
        annulerBouton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        annulerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBoutonActionPerformed(evt);
            }
        });

        validerBouton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        validerBouton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Accept-icon.png"))); // NOI18N
        validerBouton.setText("Valider ");
        validerBouton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        validerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerBoutonemprunter(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 92, 92));
        jLabel2.setText("Nom usager ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(identifiantLabel)
                            .addComponent(jLabel2))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(identifiantUsagerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nomUsagerLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(annulerBouton)
                        .addGap(55, 55, 55)
                        .addComponent(validerBouton)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identifiantLabel)
                    .addComponent(identifiantUsagerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomUsagerLabel)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validerBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annulerBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void identifiantUsagerComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identifiantUsagerComboActionPerformed
        // TODO add your handling code here:
        try {
            int usagerId = getUsagerID();
            if (usagerId != -1) {
                Usager usager = UsagerControl.findById(usagerId);
                if (null != usager) {
                    String nom = usager.getNom() + " " + usager.getPrenom();
                    nomUsagerLabel.setText(nom);
                }
            }
        } catch (BibalExceptions ex) {
            System.out.println("IHM.Emprunter.identifiantUsagerComboActionPerformed()");
        }
    }//GEN-LAST:event_identifiantUsagerComboActionPerformed

    private void annulerBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBoutonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_annulerBoutonActionPerformed
 private int getUsagerID() {
        String id = identifiantUsagerCombo.getSelectedItem().toString();
        if (!id.equals("Choisir identifiant")) {
            return parseInt(id);
        }
        return -1;
    }
    private void validerBoutonemprunter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerBoutonemprunter
        // TODO add your handling code here:
         try {
            int usagerId = getUsagerID();
            if (usagerId != -1) {
                ReservationControl.reserver(usagerId, titre);
                showMessageSucces("Réservation enregistrée");
            } else {
                showMessageSucces("Veuillez choisir un identifiant");
            }
        } catch (BibalExceptions ex) {
            System.out.println("IHM.Reserver.validerBoutonActionPerformed()" + ex.getMessage());
        }
    }//GEN-LAST:event_validerBoutonemprunter
  private void setIdentifiant() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            final String SQL_SELECT_ID = "SELECT id FROM usager ";
            preparedStatement = initialiseRequetePreparee(DBConnection.getConnection(),
                    SQL_SELECT_ID, new Object[0]);
            resultSet = preparedStatement.executeQuery();
            int identifiant;
            while (resultSet.next()) {
                identifiant = resultSet.getInt("id");
                identifiantUsagerCombo.addItem(Integer.toString(identifiant));
            }
        } catch (SQLException | BibalExceptions e) {
            JOptionPane.showMessageDialog(null, "Erreurs d'accès à la base de données",
                    "Erreurs", JOptionPane.ERROR_MESSAGE);
        } finally {
            closeStatementResultSet(preparedStatement, resultSet);
        }
        
    }
      private String titre;
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerBouton;
    private javax.swing.JLabel identifiantLabel;
    private javax.swing.JComboBox<String> identifiantUsagerCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JLabel nomUsagerLabel;
    private javax.swing.JButton validerBouton;
    // End of variables declaration//GEN-END:variables
}
