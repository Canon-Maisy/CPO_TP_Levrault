/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Maxime
 */
public abstract class Personnage {

    private String nom;
    private int Pv;

    public Personnage(String nom, int Pv) {
        this.nom = nom;
        this.Pv = Pv;
    }

    public String getNom() {
        return nom;
    }

    public int getPv() {
        return Pv;
    }
    
    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", Pv=" + Pv + '}';
    }
}
