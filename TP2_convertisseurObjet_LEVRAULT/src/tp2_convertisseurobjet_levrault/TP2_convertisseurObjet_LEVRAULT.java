/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_levrault;

/**
 *
 * @author Maxime
 */
public class TP2_convertisseurObjet_LEVRAULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        
    }
    
}
