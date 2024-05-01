package IHM;


import Utility.BibalExceptions;
import Utility.ModelTableau;
import static Utility.Utility.showMessageSucces;
import control.EmpruntControl;
import control.ExemplaireControl;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showConfirmDialog;
import Modele.Exemplaire;
import Modele.Livre;
import Modele.Magazine;
import Modele.Oeuvre;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class GestionExemplaires extends javax.swing.JFrame {

    /**
     * Creates new form GestionExemplaires
     */
     public GestionExemplaires(Frame parent, boolean modal) {
        
        initComponents();
        tableExemplaires.setModel(new ModelTableau(new Object[0][0],
                new String[]{"ID", "Etat"}));
        tableExemplaires.setRowHeight(30);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));
    
    }
private Object dataLigneSelected[];
    public GestionExemplaires(Frame parent, boolean modal,Oeuvre oeuvre) {
        this(parent, modal);

        identifiantLabelValue.setText(oeuvre.getId() + "");
        titreLabelValue.setText(oeuvre.getTitre());
        categorieLabelValue.setText(oeuvre.getCategorie());
        typeOeuvreLabelValue.setText(oeuvre.getClass().getSimpleName());
        auteurLabelValue.setText(oeuvre.getAuteur());
        nbExemplaireLabelValue.setText(oeuvre.getExamplairesOeuvre().size() + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        identifiantLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categorieLabel = new javax.swing.JLabel();
        identifiantLabelValue = new javax.swing.JLabel();
        titreLabelValue = new javax.swing.JLabel();
        categorieLabelValue = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        auteurLabel = new javax.swing.JLabel();
        nbExemplaire = new javax.swing.JLabel();
        typeOeuvreLabelValue = new javax.swing.JLabel();
        auteurLabelValue = new javax.swing.JLabel();
        nbExemplaireLabelValue = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ajouterButton = new javax.swing.JButton();
        afficherButton = new javax.swing.JButton();
        modifierButton = new javax.swing.JButton();
        retirerButton = new javax.swing.JButton();
        annulerButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableExemplaires = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Fiche Oeuvre");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        identifiantLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        identifiantLabel.setForeground(new java.awt.Color(108, 92, 92));
        identifiantLabel.setText("Identifiant");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 92, 92));
        jLabel3.setText("Titre");

        categorieLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        categorieLabel.setForeground(new java.awt.Color(108, 92, 92));
        categorieLabel.setText("Catégorie");

        identifiantLabelValue.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        identifiantLabelValue.setText("1");

        titreLabelValue.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        titreLabelValue.setText("1");

        categorieLabelValue.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        categorieLabelValue.setText("1");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(108, 92, 92));
        jLabel8.setText("Type d'oeuvre");

        auteurLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        auteurLabel.setForeground(new java.awt.Color(108, 92, 92));
        auteurLabel.setText("Auteur");

        nbExemplaire.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nbExemplaire.setForeground(new java.awt.Color(108, 92, 92));
        nbExemplaire.setText("Nombre d'exmplaire");

        typeOeuvreLabelValue.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        typeOeuvreLabelValue.setText("1");

        auteurLabelValue.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        auteurLabelValue.setText("1");

        nbExemplaireLabelValue.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nbExemplaireLabelValue.setText("1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3))
                    .addComponent(categorieLabel)
                    .addComponent(identifiantLabel))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(identifiantLabelValue)
                    .addComponent(categorieLabelValue)
                    .addComponent(titreLabelValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(auteurLabel)
                    .addComponent(nbExemplaire))
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(typeOeuvreLabelValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(auteurLabelValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbExemplaireLabelValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(typeOeuvreLabelValue)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(identifiantLabel)
                            .addComponent(identifiantLabelValue))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(titreLabelValue)
                    .addComponent(auteurLabelValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categorieLabel)
                    .addComponent(categorieLabelValue)
                    .addComponent(nbExemplaire)
                    .addComponent(nbExemplaireLabelValue))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addComponent(auteurLabel)
                .addGap(59, 59, 59))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ajouterButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ajouterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ajouter.png"))); // NOI18N
        ajouterButton.setText("Ajouter");
        ajouterButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ajouterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterButtonActionPerformed(evt);
            }
        });

        afficherButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        afficherButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Programming-Show-Property-icon.png"))); // NOI18N
        afficherButton.setText("Afficher");
        afficherButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        afficherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficherButtonActionPerformed(evt);
            }
        });

        modifierButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        modifierButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modifier.png"))); // NOI18N
        modifierButton.setText("Modifier");
        modifierButton.setEnabled(false);
        modifierButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        modifierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierButtonActionPerformed(evt);
            }
        });

        retirerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        retirerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/supprimer.png"))); // NOI18N
        retirerButton.setText("Retirer");
        retirerButton.setEnabled(false);
        retirerButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        retirerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirerButtonActionPerformed(evt);
            }
        });

        annulerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        annulerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Apps-Dialog-Close-icon.png"))); // NOI18N
        annulerButton.setText("Annuler");
        annulerButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        annulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modifierButton)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(retirerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(annulerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(afficherButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ajouterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ajouterButton)
                .addGap(26, 26, 26)
                .addComponent(afficherButton)
                .addGap(33, 33, 33)
                .addComponent(modifierButton)
                .addGap(33, 33, 33)
                .addComponent(retirerButton)
                .addGap(18, 18, 18)
                .addComponent(annulerButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exemplaire", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tableExemplaires.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Etat"
            }
        ));
        tableExemplaires.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableExemplairesMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tableExemplaires);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
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

    private void ajouterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterButtonActionPerformed
        // TODO add your handling code here:
         Oeuvre oeuvre = getOeuvreInfos();
        if (null != oeuvre) {
            AjoutExemplaire ajoutExemplaire = new AjoutExemplaire(null, true, oeuvre);
            ajoutExemplaire.setLocationRelativeTo(null);
            ajoutExemplaire.setVisible(true);
        }
    }//GEN-LAST:event_ajouterButtonActionPerformed

    private void annulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_annulerButtonActionPerformed

    private void modifierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierButtonActionPerformed
        // TODO add your handling code here:
         Exemplaire exemplaire = getExempalireInfos();
        if (null != exemplaire) {
            ModificationExemplaire modificationExemplaire
                    = new ModificationExemplaire(null, true, exemplaire);
            modificationExemplaire.setLocationRelativeTo(null);
            modificationExemplaire.setVisible(true);
        }
    }//GEN-LAST:event_modifierButtonActionPerformed

    private void afficherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherButtonActionPerformed
        // TODO add your handling code here:
         try {
            Oeuvre oeuvre = getOeuvreInfos();
            ArrayList<Exemplaire> listExemplaires = ExemplaireControl.find(oeuvre);
            if (null != listExemplaires) {
                fillExemplaireJtable(listExemplaires);
            } else {
                showMessageSucces("Aucun exemplaire trouvé");
            }

        } catch (BibalExceptions e) {
            System.out.println("IHM.GestionOeuvre.afficherButtonActionPerformed()");
        }
    }//GEN-LAST:event_afficherButtonActionPerformed

    private void retirerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirerButtonActionPerformed
        // TODO add your handling code here:
          String message = "\nSupprimer cet exempalaire ?\n"
                + "Cela supprimera aussi tous les emprunts de cet exemplaire\n";

        int reponse = showConfirmDialog(null, message,
                "Avertissement", JOptionPane.OK_CANCEL_OPTION);
        if (reponse == JOptionPane.OK_OPTION) {
            try {
                Exemplaire exemplaire = getExempalireInfos();
                if (null != exemplaire) {
                    EmpruntControl.supprimer(exemplaire);
                    ExemplaireControl.supprimer(exemplaire);
                    ((ModelTableau) tableExemplaires.getModel()).removeRow(tableExemplaires.getSelectedRow());
                    showMessageSucces("L'exemplaire a bien été supprimée");
                    modifierButton.setEnabled(false);
                    retirerButton.setEnabled(false);
                }

            } catch (BibalExceptions ex) {
                System.out.println("IHM.Exemplaires.retirerButtonActionPerformed()" + ex.getMessage());
            }          }
    }//GEN-LAST:event_retirerButtonActionPerformed

    private void tableExemplairesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableExemplairesMouseReleased
        // TODO add your handling code here:
            int row = tableExemplaires.getSelectedRow();
        int nbreCol = tableExemplaires.getColumnCount();

        dataLigneSelected = new Object[nbreCol];
        if (row >= 0) {
            for (int i = 0; i < nbreCol; i++) {
                dataLigneSelected[i] = tableExemplaires.getModel().getValueAt(row, i);
            }
            modifierButton.setEnabled(true);
            retirerButton.setEnabled(true);
        } else {
            modifierButton.setEnabled(false);
                 retirerButton.setEnabled(false);}
    }//GEN-LAST:event_tableExemplairesMouseReleased
    private Oeuvre getOeuvreInfos() {
        int id = Integer.parseInt(identifiantLabelValue.getText());
        String titre = titreLabelValue.getText();
        String auteur = auteurLabelValue.getText();
        String categorie = categorieLabelValue.getText();
        String typeOeuvre = typeOeuvreLabelValue.getText();
        Oeuvre oeuvre;
        if (typeOeuvre.equals(Magazine.class.getSimpleName())) {
            oeuvre = new Magazine(id, titre, auteur, categorie);
        } else {
            oeuvre = new Livre(id, titre, auteur, categorie);
        }
        return oeuvre;
    }

    private Exemplaire getExempalireInfos() {
        int id = Integer.parseInt(dataLigneSelected[0].toString());
        String etatExemplaire = dataLigneSelected[1].toString();
        return new Exemplaire(id, etatExemplaire);
    }

    private void fillExemplaireJtable(ArrayList<Exemplaire> listExemplaires) {
        String titre[] = new String[]{"ID", "Etat"};
        if (listExemplaires.size() > 0) {
//            pour le findByID si l'objet ajouté est null
            int nbLigne = (null == listExemplaires.get(0)) ? 0 : listExemplaires.size();
            Object data[][] = new Object[nbLigne][titre.length];
            for (int i = 0; i < nbLigne; i++) {
                Exemplaire exemplaire = listExemplaires.get(i);
                data[i][0] = exemplaire.getId();
                data[i][1] = exemplaire.getEtat();
            }
            ModelTableau model = new ModelTableau(data, titre);
            tableExemplaires.setModel(model);
            tableExemplaires.setRowHeight(30);
        } else {
            //afficher tableau vide
            Object data[][] = new Object[1][titre.length];
            ModelTableau model = new ModelTableau(data, titre);
            tableExemplaires.setModel(model);
            tableExemplaires.setRowHeight(1);
        }
        modifierButton.setEnabled(false);
        retirerButton.setEnabled(false);
    }

   
        public static void setNbExemplaireLabelValue(String value) {
        GestionExemplaires.nbExemplaireLabelValue.setText(value);
    }

    public static String getNbExemplaireLabelValue() {
        return nbExemplaireLabelValue.getText();
    }
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afficherButton;
    private javax.swing.JButton ajouterButton;
    private javax.swing.JButton annulerButton;
    private javax.swing.JLabel auteurLabel;
    private javax.swing.JLabel auteurLabelValue;
    private javax.swing.JLabel categorieLabel;
    private javax.swing.JLabel categorieLabelValue;
    private javax.swing.JLabel identifiantLabel;
    private javax.swing.JLabel identifiantLabelValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifierButton;
    private javax.swing.JLabel nbExemplaire;
    private static javax.swing.JLabel nbExemplaireLabelValue;
    private javax.swing.JButton retirerButton;
    public static javax.swing.JTable tableExemplaires;
    private javax.swing.JLabel titreLabelValue;
    private javax.swing.JLabel typeOeuvreLabelValue;
    // End of variables declaration//GEN-END:variables
}
