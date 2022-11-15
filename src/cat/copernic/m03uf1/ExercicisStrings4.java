/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03uf1;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class ExercicisStrings4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un nombre binari: ");        
        String binari = sc.nextLine();
        
        int decimal = 0, posicioU = -1;
        /*
        Opció 1:
        do 
        {
            posicioU = binari.indexOf("1",posicioU + 1);
            
            if (posicioU != -1)
            {
                int exponent = binari.length() - 1 - posicioU;
                decimal += (int)Math.pow( 2, exponent);
            }
        } while(posicioU != -1);*/
        
        
        // Opció 2
        for (int i = 0; i < binari.length(); ++i)
        {
            if (binari.charAt(i) == '1')                                       
                decimal += (int)Math.pow( 2, binari.length() - 1 - i);            
        }
                
        System.out.println("El valor en decimal és: " + decimal);

        System.out.print("Introdueix un nombre hexadecimal: ");        
        String hexadecimal = sc.nextLine();
        // Opció hexadecimal 1
        decimal = 0;        
        for (int i = 0; i < hexadecimal.length(); ++i)
        {
            if (hexadecimal.charAt(i) != '0')
            {   
                int val = hexadecimal.charAt(i) - '0';
                if (hexadecimal.charAt(i) - '0' > 9 && 
                    hexadecimal.charAt(i) - '0' >= 1)
                {
                    val = hexadecimal.charAt(i) - '0';
                }
                else
                {
                    val = hexadecimal.charAt(i) - '0' - 7;
                }
                
                decimal += val*(int)Math.pow( 16, hexadecimal.length() - 1 - i);
            }
        }        
        
        /* Opció hexadecimal 2
        for (int i = 0; i < hexadecimal.length(); ++i)
        {
            if (hexadecimal.charAt(i) != '0')
            {   
                int val = hexadecimal.charAt(i) - '0';
                if (hexadecimal.charAt(i) - '0' > 9)
                    val -= 7;                                
                decimal += val*(int)Math.pow( 16, hexadecimal.length() - 1 - i);
            }
        } */       
        
        System.out.println("El valor en decimal és: " + decimal);
    }
    
}
