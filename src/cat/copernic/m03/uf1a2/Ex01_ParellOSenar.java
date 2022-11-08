/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a2;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex01_ParellOSenar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueixi un nombre natural: ");
        
        int nombre = sc.nextInt();
        
        if (nombre % 2 == 0)         
            System.out.println("El nombre és parell.");                
        else
            System.out.println("El nombre és senar.");

    
    }
                
}
