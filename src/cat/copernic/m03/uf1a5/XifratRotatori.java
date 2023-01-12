/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class XifratRotatori {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix la clau de xifrat [1-9]: ");
        int N = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Introduexi una frase:");
        String frase = sc.nextLine();
        
        String[] paraules = frase.split(" ");
        
        // Primer pas
        int desplacament = 0;
        do 
        {
            int posFinal = Math.min(N, paraules.length - desplacament);
            String paraulaInicial = paraules[desplacament];
            for (int i = 0; i < posFinal - 1; ++i)
            {
                paraules[i+desplacament] = paraules[i+1+desplacament];
            }
            paraules[posFinal-1+desplacament] = paraulaInicial;
            
            desplacament += N;
            
        } while(desplacament < paraules.length);
        
        // Segon pas
        for (int i = 0; i < paraules.length; ++i) {
            char[] caracters = paraules[i].toCharArray();
        }
        
        // Mostra frase xifrada
        for (String paraula : paraules)
        {
            System.out.print(paraula + " ");
        }
        System.out.println("");
    }
    
}
