/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex07_InicialMajuscules {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix una frase: ");
        
        String frase = sc.nextLine();
        
        boolean imprimirCaracterMajuscules = true;
        for (int i = 0; i < frase.length(); ++i)
        {
            
            if (frase.charAt(i) == ' ')
            {
                System.out.print(frase.charAt(i)); 
                imprimirCaracterMajuscules = true;
            }
            else
            {
                if (imprimirCaracterMajuscules)
                {
                    System.out.print(Character.toUpperCase(frase.charAt(i))); 
                    imprimirCaracterMajuscules = false;
                }
                else
                    System.out.print(frase.charAt(i)); 
            }
        }
        System.out.println();
        
    }
}
