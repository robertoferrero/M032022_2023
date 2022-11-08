/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a3;

import java.util.Locale;

/**
 *
 * @author rferrero
 */
public class Duplica {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        double quantitatInicial = 1000;
        double quantitatFinal   = quantitatInicial;
        double tipusInteres = 1;  // percentatge
        int anys = 0;
        
        while (quantitatFinal < quantitatInicial * 2) 
        {
            anys++;
            quantitatFinal += quantitatFinal * tipusInteres / 100;
        }
     
        System.out.printf("La quantitat inicial és: %.2f €\n",quantitatInicial);
        System.out.printf("L'interès és del %.2f%%\n",tipusInteres);
        System.out.printf("La quantitat final és  : %.2f €\n",quantitatFinal);
        System.out.println("El total d'anys és     : " + anys);
    }
}
