/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03uf1;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Triangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        

        System.out.print("Introdueix el costat del triangle: ");                        
        int costat = sc.nextInt(); 
        
        for (int i = 1; i <= costat; i++)
        {
            // Dibuixem els espais
            for (int j = 1; j <= costat - i; j++)
                System.out.print(" ");
            
            // Dibuixem els *
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            
            System.out.println("");            
        }
    }
}
