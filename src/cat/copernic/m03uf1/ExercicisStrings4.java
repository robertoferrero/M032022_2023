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
                int val = 0;
                switch (hexadecimal.charAt(i))
                {
                    case '1':
                        val = 1;
                        break;
                    case '2':
                        val = 2;
                        break;
                    case '3':
                        val = 3;
                        break;
                    case '4':
                        val = 4;
                        break;
                    case '5':
                        val = 5;
                        break;
                    case '6':
                        val = 6;
                        break;
                    case '7':
                        val = 7;
                        break;
                    case '8':
                        val = 8;
                        break;
                    case '9':
                        val = 9;
                        break;
                    case 'A':
                        val = 10;
                        break;
                    case 'B':
                        val = 11;
                        break;
                    case 'C':
                        val = 12;
                        break;
                    case 'D':
                        val = 13;
                        break;
                    case 'E':
                        val = 14;
                        break;
                    case 'F':
                        val = 15;
                        break;

                }
                
                decimal += val*(int)Math.pow( 16, hexadecimal.length() - 1 - i);
            }
        } 

        
        // Opció hexadecimal 2
        /*
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
        */
        /* Opció hexadecimal 3
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
