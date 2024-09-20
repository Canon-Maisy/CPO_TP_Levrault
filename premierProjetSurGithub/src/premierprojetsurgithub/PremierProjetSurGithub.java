/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package premierprojetsurgithub;

import java.util.Scanner;

/**
 *
 * @author Maxime
 */
public class PremierProjetSurGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*System.out.println("hello world");
        int wouaf = 20;
        System.out.println(wouaf);
        System.out.println("bye world");*/
        
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        System.out.println(prenom);
    }
    
}
