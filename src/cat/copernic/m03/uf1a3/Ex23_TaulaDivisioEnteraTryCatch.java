/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex23_TaulaDivisioEnteraTryCatch {
   
    // java.util.InputMismatchException
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        boolean entradaCorrecta = false;
        do
        {
            System.out.print("Introdueix un nombre natural: ");
            try
            {
                int n = sc.nextInt();
                if (n > 0)
                {
                    for (int i = 1; i <= 10; ++i)
                    {
                        System.out.println(n + " / " + i + ": quocient = " + 
                                        (n / i) + " i residu = " + (n % i));                
                    }
                    entradaCorrecta = true;
                }

            } catch (Exception e) {
                
            }
            sc.nextLine();
        } while(!entradaCorrecta);
        
    }            
}
