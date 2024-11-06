/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_levrault;

/**
 *
 * @author Maxime
 */
public class Arme {
    private String nom;
    private int attaque;
    
    //constructeur
    public Arme (String nom, int attaque){
        this.nom = nom;
        this.attaque = attaque;
    }
    
    //setter avec restriction
    public void setAttaque(int attaque){
        if (attaque > 100) {
            this.attaque = 0; // On limite à 100
            System.out.println("valeur attaque impossible, fixé à 0");
        } else {
            this.attaque = attaque;
        }
    }
    
    //getter pour l'attaque
    public int getAttaque() {
        return attaque;
    }
    
    public String getNom(){
        return nom;}

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", attaque=" + attaque + '}';
    }
    
    
}