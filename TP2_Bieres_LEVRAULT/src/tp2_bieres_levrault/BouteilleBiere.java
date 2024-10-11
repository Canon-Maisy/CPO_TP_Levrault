package tp2_bieres_levrault;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maxime
 */
public class BouteilleBiere {
    String nom;
    double degreeAlcool;
    String brasserie;
    boolean ouverte;
    
    public BouteilleBiere(String unNom, double unDegree, String uneBrasserie){
        nom = unNom;
        degreeAlcool = unDegree;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    
    public void lireEtiquette (){
        System.out.println("Bouteille de " + nom +" (" + degreeAlcool + " degres) \nBrasserie : " + brasserie ) ;
    }
    
    public boolean Décapsuler(){
        if (ouverte == false){
            ouverte = true; 
            return ouverte;
        }else {
            System.out.println("erreur : biere déjà ouverte");
            return false;
        }
    }
}
