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
public class ExempleBreak2 {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        int valor = 0;
        while (!sc.hasNextInt())
        {
            System.out.println("No intentis petar el programa. Introdueix un enter!!!");
            System.out.print("Nombre: ");
            sc.nextLine();
        }
        valor = sc.nextInt();
        
            
        
        int suma = valor;
        /*boolean sortir = false;*/
        while (suma <= 20 /*&& !sortir*/) 
        {
            System.out.print("Nombre: ");
            valor = sc.nextInt();
            suma += valor;
            
            System.out.print("Sortir? [S/n]: ");
            sc.nextLine();
            char opcio = sc.nextLine().charAt(0);
            if (opcio == 'S' || opcio == 's')
                break;
            
        }
        
        System.out.println("La suma acumulada és: " + suma);

    }
    
}
