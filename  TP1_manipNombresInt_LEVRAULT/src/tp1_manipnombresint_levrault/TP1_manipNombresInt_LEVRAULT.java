/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_levrault;

import java.util.Scanner;

/**
 *
 * @author Maxime
 */
public class TP1_manipNombresInt_LEVRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("entrez un 1er nombre : ");
        int nbr1 = scanner.nextInt();
        System.out.println("entrer un 2nd nombre : ");
        int nbr2 = scanner.nextInt();
        
        System.out.println("somme des nombres : " + (nbr1 + nbr2));
        System.out.println("difference des nombres : " + (nbr1-nbr2));
        System.out.println("produits des nombres : " + (nbr1 * nbr2));
        System.out.println("quotient du 1er nombre par le 2nd : "+ (nbr1 / nbr2));
        System.out.println("reste de la division du 1er nombre par le 2nd : "+ (nbr1 % nbr2));
    }
    
}
