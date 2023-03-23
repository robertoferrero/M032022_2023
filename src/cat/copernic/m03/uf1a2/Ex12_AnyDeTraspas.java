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
public class Ex12_AnyDeTraspas {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un any: ");        
        int any = sc.nextInt();
        
        /*
        if (any % 4 == 0)
        {
            if (any % 100 == 0 && !(any % 400 == 0)) // No
                System.out.println("NO");
            else
                System.out.println("SI");            
        }
        else
            System.out.println("NO");
        */
        
        //boolean anyTraspas = (any % 4 == 0) && !(any % 100 == 0 && !(any % 400 == 0));
        
        //boolean anyTraspas = (any % 4 == 0) && (any % 100 != 0 && (any % 400 == 0));
        
        /*String missatge;
        if (anyTraspas)
            missatge = "SI";
        else
            missatge = "NO";*/
        
        //String missatge = anyTraspas ? "SI" : "NO";
        System.out.println((any % 4 == 0) && (any % 100 != 0 || (any % 400 == 0))
                           ? "SI" : "NO");
        
        System.out.println(!(any % 4 == 0) || (any % 100 == 0 && (any % 400 != 0))
                           ? "NO" : "SI");
        
        
        
    }
}
