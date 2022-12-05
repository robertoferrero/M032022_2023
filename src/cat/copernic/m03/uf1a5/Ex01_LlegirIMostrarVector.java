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
public class Ex01_LlegirIMostrarVector {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int TOTAL = 10;
        
        int[] valors = new int[TOTAL];
        
        for (int i = 0; i < valors.length; ++i)
        {
            System.out.print("Introdueix el valor de la posició " + i + ": ");
            valors[i] = sc.nextInt();
        }
        System.out.println("");
        
        // Mostrar valors
        for (int i = 0; i < valors.length; ++i) 
        {
            System.out.println("El valor de la posició " + i + " és: " + valors[i]);
        }
    }
}
