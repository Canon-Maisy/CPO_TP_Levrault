/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Maxime
 */
public class Magicien extends Personnage {

    private boolean confirme;
    
    //constructeur
    public Magicien(boolean confirme, String nom, int Pv) {
        super(nom, Pv);
        this.confirme = confirme;
    }
   
    //getter
    public boolean getConfirme(){
        return confirme;
    }
    
    //setter
    public void setConfirme(boolean confirme){
        this.confirme = confirme;
    }
    
    //toString
    @Override
    public String toString() {
        return "Magicien{" + "confirme=" + confirme + '}';
    }
    
}
