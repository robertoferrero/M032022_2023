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
public class Ex03_ComptaMajusMinus {

    public static void main(String[] args) {
        
	Scanner sc = new Scanner(System.in);
        
	System.out.print("Introdueix una frase: ");
	String frase = sc.nextLine();
        
        int majuscules = 0, minuscules = 0;
        
        for (int i = 0; i < frase.length(); ++i)
        {
            if (Character.isUpperCase(frase.charAt(i)))            
                    ++majuscules;
            else if (Character.isLowerCase(frase.charAt(i)))
                    ++minuscules;
            
        }
        System.out.println("La frase conté " + majuscules + " majúscules");
        System.out.println("La frase conté " + minuscules + " minúscules");
        System.out.println("La frase conté " + 
             (frase.length() - majuscules -  minuscules) + " altres caràcters");
    }    
}
