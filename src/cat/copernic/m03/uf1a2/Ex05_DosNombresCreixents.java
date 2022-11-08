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
public class Ex05_DosNombresCreixents {
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un nombre enter: ");
        int a = sc.nextInt();

        System.out.print("Introdueix un altre enter: ");
        int b = sc.nextInt();        
        
        if (a < b)         
            System.out.println(a + ", " + b);        
        else 
            System.out.println(b + ", " + a);        
                 
    }
}
