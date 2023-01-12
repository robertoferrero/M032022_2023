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
public class PatroDesbloqueig {
    
        public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);

            int files    = sc.nextInt();
            int columnes = sc.nextInt();

            char[][] patroDesbloqueig = new char[files*2-1][columnes*2-1];
            for (int i = 0; i < 2*files - 1; ++i)
            {
                for (int j = 0; j < 2*columnes - 1; ++j)
                {
                    if (i % 2 == 0  &&  j % 2 == 0)
                        patroDesbloqueig[i][j] = '.';                    
                }
            }
            
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            
            sc.nextLine();
            
            String cadenaDesbloqueig = sc.nextLine();
            
            
            
            // Patró desbloqueig
            
            
        }

}
