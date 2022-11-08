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
public class Ex11_EsPrimer {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueixi un número: ");        
        int valor = sc.nextInt();
        boolean esPrimer = true;
        for ( int i = 2; i < valor && esPrimer; i++)
        {
            if (valor % i == 0)
                esPrimer = false;
        }
        
        if (esPrimer)
            System.out.println("El nombre " + valor + " és primer.");
        else
            System.out.println("El nombre " + valor + " NO és primer.");
    }
}
