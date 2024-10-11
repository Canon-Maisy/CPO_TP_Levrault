/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_levrault;

/**
 *
 * @author Maxime
 */
public class TP2_Bieres_LEVRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere UneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        UneBiere.lireEtiquette();
        System.out.println(UneBiere);
        
        BouteilleBiere BiereLeffe = new  BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        //BiereLeffe.lireEtiquette();
        BiereLeffe.Décapsuler();
        System.out.println(BiereLeffe);
        
        BouteilleBiere BiereChouffe = new BouteilleBiere("Chouffe", 8.0, "Achouffe");
        //BiereChouffe.lireEtiquette();
        BiereChouffe.Décapsuler();
        System.out.println(BiereChouffe);
        
        BouteilleBiere BiereDespe = new BouteilleBiere ("Desperados", 5.9, "Heineken");
        //BiereDespe.lireEtiquette();
        System.out.println(BiereDespe);
        
        BouteilleBiere BierePelforth = new BouteilleBiere("Pelforth", 5.8, "Brasserie du pélican");
        //BierePelforth.lireEtiquette();
        System.out.println(BierePelforth);
        
    }
    
}   
