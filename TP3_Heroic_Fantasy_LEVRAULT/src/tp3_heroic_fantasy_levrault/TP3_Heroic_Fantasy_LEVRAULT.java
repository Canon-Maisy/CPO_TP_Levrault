/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_levrault;

import Armes.Arme;
import Armes.Epee;
import Armes.Baton;
import java.util.ArrayList;
import Armes.*;

/**
 *
 * @author Maxime
 */
public class TP3_Heroic_Fantasy_LEVRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibur = new Epee(7, "Excalibur", 5);
        Epee Durandal = new Epee(4, "Durandal", 7);
        
        Baton Chêne = new Baton(4, "Chêne", 5);
        Baton Charme = new Baton(5, "Charme", 6);
        
        ArrayList<Arme> listeArmes = new ArrayList<>();
        listeArmes.add(Excalibur);
        listeArmes.add(Durandal);
        listeArmes.add(Chêne);
        listeArmes.add(Charme);
        
        for (int i=0; i<listeArmes.size(); i++){
            if (listeArmes.get(i) instanceof Baton){
                System.out.println(listeArmes.get(i).getNom()+", attaque de : "+listeArmes.get(i).getAttaque()+", age de : "+ ((Baton) listeArmes.get(i)).getAge());
            }else if (listeArmes.get(i) instanceof Epee){
                System.out.println(listeArmes.get(i).getNom()+", attaque de : "+listeArmes.get(i).getAttaque()+", finesse de : "+ ((Epee) listeArmes.get(i)).getFinesse());
            }
            
            //System.out.println("L'armes "+ stuff.get(i).nom +", attaque avec"+ stuff.get(i).getAttaque() +"points et a une finesse de "+ stuff.get(i).getFinesse());
        } 
    }
    
}
