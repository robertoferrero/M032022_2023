/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03.uf1.pa1.robertoferrero;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class TriangleDeCostat {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int ampladaTriangle = 0;
        boolean dadaCorrecta = false;
        while (!dadaCorrecta)
        {
            System.out.print("Introdueix un nombre natural més gran que 1: ");
            if (sc.hasNextInt()) 
            {
                ampladaTriangle = sc.nextInt();
                if (ampladaTriangle > 1)
                    dadaCorrecta = true;
                else
                    System.out.println("ERROR: L'entrada no és vàlida");
            }
            else 
            {
                System.out.println("ERROR: L'entrada no és vàlida");
                sc.nextLine();
            }
        }
        
        
        /*
        for (int fila = 1; fila <= ampladaTriangle; ++fila)
        {
            for (int col = 1; col <= fila; ++col)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int fila = ampladaTriangle - 1; fila >= 1; --fila)
        {
            for (int col = 1; col <= fila; ++col)
            {
                System.out.print("*");
            }
            System.out.println("");
        } 
        */
        int numColumnes = 0;
        for (int fila = 1; fila <= ampladaTriangle*2 -1 ; ++fila)
        {
            
            if (fila <= ampladaTriangle)
                numColumnes++;
            else
                numColumnes--;
            
            for (int col = 1; col <= numColumnes; ++col)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        numColumnes = 0;
        for (int fila = 1; fila <= ampladaTriangle*2 -1 ; ++fila)
        {
            
            if (fila <= ampladaTriangle)
                numColumnes++;
            else
                numColumnes--;
            
            /*
            char caracter;
            
            if (fila % 2 != 0)
                caracter = '1';
            else
                caracter = '0';
            */
            for (int col = 1; col <= numColumnes; ++col)
            {
                char caracter = ((fila + col) % 2 == 0) ? '1' : '0';
                /*if ((fila + col) % 2 == 0)
                    caracter = '1';
                else
                    caracter = '0';*/

                System.out.print(caracter);
            }
            System.out.println("");
        }        
        
    }
}
