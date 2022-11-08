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
public class Ex09_Calculadora {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueixi un número: ");        
        int a = sc.nextInt();
        
        System.out.print("Introdueixi un altre: ");        
        int b = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Introdueix una operació (+,-,*,/): ");
        //char op = sc.nextLine().charAt(0);
        char op = sc.nextLine().charAt(b);
        
        System.out.print("El resultat de l'operació és: ");
        
        /*
        if (op.equals("+"))
        {
            System.out.println(a + " + " + b + " = " + (a+b));
        } 
        else if (op.equals("-"))
        */
        switch (op)
        {
            case '+':
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
                
        }
        
    }
}
