/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03.uf1.pa2.robertoferrero;

import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class FraseDesordenada {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix una frase: ");
        String fraseOriginal = sc.nextLine();
        
        String[] paraulesOriginal = fraseOriginal.split(" ");
        
        String[] paraulesDesordenades = new String[paraulesOriginal.length];
        int[] posicions = new int[paraulesOriginal.length];
        boolean[] posicionsOcupades = new boolean[paraulesOriginal.length];
        
        for (int i = 0; i < paraulesOriginal.length; ++i) {
            boolean paraulaReubicada = false;
            while (!paraulaReubicada) {
                int index = (int)(Math.random()*paraulesOriginal.length);
                if (!posicionsOcupades[index]) {
                    paraulesDesordenades[index] = paraulesOriginal[i];
                    posicions[index] = i;
                    posicionsOcupades[index] = true;
                    paraulaReubicada = true;
                }
            }
        }
        
        // Mostra frase desordenada
        System.out.print("Frase desordenada   : ");
        for (String paraula : paraulesDesordenades)
            System.out.print(paraula + " ");
        System.out.println("");
        
        // Alternativa 1
        // Reordenem la frase
        String[] paraulesReordenades = new String[paraulesDesordenades.length];
        for (int i = 0; i < paraulesReordenades.length; ++i)
            paraulesReordenades[posicions[i]] = paraulesDesordenades[i];
        
        // Mostra frase reordenada
        System.out.print("Frase reordenada    : ");
        for (String paraula : paraulesReordenades)
            System.out.print(paraula + " ");
        System.out.println("");
        
        
        // Alternativa 2
        /*System.out.print("Frase reordenada    : ");
        for (int i = 0; i < posicions.length; ++i) {
            int pos = 0;
            while (posicions[pos] != i && pos < posicions.length)
                pos++;
            System.out.print(paraulesDesordenades[pos] + " ");
        }
        System.out.println("");*/
    }
}