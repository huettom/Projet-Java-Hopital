/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projethopital;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author tomhuet
 */
public class ProjetHopital {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fenetre f = new Fenetre();
        
        
        
        
        /*String requete1;
        String nomBDD = "hopital";
        String login = "root";
        String password = "root";
        ArrayList<String> listerequete;
        
        
        
        try{

        //connexion a la base de donnée
        Connexion maconnexion = new Connexion(nomBDD, login, password);//non redirection à catch
        System.out.println("Vous êtes connecté à la base de donnée."); 
        
        System.out.println("Rechercher dans la table docteur, les cardiologues !");
        requete1 = "SELECT * FROM `hopital`.`docteur` WHERE (CONVERT(`numero` USING utf8) LIKE '%Cardiologue%' OR CONVERT(`specialite` USING utf8) LIKE '%Cardiologue%')";
        listerequete = maconnexion.remplirChampsRequete(requete1);
        System.out.println(listerequete);
        
        
        System.out.println("Rechercher dans la table infirmière, numéro !");
        
        requete1 = "SELECT salaire FROM `hopital`.`infirmier` WHERE `salaire`";
        listerequete = maconnexion.remplirChampsRequete(requete1);
        System.out.println(listerequete);
        
        //System.out.println("Ajouter un patient!");
        
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Entrer le nom: ");
        //int id= sc.nextInt();
        int id= 93;
        String nom = "Lhuillier"; String prenom = "Simon";
        String adresse = "quelque part"; String tele= "06 14 13 12 11";
        // Adresse à ajouter //
        
        //lancer ajouter quelqu'un
        requete1 = "INSERT INTO `employe`(`numero`, `nom`,`prenom`, `adresse`, `tel`) "
                + "VALUES('"+id+"','"+nom+"','"+prenom+"','"+adresse+"','"+tele+"')";
        maconnexion.executeUpdate(requete1);//
        
        System.out.println("Afficher Employé numéro 93 ! ");
        
        requete1 = "SELECT * FROM `hopital`.`employe` WHERE `numero` = 93 ";
        listerequete = maconnexion.remplirChampsRequete(requete1);
        System.out.println(listerequete);
        
        
        
        }
        catch(SQLException | ClassNotFoundException e) {
        System.out.println("Vous n'êtes pas connecté à la base de donnée.");
        }*/

    }
}
