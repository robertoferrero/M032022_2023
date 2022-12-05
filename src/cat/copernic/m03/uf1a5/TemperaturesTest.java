/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a5;

/**
 *
 * @author rferrero
 */
public class TemperaturesTest {
    
    public static void main(String[] args) {
        
        /*float[] temperatures = new float[12];
        
        temperatures[0] = 3.6f;
        temperatures[1] = 4.5f;
        temperatures[2] = 12.6f;
        temperatures[11] = 3f;*/
        
        float[] temperatures = {3.6f, 4.5f,12.6f,22.4f,27.8f};
        
        System.out.println("Longitud de l'array: " + temperatures.length);
        
        int[][] caselles = new int[4][5];
        //caselles[1][3] = 34;
        
        int[][] m = {{1,7,9,4,8},{5,10,14,-3,1}};
        
        // Temperatures
        for (int i = 0; i < temperatures.length; ++i) 
        {
            System.out.println(temperatures[i]);
        }
        
        // Matriu m
        System.out.println("Total files   : " + m.length);
        System.out.println("Total columnes: " + m[0].length);
        for (int fila = 0; fila < m.length; fila++)
        {
            for (int col = 0; col < m[0].length; col++)
            {
                System.out.println("Element[" + fila + "][" + col + "]" +
                                   " = " + m[fila][col]);
            }
        }
        
        // Temperatures for-each
        System.out.println("Temperatures for-each:");
        for(float valor : temperatures)        
            System.out.print(valor + " ");
        
        System.out.println("");
        
        
        // matriu m for-each
        System.out.println("Matriu m for-each:");
        for (int[] fila : m) {
            for (int valor : fila)
            {
                System.out.print(valor + "\t");
            }
            System.out.println("");
        }
            
        
        
    }
}
