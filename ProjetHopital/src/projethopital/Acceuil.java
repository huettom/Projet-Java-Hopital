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
public class Acceuil extends JFrame {
               
    public Acceuil() {
        initComponents();
        //lancer();
    }
    
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 766));

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 766));
        jPanel1.setLayout(null);
        
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jPanel1.add(jTextArea1);
        jTextArea1.setBounds(640, 180, 430, 290);

        jLabel2.setFont(new java.awt.Font("SERomand", 0, 70)); // NOI18N
        jLabel2.setText("Accueil");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, -10, 310, 260);

        jLabel3.setFont(new java.awt.Font("SERomand", 1, 48)); // NOI18N
        jLabel3.setText("Connexion Locale");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 580, 520, 70);

        jLabel4.setFont(new java.awt.Font("SERomand", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Connexion Distante");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(660, 580, 570, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sim97\\Desktop\\Simon\\ECE-ING3\\ECE-Paris\\Informatique - Java\\HopitalInteraceGraphique\\aerial-view-3292550_1280.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 766));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 770);

        jButton1.setBackground(new java.awt.Color(173, 192, 192));
        jButton1.setFont(new java.awt.Font("SERomand", 0, 48)); // NOI18N
        jButton1.setText("Connexion Distante");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(false);
        /*jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });*/
        jPanel1.add(jButton1);
        jButton1.setBounds(660, 580, 570, 70);

        jButton2.setBackground(new java.awt.Color(173, 192, 192));
        jButton2.setFont(new java.awt.Font("SERomand", 0, 48)); // NOI18N
        jButton2.setText("Connexion Locale");
        jButton2.setToolTipText("");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(false);
        /*jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });*/
        jPanel1.add(jButton2);
        jButton2.setBounds(100, 580, 520, 70);

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
    }
    
    public void lancer() {
        try{
                
            Connexion maconnexion = new Connexion(nomBDD, login, password);
            
            //requete
            requete1 = "SELECT * FROM `hopital`.`infirmier` WHERE `rotation` = 'NUIT'";
            listerequete = maconnexion.remplirChampsRequete(requete1);
            System.out.println(listerequete);
            
            //Affichage en fenetre
            jTextArea1.setText("Voila la requete: " + listerequete);
            //setVisible(true);
            
            
            }
            catch(SQLException | ClassNotFoundException e) {
            System.out.println("Vous n'êtes pas connecté à la base de donnée.");
            }
    }
    
    public static void main(String args[]) {
        
        System.out.println("salut");
        
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
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Acceuil ac = new Acceuil();
                System.out.println("salut");
                ac.lancer();
                ac.setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration
    protected Connexion maconnexion;
    protected String nomBDD = "hopital";
    protected String login = "root";
    protected String password = "root";
    protected String requete1;
    protected ArrayList<String> listerequete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    protected javax.swing.JTextArea jTextArea1;
    // End of variables declaration  
    
    
}
