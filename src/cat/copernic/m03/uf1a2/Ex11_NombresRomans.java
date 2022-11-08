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
public class Ex11_NombresRomans {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueixi un nombre natural entre 1 i 3999: ");        
        int any = sc.nextInt();
        
        String romans = "";
        System.out.print("El nombre en romans és: ");
        if (any >= 1 && any <= 3999)    // Dins del rang
        {
            // Milers: M,MM,MMM
            int milers = any / 1000;
            if (milers == 1)
                romans = "M";
            else if (milers == 2)
                romans = "MM";
            else if (milers == 3)
                romans = "MMM";
            
            int centenes = (any % 1000) / 100;
            /*
                100 = C
                200 = CC
                300 = CCC
                400 = CD
                500 = D
                600 = DC
                700 = DCC
                800 = DCCC
                900 = CM
            */
            switch (centenes) 
            {
                case 1:
                    //romans = romans + "C";
                    romans += "C";
                    break;
                case 2:
                    romans += "CC";
                    break;
                case 3:
                    romans += "CCC";
                    break;
                case 4:
                    romans += "CD";
                    break;
                case 5:
                    romans += "D";
                    break;
                case 6:
                    romans += "DC";
                    break;
                case 7:
                    romans += "DCC";
                    break;
                case 8:
                    romans += "DCCC";
                    break;
                case 9:
                    romans += "CM";
                    break;                                        
            }
            
        }
        else                            // Fóra del rang
        {
            System.out.println("ERROR");
        }
        
        System.out.println(romans);
    }
}
