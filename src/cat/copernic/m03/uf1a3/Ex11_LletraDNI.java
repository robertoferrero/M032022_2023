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
public class Ex11_LletraDNI {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix un DNI: ");
        int dni = entrada.nextInt();

        String lletres = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        int residu = dni % 23;
        char lletra = lletres.charAt(residu);
        
        System.out.println("El DNI amb lletra és: " + dni + "-" + lletra);
        
        /*switch (residu)
        {
            case 0:
                lletra = 'T';
                break;
            case 1:
                lletra = 'R';
                break;
            case 2:
                lletra = 'W';
                break;
            case 3:
                lletra = 'A';
                break;
            case 4:
                lletra = 'G';
                break;
            case 5:
                lletra = 'M';
                break;
            case 6:
                lletra = 'Y';
                break;
            case 7:
                lletra = 'F';
                break;
            case 8:
                lletra = 'P';
                break;
            case 9:
                lletra = 'D';
                break;
            case 10:
                lletra = 'X';
                break;
            case 11:
                lletra = 'B';
                break;
            case 12:
                lletra = 'N';
                break;
            case 13:
                lletra = 'J';
                break;
            case 14:
                lletra = 'Z';
                break;
            case 15:
                lletra = 'S';
                break;
            case 16:
                lletra = 'Q';
                break;
            case 17:
                lletra = 'V';
                break;                
            case 18:
                lletra = 'H';
                break;                
            case 19:
                lletra = 'L';
                break;                
            case 20:
                lletra = 'C';
                break;                
            case 21:
                lletra = 'K';
                break;                
            case 22:
                lletra = 'E';
                break;                
        }
        System.out.println("La lletra corresponent al DNI és: " + lletra);
        */
    }
     
}
