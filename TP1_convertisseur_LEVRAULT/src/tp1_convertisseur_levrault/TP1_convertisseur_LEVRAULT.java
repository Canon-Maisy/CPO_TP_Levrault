/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_levrault;

import java.util.Scanner;

/**
 *
 * @author Maxime
 */
public class TP1_convertisseur_LEVRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("entrez une température en Celsius : ");
        double tempC = scanner.nextDouble();
        //System.out.println(nbr);
        //System.out.println("conversion de la température de °C en °K : " + (nbr + 273.15));
        
        double tempK = CelciusVersKelvin(tempC);
        System.out.println("température en Kelvin : " + tempK);
        System.out.println("retour en celsius : " + KelvinVersCelcius(tempK));
        
        double tempF = CelciusVersFarenheit (tempC);
        System.out.println("température en Farenheit : " + tempF);
        System.out.println("retour en celsius : "+ FarenheitVersCelcius(tempF));
        
        System.out.println("farenheit => kelvin : "+ FarenheitVersKelvin(tempF));
        System.out.println("kelvin => farenheit :" + KelvinVersFarenheit(tempK));*/
        System.out.println("saisissez une valeur :");
        double temp = scanner.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n3) de Farenheit vers Celsius\n4) de Celsius vers Farenheit\n5) de Kelvin vers Farenheit\n6) de Farenheit vers Kelvin");
        int choice;

        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1: System.out.println(CelciusVersKelvin(temp));break;
                case 2: System.out.println(KelvinVersCelcius(temp));break;
                case 3: System.out.println(FarenheitVersCelcius(temp));break;
                case 4: System.out.println(CelciusVersFarenheit(temp));break;
                case 5: System.out.println(KelvinVersFarenheit(temp));break;
                case 6: System.out.println(FarenheitVersKelvin(temp));break;
                default : System.out.println("entrée incorrecte");
            }
            } while (choice < 1 || choice > 6);
    
    }
    
    
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) / 1.8;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 1.8) + 32;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        return (tKelvin - 273.15) * 1.8 + 32;
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        return (tFarenheit - 32) * 1.8 + 273.15;
    }
}
