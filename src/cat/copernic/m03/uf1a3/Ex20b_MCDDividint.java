/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a3;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex20b_MCDDividint {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueixi un nombre natural: ");        
        int m = sc.nextInt();
        
        System.out.print("Introdueixi un altre nombre natural: ");        
        int n = sc.nextInt();
        
                
        
        if (m != 0 && n != 0)
        {
            int residu = m % n;
            while (residu != 0) {
                System.out.println(m + " % " + n + " = " + residu);
                m = n;
                n = residu;
                residu = m % n;            
            }
            System.out.println(m + " % " + n + " = " + residu);

            System.out.println("MCD = " + n);
        }
        else
        {
            /*int mcd;
            if (n == 0)
                mcd = m;
            else
                mcd = n;*/
            
            int mcd = (n == 0) ? m : n;
            
            System.out.println("MCD = " + mcd);
        }
        
    }
}
