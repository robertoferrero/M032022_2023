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
public class OperadorTernari {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la teva edat: ");
        int edat = sc.nextInt();
        
        //String missatge = (edat >= 18) ? "Major d'edat" : "Menor d'edat";
        
        System.out.println((edat >= 18) ? "Major d'edat" : "Menor d'edat");
        
    }
}
