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
public class IntroBucles {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //System.out.print("Introdueixi un nombre natural: ");        
        //int n = sc.nextInt();
        int n = Integer.parseInt(args[0]);
        
        System.out.println("Taula de multiplicar del " + n);
        /*
        System.out.println(n + "x" + 1 + " = " + n*1);
        System.out.println(n + "x" + 2 + " = " + n*2);
        System.out.println(n + "x" + 3 + " = " + n*3);
        System.out.println(n + "x" + 4 + " = " + n*4);
        System.out.println(n + "x" + 5 + " = " + n*5);
        System.out.println(n + "x" + 6 + " = " + n*6);
        System.out.println(n + "x" + 7 + " = " + n*7);
        System.out.println(n + "x" + 8 + " = " + n*8);
        System.out.println(n + "x" + 9 + " = " + n*9);
        System.out.println(n + "x" + 10 + " = " + n*10);
        */
        
        //int i; //Contador
        
        /*
            para valores de i desde 1 hasta 10
                System.out.println(n + "x" + i + " = " + n*i);        
        */        
        for (int i = 1; i <= 10; ++i)        
        {
            System.out.println(n + "x" + i + " = " + n*i);                     
        }   
        
        
        
        //int i = 5;
        //System.out.println(i);
        
        
                
    }
}
