/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex02_CalculsVector {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final int TOTAL = 10;
        
        int[] valors = new int[TOTAL];
        
        for (int i = 0; i < valors.length; ++i)
        {
            //System.out.print("Introdueix el valor de la posició " + i + ": ");
            valors[i] = sc.nextInt();
        }

        int suma = 0;
        double mitjana = 0;
        int min = valors[0];       
        
        for (int i = 0; i < valors.length; ++i)
        {
            if (valors[i] < min)
                min = valors[i];
            
            suma = suma + valors[i];
        }
        System.out.print("La mitjana aritmètica dels valors del vector és: ");
        mitjana = (double)suma/valors.length;
        System.out.printf("%.5f\n",mitjana);
        System.out.println("El valor mínim del vector és: " + min);
        System.out.println("La suma dels valors del vector és: " + suma);
        
    }
}
