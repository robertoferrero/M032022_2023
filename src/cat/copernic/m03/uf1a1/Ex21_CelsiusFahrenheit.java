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
public class Ex21_CelsiusFahrenheit {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Introdueix temperatura en graus Celsius: ");
        float celsius = sc.nextFloat();
        
        float fahrenheit = (9.0F/5)*celsius + 32;
        
        System.out.println("La temperatura en graus Fahrenheit és: " + fahrenheit);
        
        
        
    }
}
