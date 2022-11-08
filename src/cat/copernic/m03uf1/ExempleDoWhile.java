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
public class ExempleDoWhile {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int suma = valor;
        while (suma <= 20) //do 
        {
            valor = sc.nextInt();
            suma = suma + valor;
        } //while (suma <= 20);
        
        System.out.println("La suma acumulada és: " + suma);
    }
}
