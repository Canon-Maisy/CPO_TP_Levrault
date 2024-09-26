/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_levrault;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Maxime
 */
public class TP1_stats_LEVRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        Random random = new Random();
        
        System.out.println("choisissez une valeur :");
        
        int[] tab = new int[6];
        for (int i = 0; i < 6; i++) {
            tab[i] = 0;
        }
        
        m = scanner.nextInt();
        
        for (int i = 0; i < m; i++) {
            int randomNumber = random.nextInt(6);
            tab[randomNumber] += 1;
        }
        System.out.println(Arrays.toString(tab));
        
        for (int i = 0; i<6; i++){
            double pourcentage = (tab[i]/(m*1.0))*100;
            System.out.println("il y a " + pourcentage + " % du " + (i+1) + " nombre.");
        }
    }

}
