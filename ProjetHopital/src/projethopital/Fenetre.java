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
public class Fenetre extends JFrame implements ActionListener {

    protected JPanel panelprincipal,panaffichage;
    protected Connexion maconnexion;
    protected JButton recherchebutton1,recherchebutton2;
    protected String nomBDD = "hopital";
    protected String login = "root";
    protected String password = "root";
    protected String requete1;
    protected ArrayList<String> listerequete;
    
    
    public Fenetre() {
        
     //titre fenetre
     super("BDD Hopital");
     //taille de la fenetre 
     //setSize (1000, 800);
     //Nous demandons maintenant à notre objet de se positionner au centre 
     //Termine le processus lorsqu'on clique sur la croix rouge
     
     setLayout(new BorderLayout());
     setBounds(0, 0, 1000, 800);
     setLocationRelativeTo(null);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setResizable(true);
     
     //création des boutons
     recherchebutton1 = new JButton("Rechercher infirmière nuit");
     recherchebutton2 = new JButton("Rechercher autre");
     
     //création des panels
     panelprincipal = new JPanel();
     
     //ajout des boutons dans le panel
     panelprincipal.add(recherchebutton1);
     panelprincipal.add(recherchebutton2);
     
     add(panelprincipal, BorderLayout.NORTH);
     recherchebutton1.addActionListener(this);
     recherchebutton2.addActionListener(this);
     
     //setBackground(Color.BLUE);
     setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        
        if(source == recherchebutton1){
        
            try{
                
            panaffichage = new JPanel();
            Connexion maconnexion = new Connexion(nomBDD, login, password);
            
            //requete
            requete1 = "SELECT * FROM `hopital`.`infirmier` WHERE `rotation` = 'NUIT'";
            listerequete = maconnexion.remplirChampsRequete(requete1);
            System.out.println(listerequete);
            
            //Affichage en fenetre
            JTextArea textaffich = new JTextArea();
            textaffich.setText("Voila la requete: " + listerequete);
            panaffichage.add("Center", textaffich);
            add(panaffichage, BorderLayout.CENTER);
            setVisible(true);
            
            
            }
            catch(SQLException | ClassNotFoundException e) {
            System.out.println("Vous n'êtes pas connecté à la base de donnée.");
            }
            
        }
        
        if(source == recherchebutton2){
        
            try{
                
            panaffichage = new JPanel();
            Connexion maconnexion = new Connexion(nomBDD, login, password);
            
            int id= 93;
            String nom = "Lhuillier"; String prenom = "Simon";
            String adresse = "quelque part"; String tele= "06 14 13 12 11";// Adresse à ajouter //

//lancer ajouter quelqu'un
            requete1 = "INSERT INTO `employe`(`numero`, `nom`,`prenom`, `adresse`, `tel`) "
                + "VALUES('"+id+"','"+nom+"','"+prenom+"','"+adresse+"','"+tele+"')";
             maconnexion.executeUpdate(requete1);//
        
             System.out.println("Afficher Employé numéro 93 ! ");
        
             requete1 = "SELECT * FROM `hopital`.`employe` WHERE `numero` = 93 ";
             listerequete = maconnexion.remplirChampsRequete(requete1);
             System.out.println(listerequete);
             
             
             JTextArea textaffich = new JTextArea();
             textaffich.setText("Voila la requete: " + listerequete);
             panaffichage.add("Center", textaffich);
              add(panaffichage, BorderLayout.CENTER);
              setVisible(true);
            
            
            }
            catch(SQLException | ClassNotFoundException e) {
            System.out.println("Vous n'êtes pas connecté à la base de donnée.");
            }
            
        }
       
        
        
    }
    
    
}
