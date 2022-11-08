/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03uf1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class IndexIMC {
 
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix el pes (kg): ");
        double pes = sc.nextDouble();
        
        System.out.print("Introdueix l'alçada (m): ");
        double alcada = sc.nextDouble();
        
        double imc = pes / (alcada*alcada);
        
        if (imc < 16)         
            System.out.println("Necessita ingressar a l'hospital.");        
        else if (imc < 17)        
            System.out.println("Vostè té infrapes.");        
        else if (imc < 18)        
            System.out.println("Vostè té baix pes.");        
        else if (imc < 25)        
            System.out.println("Vostè té un pes saludable.");        
        else if (imc < 30)        
            System.out.println("Vostè té sobrepes (obesitat grau I).");        
        else if (imc < 35)        
            System.out.println("Vostè té obesitat grau II.");        
        else if (imc < 40)        
            System.out.println("Vosté té obesitat premòrbida grau III.");        
        else         
            System.out.println("Vostè té obesitat mòrbida grau IV.");
                    
        
    }
}
