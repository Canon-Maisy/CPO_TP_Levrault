/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_levrault;

import Personnages.Magicien;
import Personnages.Personnage;
import Personnages.Guerrier;

import Armes.Arme;
import Armes.Epee;
import Armes.Baton;
import java.util.ArrayList;

import Armes.*;
import Personnages.*;


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

        for (int i = 0; i < listeArmes.size(); i++) {
            if (listeArmes.get(i) instanceof Baton) {
                System.out.println(listeArmes.get(i).getNom() + ", attaque de : " + listeArmes.get(i).getAttaque() + ", age de : " + ((Baton) listeArmes.get(i)).getAge());
            } else if (listeArmes.get(i) instanceof Epee) {
                System.out.println(listeArmes.get(i).getNom() + ", attaque de : " + listeArmes.get(i).getAttaque() + ", finesse de : " + ((Epee) listeArmes.get(i)).getFinesse());
            }
        }
        
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //partie initialisation personnages
        
        Magicien Gandalf = new Magicien(true, "Gandalf", 65);
        Magicien Garcimore = new Magicien(false, "Garcimore", 44);
        
        Guerrier Conan = new Guerrier(false, "Conan", 78);
        Guerrier Lannister = new Guerrier(true, "Lannister", 45);
        
        ArrayList<Personnage> listePerso = new ArrayList<>();
        listePerso.add(Gandalf);
        listePerso.add(Garcimore);
        listePerso.add(Conan);
        listePerso.add(Lannister);
        
        for (int i=0; i<listePerso.size(); i++){
            if (listePerso.get(i) instanceof Magicien){
                System.out.println(listePerso.get(i).getNom()+", attaque de : "+listePerso.get(i).getPv()+", confirmé : "+ ((Magicien) listePerso.get(i)).getConfirme());
            } else if (listePerso.get(i) instanceof Guerrier){
                System.out.println(listePerso.get(i).getNom()+", attaque de : "+listePerso.get(i).getPv()+", cavalier : "+ ((Guerrier) listePerso.get(i)).getCavalier());
            }
        }
        
        
        
    }

}
