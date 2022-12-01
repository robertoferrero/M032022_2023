/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex13_NomesLletresEspaisOrdenats {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix una cadena:");        
        String cadena = sc.nextLine();
        
        //
        String resultat = "";        
        for (int i = 0; i < cadena.length(); ++i)
        {
            char caracter = cadena.toUpperCase().charAt(i);
            
            //if ( Character.isLetter(caracter) ||                 
            if ( (caracter >= 'A' && caracter <= 'Z') ||
                  caracter == ' ')
                
                resultat += cadena.charAt(i);
        }
        
        String cadenaInicial = cadena.substring(0,1);
        String caracter = "f";
        
        for (int i = 0; i < cadenaInicial.length(); ++i)
        {
            System.out.println(caracter.compareTo(cadenaInicial.substring(i,i+1)));
        }
        
        
        
        System.out.println("La cadena amb només lletres i espais ordenada és:");
        System.out.println(resultat);
    }
}
