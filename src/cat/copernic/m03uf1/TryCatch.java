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
public class TryCatch {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        /*
        System.out.print("Introdueix el numerador: ");        
        int numerador = sc.nextInt();

        System.out.print("Introdueix el denominador: ");        
        int denominador = sc.nextInt();
       */
        // Demanant permís
        /*if (denominador == 0)
            System.out.println("El denominador no pot ser 0");
        else
            System.out.println("Quocient:" + numerador/denominador);
        */
        
        // Demanant perdó
        try {
            System.out.print("Introdueix el numerador: ");        
            int numerador = sc.nextInt();

            System.out.print("Introdueix el denominador: ");        
            int denominador = sc.nextInt();
            
            System.out.println("Quocient:" + numerador/denominador);        
        } 
        catch (java.lang.ArithmeticException error1) {
            System.out.println("El denominador no pot ser 0");
            System.out.println("Descripció de l'error: " + error1.getMessage());
        } 
        catch (java.util.InputMismatchException error2) {
            System.out.println("Els valors han de ser enters");
        }
        
    }
}
