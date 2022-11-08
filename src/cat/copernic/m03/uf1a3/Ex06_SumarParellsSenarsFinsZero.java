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
public class Ex06_SumarParellsSenarsFinsZero {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int sumaParells = 0,sumaSenars = 0;
        int numero = -1;
        
        //for(int numero = -1; numero != 0;)        
        while (numero != 0)        
        {
            System.out.print("Introdueixi un nombre (0 per acabar): ");        
            numero = sc.nextInt();
            
            if (numero % 2 == 0)   // És parell                        
                sumaParells += numero;            
            else              
                sumaSenars += numero;            
          
        }
        System.out.println("Suma parells: " + sumaParells);
        System.out.println("Suma senars : " + sumaSenars);        
    }
}
