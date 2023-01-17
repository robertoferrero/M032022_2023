/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class LaSerpIElCamell {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix una variable en notació SCREAMING_SNAKE_CASE: ");
        String variable = sc.nextLine();
        
        System.out.print("La variable en notació lowerCamelCase és: ");
        //Opció 1
        /*
        String lowerCamelCase = variable.toLowerCase();
        for (int i = 0; i < lowerCamelCase.length(); ++i)
        {
            char caracter = lowerCamelCase.charAt(i);
            if (caracter == '_')
            {
                System.out.print(Character.toUpperCase(lowerCamelCase.charAt(i+1)));
                i++;
            }
            else
                System.out.print(lowerCamelCase.charAt(i));
        }
        System.out.println("");*/
        
        //Opció 2
        String[] paraules = variable.toLowerCase().split("_");
        System.out.print(paraules[0]);
        for (int i = 1; i < paraules.length; i++)
        {
            System.out.print(paraules[i].substring(0,1).toUpperCase() + 
                             paraules[i].substring(1));
        }
        System.out.println("");
        
        
        
        System.out.print("La variable en notació kebab-case és    : ");
        // Opció 1
        /*
        String kebabCase = variable.toLowerCase();
        for (int i = 0; i < kebabCase.length(); i++) 
        {
            char caracter = kebabCase.charAt(i);
            if (caracter == '_')
                System.out.print("-");
            else
                System.out.print(caracter);
        }
        System.out.println("");
        */
        
        // Opció 2
        /*
        //String kebabCase = variable.toLowerCase();
        String[] paraules = variable.toLowerCase().split("_");
        for (int i = 0; i < paraules.length - 1; i++)         
            System.out.print(paraules[i] + "-");       
        System.out.println(paraules[paraules.length-1]);*/
        
        // Opció 3
        System.out.println(variable.toLowerCase().replace("_", "-"));
    }
}
