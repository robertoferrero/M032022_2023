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
public class Faulhaber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = 1,p = 1;
        while (n != 0 || p != 0)
        {
            System.out.print("Introdueix el valor de n: ");
            n = sc.nextInt();        

            System.out.print("Introdueix el valor de p: ");
            p = sc.nextInt();

            long total = 0;
            for (int i = 1; i <= n; i++)
            {
                // Potencia = Math.pow(i,p)
                long potencia = 1;
                for (int j = 1; j <= p; j++)
                {
                    potencia = potencia * i;
                }
                total += potencia;
            }

            System.out.println("Resultat de la fórmula de Faulhaber: " + total);
        }
        System.out.println("Fi del programa");
    }
}
