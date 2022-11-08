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
public class Ex18_Divisors {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueixi un número: ");        
        int n = sc.nextInt();
        
        for (int i = 1; i <= (int)Math.sqrt(n); i++) 
        {
            if (n % i == 0)
                System.out.print(i + " " + n/i + " ");
        }
        System.out.println("");
        
        
    }
}
