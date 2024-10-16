/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_levrault;

/**
 *
 * @author Maxime
 */
public class Convertisseur {

    int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public double CelciusVersKelvin(double tCelsuis) {
        nbConversions++;
        return tCelsuis + 273.25;
    }

    public double KelvinVersCelcius(double tKelvin) {
        nbConversions++;
        return tKelvin - 273.15;
    }

    public double FarenheitVersCelcius(double tFarenheit) {
        nbConversions++;
        return (tFarenheit - 32) / 1.8;
    }

    public double CelciusVersFarenheit(double tCelcius) {
        nbConversions++;
        return (tCelcius * 1.8) + 32;
    }

    public double KelvinVersFarenheit(double tKelvin) {
        nbConversions ++;
        return (tKelvin - 273.15) * 1.8 + 32;
    }

    public double FarenheitVersKelvin(double tFarenheit) {
        nbConversions++;
        return (tFarenheit - 32) * 1.8 + 273.15;
    }

    public String toString() {
        return "nb de conversions : " + nbConversions;
    }
}
