/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex11_Rectangle {
    
    public static void main(String[] args) {
     
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix l'alçada del rectangle: ");                
        double alcada = entrada.nextDouble();
        
        System.out.print("Introdueix l'amplada del rectangle: ");
        double amplada = entrada.nextDouble();
        
        double numero = 4.678923;
        System.out.printf("El perímetre del rectangle és: %.2f\n" ,
                                                   2*(alcada + amplada));
        
        //final double PI = 3.1416;
        
        //System.out.println("Longitud = " + 2*Math.PI*radi);
        
        
        
        
    }
}
