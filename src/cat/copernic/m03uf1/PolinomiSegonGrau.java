/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03uf1;

/**
 *
 * @author rferrero
 */
public class PolinomiSegonGrau {
    
    public static void main(String[] args) {
        
        double a,b,c;
        
        a = 2;
        b = 3;
        c = -5;
        
        double x1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
        double x2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
        
        System.out.println("Resultat 1: " + x1);
        System.out.println("Resultat 2: " + x2);
        
    }
}
