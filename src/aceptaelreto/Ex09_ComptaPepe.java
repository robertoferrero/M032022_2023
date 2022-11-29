/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex09_ComptaPepe {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String frase = sc.nextLine();
        
        int comptador = 0;
        int pos = 0;
        while(pos < frase.length())
        {
            int onEsta = frase.indexOf("pepe",pos);
            
            if (onEsta != -1) {
                comptador++;
                pos++;
            }
        }
        
        System.out.println("La frase conté " +  comptador + 
                           " cops la seqüència \"pepe\".");
    }
}
