/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AjouterSupp;

import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;
import Recherche.*;
import projethopital.ChoixAction;
import projethopital.Connexion;
import Update.*;


/**
 *
 * @author tomhuet
 */
public class MiseAJour extends JFrame {
    
    
    public MiseAJour() {
        initComponents();
        this.choix1=0;
        this.choix2=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
                            
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SERomand", 0, 70)); // NOI18N
        jLabel1.setText("Choix Action");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 480, 110);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("SERomand", 0, 24)); // NOI18N
        jRadioButton4.setText("Ajouter/Supprimer");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });


        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("SERomand", 0, 24)); // NOI18N
        jRadioButton6.setText("Mise à jour");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jRadioButton4)
                .addGap(95, 95, 95)
                .addGap(95, 95, 95)
                .addComponent(jRadioButton6)
                .addContainerGap(492, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(90, 190, 1250, 40);

        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1090, 680, 130, 40);

        jButton2.setText("Choix");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(440, 440, 270, 80);

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("SERomand", 0, 24)); // NOI18N
        jRadioButton9.setText("Chambre");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("SERomand", 0, 24)); // NOI18N
        jRadioButton10.setText("Docteur");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("SERomand", 0, 24)); // NOI18N
        jRadioButton11.setText("Employe");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("SERomand", 0, 24)); // NOI18N
        jRadioButton13.setText("Infirmier");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton14);
        jRadioButton14.setFont(new java.awt.Font("SERomand", 0, 24)); // NOI18N
        jRadioButton14.setText("Malade");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton15);
        jRadioButton15.setFont(new java.awt.Font("SERomand", 0, 24)); // NOI18N
        jRadioButton15.setText("Service");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jRadioButton9)
                .addGap(38, 38, 38)
                .addComponent(jRadioButton10)
                .addGap(66, 66, 66)
                .addComponent(jRadioButton11)
                .addGap(56, 56, 56)
                .addComponent(jRadioButton13)
                .addGap(85, 85, 85)
                .addComponent(jRadioButton14)
                .addGap(90, 90, 90)
                .addComponent(jRadioButton15)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 340, 1250, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );

        pack();
    }                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        new ChoixAction().setVisible(true);
        this.setVisible(false);
    }
    
    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        choix1=1;
    }                                             
                                           

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        choix2 = 1;
    }                                             

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        choix2 = 2;
    }                                              

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        choix2 = 3;
    }                                              

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        choix2 = 4;
    }                                              

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        choix2 = 5;
    }
    
    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        choix2 = 6;
    }

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        choix1=3;
    }                                             

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        //new ChoixAction().setVisible(true);
        //this.setVisible(false);
        
        if(choix1==1 && choix2==1){
            new AjoutChambre().setVisible(true);
            this.setVisible(false);
        }
        if(choix1==1 && choix2==2){
            new AjoutDocteur().setVisible(true);
            this.setVisible(false);
        }
        if(choix1==1 && choix2==3){
            new AjoutEmploye().setVisible(true);
            this.setVisible(false);
        }
        if(choix1==1 && choix2==4){
            new AjoutInfirmier().setVisible(true);
            this.setVisible(false);
        }
        if(choix1==1 && choix2==5){
            new AjoutMalade().setVisible(true);
            this.setVisible(false);
        }
        if(choix1==1 && choix2==6){
            new AjoutService().setVisible(true);
            this.setVisible(false);
        }
        if(choix1==3 && choix2==1){
            new MAJchambre().setVisible(true);
            this.setVisible(false);
        }
        if(choix1==3 && choix2==2){
            new MAJdocteur().setVisible(true);
            this.setVisible(false);
        }
        if(choix1==3 && choix2==3){
            new MAJemploye().setVisible(true);
            this.setVisible(false);
        }
    }
    
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
            java.util.logging.Logger.getLogger(MiseAJour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiseAJour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiseAJour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiseAJour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MiseAJour().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify
    private int choix1;
    private int choix2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration
    
}
