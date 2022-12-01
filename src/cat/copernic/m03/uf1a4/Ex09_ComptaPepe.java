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
public class Ex09_ComptaPepe {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String frase = sc.nextLine();
        
        int comptador = 0;
        int pos = 0;
        
        // Alternativa 1
        while(pos != -1)
        {
            pos = frase.indexOf("pepe",pos);
            if (pos != -1)
            {
                comptador++;
                pos++;                        
            }
        }

        // Alternativa 2
        //while( (pos = frase.indexOf("pepe",pos)) != -1 )
        //{            
        //   comptador++;
        //    pos++;                        
        //}
        
        System.out.println("La frase conté " +  comptador + 
                           " cops la seqüència \"pepe\".");
    }
}
