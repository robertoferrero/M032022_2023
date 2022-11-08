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
public class Ex03_PositiusNegatius {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix 10 nombres enters:");
        int numPositius = 0;
        for (int i = 1; i <= 10; i++) 
        {
            System.out.print("Nombre " + i + " = ");
            int num = sc.nextInt();
            if (num > 0)
                numPositius++;
                
        }
        
        System.out.println(numPositius + " nombre/s positiu/s");
    }
}
