/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_levrault;

import java.util.Scanner;

/**
 *
 * @author Maxime
 */
public class TP2_convertisseurObjet_LEVRAULT {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
        //conversion de Celsuis a Kelvins
        Convertisseur convert_1 = new Convertisseur ();
        double temp_C = 10.0;
        double temp_F = 0.0;
        double temp_K = 0.0;
        temp_K = convert_1.CelciusVersKelvin(temp_C);
        System.out.println(convert_1);
        System.out.println("température finale : " + temp_K);
        
        
        // conversions de Kelvin à Celsuis à Fareinheit puis de nouveau à Kelvins
        Convertisseur convert_2 = new Convertisseur();
        temp_K = 300.0;
        temp_C = convert_2.KelvinVersCelcius(temp_K);
        temp_F = convert_2.CelciusVersFarenheit(temp_C);
        temp_F = convert_2.KelvinVersFarenheit(temp_K);
        System.out.println(convert_2);
        System.out.println("température finale : " + temp_F);
        */
        
        
        
        System.out.println("votre température :");
        double temperature = scanner.nextInt();
        System.out.println("en quelle unité est votre température ? (1 : °C, 2: K, 3: Fareinheit)");
        int unité = scanner.nextInt();
        System.out.println("en qeulle unité convertir ? (1 : °C, 2: K, 3: Fareinheit)");
        int unité2 = scanner.nextInt();
        Convertisseur convert_3 = new Convertisseur();
        
        if (unité == unité2){
            System.out.println(temperature);
        }else{ 

            switch (unité){
                case 1 :
                    if (unité2 == 2){
                        System.out.println(convert_3.CelciusVersKelvin(temperature));
                        break;
                    }else {
                        System.out.println(convert_3.CelciusVersFarenheit(temperature));
                        break;
                    }
                case 2 :
                    if (unité2 == 1){
                        System.out.println(convert_3.KelvinVersCelcius(temperature));
                        break;
                    } else {
                        System.out.println(convert_3.KelvinVersFarenheit(temperature));
                        break;
                    }
                case 3 :
                    if (unité == 2){
                        System.out.println(convert_3.FarenheitVersCelcius(temperature));
                        break;
                    }else {
                        System.out.println(convert_3.FarenheitVersKelvin(temperature));
                        break;
                    }
            }
        }
        
    }
    
}
