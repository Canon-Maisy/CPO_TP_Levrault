/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_levrault;

/**
 *
 * @author Maxime
 */
public abstract class Arme {
    private String nom;
    private int attaque;
    
    //constructeur
    public Arme (String nom, int attaque){
        this.nom = nom;
        
        if (attaque > 100) {
            this.attaque = 100; // On limite supérieurement à 100
        } else if (attaque < 0){
            this.attaque = 100; // On limite inférieurement à 0
        } else {
            this.attaque = attaque;
        }
    }
    
    //setter avec restriction
    public void setAttaque(int attaque){
        if (attaque > 100) {
            this.attaque = 100; // On limite supérieurement à 100
        } else if (attaque < 0){
            this.attaque = 100; // On limite inférieurement à 0
        } else {
            this.attaque = attaque;}
    }
    
    //getter pour l'attaque
    public int getAttaque() {
        return attaque;
    }
    //getter pour le nom
    public String getNom(){
        return nom;}

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", attaque=" + attaque + '}';
    }
    
    
}