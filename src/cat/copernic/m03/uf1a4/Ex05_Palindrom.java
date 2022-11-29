/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex05_Palindrom {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix una frase: ");
        
        String frase = sc.nextLine();
        
        String fraseSenseEspais = "";
        for (int i = 0; i < frase.length(); ++i)
        {
            if (frase.charAt(i) != ' ')
                fraseSenseEspais += frase.charAt(i);
        }
        System.out.println("Frase sense espais  : " + fraseSenseEspais);
    }
}
