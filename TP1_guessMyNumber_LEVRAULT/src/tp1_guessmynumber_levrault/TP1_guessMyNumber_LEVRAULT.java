/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_levrault;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maxime
 */
public class TP1_guessMyNumber_LEVRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();

        /*for (int i = 0; i < 5; i++) {
            int n = generateurAleat.nextInt(100);
            System.out.println(n);*/
        int difficulty;
        do {
            System.out.println("Choisissez votre difficultée : \n1) facile(0-100)\n2)moyen(0-1 000)\n3)dur(0-10 000)");
            difficulty = scanner.nextInt();
            switch (difficulty) {
                case 1:
                    System.out.println("facile");
                case 2:
                    System.out.println("moyen");
                case 3:
                    System.out.println("dur");
                default:
                    System.out.println("saisie invalide");
            }
        } while (difficulty < 1 || difficulty > 3);
        int nbr = generateurAleat.nextInt(100);
        int choice;
        int compteur = 0;
        do {
            System.out.println("votre choix :");
            choice = scanner.nextInt();
            if (choice > nbr) {
                System.out.println("trop grand");
            } else if (choice < nbr) {
                System.out.println("trop petit");
            }
            compteur += 1;
        } while (choice != nbr);
        System.out.println("Vous avez trouvé le nombre en " + compteur + " coups.");
    }
}
