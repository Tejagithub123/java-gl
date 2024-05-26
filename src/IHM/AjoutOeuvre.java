
package IHM;

/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Utility.BibalExceptions;
import Utility.DBConnection;
import Utility.ModelTableau;
import static Utility.Utility.closeStatementResultSet;
import static Utility.Utility.initialiseRequetePreparee;
import static Utility.Utility.showMessageSucces;
import control.OeuvreControl;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import Modele.Livre;
import Modele.Magazine;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modele.Oeuvre;
import java.awt.Frame;




public class AjoutOeuvre extends javax.swing.JFrame {

    public AjoutOeuvre(Frame parent, boolean modal) {
        
        initComponents();
        setIdentifiant();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        typeOeuvreCombo = new javax.swing.JComboBox<>();
        identifiantField = new javax.swing.JTextField();
        titreField = new javax.swing.JTextField();
        auteurField = new javax.swing.JTextField();
        categorieField = new javax.swing.JTextField();
        annulerBouton = new javax.swing.JButton();
        ajouterBouton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Ajouter Oeuvre");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 92, 92));
        jLabel2.setText("Type de l'oeuvre ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 92, 92));
        jLabel3.setText("Identifiant ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(108, 92, 92));
        jLabel4.setText("Titre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(108, 92, 92));
        jLabel5.setText("Auteur");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(108, 92, 92));
        jLabel6.setText("Catégorie");

        typeOeuvreCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livre", "Magazine" }));

        identifiantField.setEnabled(false);

        annulerBouton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        annulerBouton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Apps-Dialog-Close-icon.png"))); // NOI18N
        annulerBouton.setText("Annuler");
        annulerBouton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        annulerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBoutonActionPerformed(evt);
            }
        });

        ajouterBouton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ajouterBouton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ajouter.png"))); // NOI18N
        ajouterBouton.setText("Ajouter");
        ajouterBouton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ajouterBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(categorieField)
                    .addComponent(identifiantField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titreField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(auteurField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(typeOeuvreCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 156, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(annulerBouton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ajouterBouton)
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(typeOeuvreCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addComponent(identifiantField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(titreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(auteurField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(categorieField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annulerBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajouterBouton))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void annulerBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBoutonActionPerformed
        // TODO add your handling code here:
          this.dispose();
    }//GEN-LAST:event_annulerBoutonActionPerformed

    private void ajouter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter
        // TODO add your handling code here:
        try {
            Oeuvre oeuvre = getOeuvreInfos();
            OeuvreControl.ajouter(oeuvre);
            ((ModelTableau) GestionOeuvresExemplaires.tableListeOeuvre.getModel())
                    .addRow(
                            new Object[]{oeuvre.getId(), oeuvre.getTitre(), oeuvre.getAuteur(),
                                oeuvre.getCategorie(), oeuvre.getClass().getSimpleName(), 0, 0});
            setIdentifiant();
            clearField();
            showMessageSucces("Oeuvre ajoutée avec succées");
        } catch (BibalExceptions e) {
            System.out.println("IHM.AjoutOeuvre.ajouterBoutonActionPerformed()");
        }
    }//GEN-LAST:event_ajouter

//factory
    private Oeuvre getOeuvreInfos() {
        int identifiant = Integer.parseInt(identifiantField.getText());
        String titre = titreField.getText();
        String auteur = auteurField.getText();
        String categorie = categorieField.getText();
        String typeOeuvre = typeOeuvreCombo.getSelectedItem().toString();

        if (typeOeuvre.equals(Magazine.class.getSimpleName())) {
            return new Magazine(identifiant, titre, auteur, categorie);
        }
        return new Livre(identifiant, titre, auteur, categorie);
    }

 

    private void clearField() {
        titreField.setText("");
        auteurField.setText("");
        categorieField.setText("");
    }

    private void setIdentifiant() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            final String SQL_SELECT_ID = "SELECT id FROM oeuvre ORDER BY id DESC LIMIT 1";
            preparedStatement = initialiseRequetePreparee(DBConnection.getConnection(),
                    SQL_SELECT_ID, new Object[0]);
            resultSet = preparedStatement.executeQuery();
            int identifiant = 1;
            if (resultSet.first()) {
                identifiant = resultSet.getInt("id");
            }
            identifiantField.setText((identifiant + 1) + "");
        } catch (SQLException | BibalExceptions e) {
            JOptionPane.showMessageDialog(null, "Erreurs d'accées a  la base de données",
                    "Erreurs", JOptionPane.ERROR_MESSAGE);
        } finally {
            closeStatementResultSet(preparedStatement, resultSet);
        }
    }
   
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterBouton;
    private javax.swing.JButton annulerBouton;
    private javax.swing.JTextField auteurField;
    private javax.swing.JTextField categorieField;
    private javax.swing.JTextField identifiantField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField titreField;
    private javax.swing.JComboBox<String> typeOeuvreCombo;
    // End of variables declaration//GEN-END:variables
}
