/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex15_TriangleIsosceles {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //System.out.print("Introdueix l'alçada del triangle isòsceles: ");
        double alcada = sc.nextDouble();
        
        //System.out.print("Introdueix l'amplada del triangle isòsceles: ");
        double amplada = sc.nextDouble();
        
        double perimetre = 2*Math.sqrt(alcada*alcada + (amplada/2)*(amplada/2)) 
                                                                      + amplada;
        
        //System.out.printf("El perímetre del triangle és: %.2f\n",perimetre);
        System.out.printf("Perímetre: %.2f\n",perimetre);
        
        System.out.printf("Superfície: %.2f\n",amplada*alcada/2);
    }
}
