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
public class Ex01_ComptaVocals {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix una frase:");
        
        String frase = sc.nextLine();
        
        int totalVocals = 0;
        for (int i = 0; i < frase.length(); ++i)
        {
            char caracter = frase.toLowerCase().charAt(i);
            /*if (caracter == 'a' || caracter == 'e' | caracter == 'i' ||
                caracter == 'o' || caracter == 'u')*/
            switch (caracter)
            {
                case 'a':
                case 'e':
                case 'i':         
                case 'o':
                case 'u':
                    totalVocals++;
            }
                
        }
        
        System.out.println("La frase conté " + totalVocals + " vocals.");
        
    }
}
