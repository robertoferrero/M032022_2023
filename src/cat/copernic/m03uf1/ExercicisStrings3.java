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
public class ExercicisStrings3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix nom i cognom: ");        
        String nomYCognom = sc.nextLine();
        
        int posEspai = nomYCognom.indexOf(" ");
        String nom = nomYCognom.substring(0,posEspai);
        
        System.out.println("Nom   : " + nom);
        
        String cognom = nomYCognom.substring(posEspai + 1).trim();
        System.out.println("Cognom: " + cognom);
        
        return;
        
    }
}
