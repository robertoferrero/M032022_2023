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
public class ExempleBreak {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        int valor = sc.nextInt();
        int suma = valor;
        boolean sortir = false;
        while (suma <= 20 && !sortir /*sortir == false*/) 
        {
            System.out.print("Nombre: ");
            valor = sc.nextInt();
            suma += valor;
            
            System.out.print("Sortir? [S/n]: ");
            sc.nextLine();
            char opcio = sc.nextLine().charAt(0);
            if (opcio == 'S' || opcio == 's')
                sortir = true;
            
        }
        
        System.out.println("La suma acumulada és: " + suma);

    }
}
