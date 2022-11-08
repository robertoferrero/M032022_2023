/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03uf1;

//import java.util.Locale;
//import java.util.Scanner;

import java.util.*;

/**
 *
 * @author rferrero
 */
public class MenuOpcions {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*** MENÚ ***");        
        System.out.println("1 - Alta usuari");
        System.out.println("2 - Editar usuari");
        System.out.println("3 - Eliminar usuari");
        System.out.print("Introdueix una opció de menú: ");
        int opcio = sc.nextInt();
        
        switch (opcio) 
        {
            case 1:
                System.out.println("Donant d'alta usuari");
                break;
            case 2:
                System.out.println("Editant usuari");
                break;
            case 3:
                System.out.println("Eliminant usuari");
                break;
            default:
                System.out.println("Opció incorrecta");
        }
    }
}
