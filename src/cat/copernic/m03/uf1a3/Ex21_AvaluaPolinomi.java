/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex21_AvaluaPolinomi {
 
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix grau del polinomi (>=0): ");        
        int grau = sc.nextInt();
        
        System.out.print("Introdueix el valor de la variable (x): ");        
        double x = sc.nextDouble();
        
        double polinomi = 0.0;
        
        for (int exponent = 0; exponent <= grau; exponent++)
        {
            System.out.print("Introdueix coeficient de grau " + exponent + ": ");        
            double coeficient = sc.nextDouble();
                    
            polinomi += coeficient*Math.pow(x, exponent);
        }
        
        System.out.printf("El valor del polinomi és: %.4f\n",polinomi);
        
        
    }
}
