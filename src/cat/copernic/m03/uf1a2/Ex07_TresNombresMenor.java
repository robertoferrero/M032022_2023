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
public class Ex07_TresNombresMenor {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digueu un nombre: ");
        int a = sc.nextInt();

        System.out.print("Digueu un altre: ");
        int b = sc.nextInt();        

        System.out.print("Digueu un altre: ");
        int c = sc.nextInt();        
        
        if (a < b && a < c)
            System.out.println("El menor és: " + a);
        else if (b < c)
            System.out.println("El menor és: " + b);
        else
            System.out.println("El menor és: " + c);
        
    }
}
