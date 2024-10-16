/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_levrault;

/**
 *
 * @author Maxime
 */
public class TP2_convertisseurObjet_LEVRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur compteur = new Convertisseur ();
        double temp_C = 10.0;
        double temp_K = compteur.CelciusVersKelvin(temp_C);
        System.out.println(compteur);
        System.out.println("température finale : " + temp_K);
    }
    
}
