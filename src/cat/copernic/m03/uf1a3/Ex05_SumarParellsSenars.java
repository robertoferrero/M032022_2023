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
public class Ex05_SumarParellsSenars {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueixi un número: ");        
        int numero = sc.nextInt();
        
        int sumaParells = 0,sumaSenars = 0;
        for (int i = 1; i <= numero; i++)
        {
            if (i % 2 == 0)   // És parell
            {                
                //sumaParells = sumaParells + numero;
                sumaParells += i;
            } 
            else              
                sumaSenars += i;
            
        }
        
        System.out.println("Suma parells: " + sumaParells);
        System.out.println("Suma senars : " + sumaSenars);
        
    }
}
