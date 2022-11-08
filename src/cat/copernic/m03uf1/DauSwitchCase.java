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
public class DauSwitchCase {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //System.out.print("Escriu què ha sortit al dau: ");
        //int valor = sc.nextInt();
        
        /*
        if (valor == 1)
            System.out.println("Ha sortit un 1");
        else if (valor == 2)
            System.out.println("Ha sortit un 2");
        else if (valor == 3)
            System.out.println("Ha sortit un 3");
        else if (valor == 4)
            System.out.println("Ha sortit un 4");
        else if (valor == 5)
            System.out.println("Ha sortit un 5");
        else
            System.out.println("Ha sortit un 6");
        */
        /*
        switch (valor) 
        {
            case 1:
                System.out.println("Ha sortit un 1");
                break;
            case 2:
                System.out.println("Ha sortit un 2");
                break;
            case 3:
                System.out.println("Ha sortit un 3");
                break;
            case 4:
                System.out.println("Ha sortit un 4");
                break;
            case 5:
                System.out.println("Ha sortit un 5");
                break;
            default:
                System.out.println("Ha sortit un 6");                
        }
        */
        System.out.print("Què vols fer (C|S): ");
        String opcio = sc.nextLine().toUpperCase();
        
        switch (opcio)
        {
            case "C":
            //case 'c':           
                System.out.println("Continuem el joc");
                break;            
            case "S":
            //case 's':
                System.out.println("Sortim del joc");
                break;
        }
    }
    
    
}
