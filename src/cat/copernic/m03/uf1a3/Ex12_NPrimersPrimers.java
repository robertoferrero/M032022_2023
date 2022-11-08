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
public class Ex12_NPrimersPrimers {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueixi un nombre natural: ");        
        int maximPrimers = sc.nextInt();
        
        System.out.println("Els " + maximPrimers + 
                           " primers nombres primers són:");
        int totalPrimers = 0;        
        int valor = 2;
        do 
        {
        
            boolean esPrimer = true;
            for ( int i = 2; i < valor && esPrimer; i++)
            {
                if (valor % i == 0)
                    esPrimer = false;
            }

            if (esPrimer)
            {
                System.out.print(valor + " ");
                totalPrimers++;
            }
            
            valor++;

        } while(totalPrimers < maximPrimers);
        System.out.println("");
        
    }
}
