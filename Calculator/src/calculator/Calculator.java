/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Maxime
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("faites votre choix :");
        int choice = sc.nextInt();    
        if (choice > 5 || choice < 1) {
        System.out.println("veuillez rentrer une variable opérateur correcte");
        }   
        
        System.out.println("1ere valeur");
        int operande1 = sc.nextInt();
        System.out.println("2ere valeur");
        int operande2 = sc.nextInt();
        
        if (choice == 1) { 
            System.out.println(operande1 + operande2);
        } else if (choice == 2) {
            System.out.println(operande1 - operande2);
        } else if (choice == 3) {
            System.out.println(operande1 * operande2);
        } else if (choice == 4) {
            System.out.println(operande1 / operande2);
        } else if (choice == 5){
            System.out.println(operande1 % operande2);
        }
        
        
        
    }
    
}
