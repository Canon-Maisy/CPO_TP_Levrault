/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Maxime
 */
public class Guerrier extends Personnage {
    private boolean cavalier;

    //constructor
    public Guerrier(boolean cavalier, String nom, int Pv) {
        super(nom, Pv);
        this.cavalier = cavalier;
    }
    
    //getter
    public boolean getCavalier(){
        return cavalier;
    }
    
    //setter
    public void setCavalier(boolean cavalier){
        this.cavalier = cavalier;
    }
    
    //toString
    @Override
    public String toString() {
        return "Guerrier{" + "cavalier=" + cavalier + '}';
    }
    
}
