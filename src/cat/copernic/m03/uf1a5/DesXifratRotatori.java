/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a5;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class DesXifratRotatori {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix la clau de xifrat [1-9]: ");
        int N = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Introduexi una frase xifrada:");
        String frase = sc.nextLine();
        
        String[] paraules = frase.split(" ");

        
        // Primer pas
        for (int i = 0; i < paraules.length; ++i) {
            char[] caracters = paraules[i].toCharArray();
            
            int desplacament = 0;
            do 
            {
                int posFinal = Math.min(N, caracters.length - desplacament) - 1;
                char lletraFinal = caracters[posFinal+desplacament];
                for (int j = posFinal; j >= 1; --j)
                {
                    caracters[j+desplacament] = caracters[j+desplacament-1];
                }
                caracters[desplacament] = lletraFinal;

                desplacament += N;

            } while(desplacament < caracters.length);
            paraules[i] = new String(caracters);
            
        }
        
        // Mostra frase desxifrada
        // aquest és un exemple de frase que anem a xifrar amb el codi secret
        // sé nu quaste ed rafes xeeplme neam a ueq mba le ifxarr ecsetr odci
        for (String paraula : paraules)
        {
            System.out.print(paraula + " ");
        }
        System.out.println("");        
        
    }
}
