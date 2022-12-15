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
public class NPrimersPrimers {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix el total de primers: ");
        int N = sc.nextInt();
        
        int[] primers = new int[N];
        
        int totalPrimers = 0;
        int i = 2;
        while (totalPrimers < N) 
        {
            /*
               Bloc que fa la comprovació de si
               i és o no primer
            */
            boolean esPrimer = true;
            for ( int j = 2; j <= Math.sqrt(i) && esPrimer; j++)
            {
                if (i % j == 0)
                    esPrimer = false;
            }

            if (esPrimer)
            {
                primers[totalPrimers] = i;
                totalPrimers++;
            }
            i++;
        }
        
        
        for (int j = 0; j < N; ++j)
        {
            System.out.print(primers[j]); 
            if (j < N-1) 
            {
                System.out.print(", ");
                if ( (j+1) % 10 == 0)
                    System.out.println();
            }
            else
                System.out.print(".");
        }
        System.out.println();
    }
    
}
