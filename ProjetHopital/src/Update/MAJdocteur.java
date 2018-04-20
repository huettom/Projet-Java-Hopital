/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Update;

import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;
import projethopital.ChoixAction;
import projethopital.Connexion;
import AjouterSupp.*;

/**
 *
 * @author tomhuet
 */
public class MAJdocteur extends JFrame {
    
    public MAJdocteur() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SERomand", 0, 70)); // NOI18N
        jLabel1.setText("Update Docteur");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 30, 1180, 160);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(330, 210, 260, 60);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(330, 290, 260, 60);
        

        

        jLabel2.setText("Numero");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 230, 90, 20);

        jLabel3.setText("Specialité");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 310, 90, 20);

        

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(710, 260, 200, 80);

        jButton3.setText("Retour");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1180, 630, 150, 60);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1347, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
    }                     
                             

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        new ChoixAction().setVisible(true);
        this.setVisible(false);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.up();
    }
    
    public void up() {
        
        try{
                
            Connexion maconnexion = new Connexion(nomBDD, login, password);
            
            requete1 = "UPDATE `docteur` SET `numero`='"+jTextField1.getText()+"',`specialite`='"+jTextField2.getText()+"' WHERE `docteur`.`numero`="+jTextField1.getText()+"";
            
            maconnexion.executeUpdate(requete1);
            
            System.out.println("Update !");
            
            }
            catch(SQLException | ClassNotFoundException e) {
            System.out.println("Vous n'êtes pas connecté à la base de donnée.");
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
            java.util.logging.Logger.getLogger(MAJchambre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAJchambre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAJchambre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAJchambre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MAJchambre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    protected String nomBDD = "hopital";
    protected String login = "root";
    protected String password = "root";
    protected String requete1;
    protected ArrayList<String> listerequete;
    private Connexion maconnexion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    

    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    
    // End of variables declaration
    
}
