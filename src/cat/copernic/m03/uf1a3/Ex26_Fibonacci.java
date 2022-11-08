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
public class Ex26_Fibonacci {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        

        System.out.print("Introdueix un nombre natural: ");                        
        int n = sc.nextInt();

        int valorActual = 1, valorAnterior = 1;
        for (int i = 1; i <= n; ++i)
        {
            if (i <= 2)
                System.out.print("1 ");
            else
            {                    
                System.out.print((valorActual + valorAnterior) + " ");
                int aux = valorActual;                    
                valorActual = valorActual + valorAnterior;
                valorAnterior = aux;
            }
        }
        System.out.println("");
            
    }
}
