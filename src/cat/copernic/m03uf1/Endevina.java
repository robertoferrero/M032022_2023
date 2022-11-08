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
public class Endevina {
    
    public static void main(String[] args) {
        
        //int valor;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Endevina un número: ");
        int valor = entrada.nextInt();
        
        if (valor == 20)
        {
            System.out.println("Enhorabona!!! L'has endevinat!");
            System.out.println("Has guanyat un premi!");
        }
        else if (valor == 100)
        {
            System.out.println("Ho sento, és massa gran");
        }
        else if (valor == 1)
        {
            System.out.println("Ho sento, és massa petit");
        }
        else
        {
            System.out.println("Ho sento, no l'has endevinat");
        }
        
        
        System.out.println("Final del programa.");
    }
}
