/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a2;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex16_UnSegonMes {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hores : ");        
        int hores = sc.nextInt();        
        
        System.out.print("Minuts: ");        
        int minuts = sc.nextInt();
        
        System.out.print("Segons: ");        
        int segons = sc.nextInt();
        
        segons++;
        if (segons == 60)
        {
            minuts++;
            segons = 0;
            if (minuts == 60)
            {
                hores++;
                minuts = 0;
                if (hores == 24)
                    hores = 0;
            }
        }
        
        System.out.printf("Un segon després són les %02d:%02d:%02d%n",
                          hores,minuts,segons);
        
    }
}
