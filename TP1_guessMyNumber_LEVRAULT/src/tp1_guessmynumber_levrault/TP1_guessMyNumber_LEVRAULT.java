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
        int nbr = generateurAleat.nextInt(100);
        int choice;
        do {
            System.out.println("votre choix :");
            choice = scanner.nextInt();
            if (choice > nbr) {
                System.out.println("trop grand");
            } else if (choice < nbr) {
                System.out.println("trop petit");
            }
        } while (choice != nbr);
        System.out.println("Vous avez trouvé le numéro => " + nbr);
    }
}
