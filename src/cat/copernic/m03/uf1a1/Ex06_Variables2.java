/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a1;

import java.util.Locale;



/**
 *
 * @author rferrero
 */
public class Ex06_Variables2 {
 
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        short x = 10;
        int   y = 400;
        double pi = 3.14159265359;
        float kwh = 188.18f;
        String nom = "Lluís", primerCognom = "Pérez", segonCognom = "González";
        byte edat = 21;
        
        System.out.println("La variable x conté el valor " + x + ".");
        System.out.println("El valor " + y + " s'ha emmagatzemat a la variable "
                                                                        + "y.");
        System.out.printf("El meu nombre irracional preferit és PI: %.4f.\n", pi);
        
        
        System.out.printf("Demà, el preu de l'electricitat estarà a %.2f €/kWh.\n",kwh);
        System.out.println("El meu nom és " + nom + " " + primerCognom + " " +
                                    segonCognom + " i tinc " + edat + " anys.");
                                                                     
    }
}
