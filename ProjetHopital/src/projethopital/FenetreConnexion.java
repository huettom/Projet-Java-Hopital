/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projethopital;

import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author tomhuet
 */
public class FenetreConnexion extends JFrame {
    
    public FenetreConnexion() {
        initComponents();
    }
    
                         
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SERomand", 0, 70)); // NOI18N
        jLabel1.setText("Connexion");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 80, 410, 160);

        jLabel2.setFont(new java.awt.Font("SERomand", 1, 48)); // NOI18N
        jLabel2.setText("BDD :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(460, 330, 170, 80);

        jLabel3.setFont(new java.awt.Font("SERomand", 1, 48)); // NOI18N
        jLabel3.setText("Identifiant :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 430, 360, 60);

        jLabel4.setFont(new java.awt.Font("SERomand", 1, 48)); // NOI18N
        jLabel4.setText("Mot de passe :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 510, 470, 90);

        jTextField2.setFont(new java.awt.Font("SERomand", 0, 24)); // NOI18N
        /*jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });*/
        jPanel1.add(jTextField2);
        jTextField2.setBounds(670, 440, 350, 50);
        

        jTextField1.setFont(new java.awt.Font("SERomand", 0, 24)); // NOI18N
        /*jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });*/
        jPanel1.add(jTextField1);
        jTextField1.setBounds(670, 340, 350, 50);

        
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setPreferredSize(new java.awt.Dimension(6, 22));
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(670, 520, 350, 50);


        jButton1.setFont(new java.awt.Font("SERomand", 0, 36)); // NOI18N
        jButton1.setText("Entrer");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 660, 200, 50);

        jButton2.setFont(new java.awt.Font("SERomand", 0, 36)); // NOI18N
        jButton2.setText("Retour");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(900, 660, 200, 50);
        

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
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        new Accueil().setVisible(true);
        this.setVisible(false);
    }    
     
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        //password = jPasswordField1.getText();
        password = "root";
        //login = jTextField2.getText();
        login = "root";
        //nomBDD = jTextField1.getText();
        nomBDD = "hopital";
        
        if((("root".equals(password))||("".equals(password)))&&("root".equals(login))&&("hopital".equals(nomBDD)))
        { 
            //new ChoixAction().setVisible(true);
            new ChoixAction().setVisible(true);
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
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FenetreConnexion ac = new FenetreConnexion();
                ac.setVisible(true);
            }
        });
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public String getNomBDD() {
        return nomBDD;
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public String password;
    public String login;
    public String nomBDD;
    // End of variables declaration
}
