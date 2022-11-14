/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03uf1;

/**
 *
 * @author rferrero
 */
public class ExempleString {
    
    public static void main(String[] args) {
        
        String nom1 = new String("Pepe");        
        //System.out.println("Nom: " + nom1);
        
        String nom2 = "Carlos";
        //System.out.println("Nom: " + nom2);
        
        char[] nom = {'P','e','p','e'};
        String nom3 = new String(nom); 
        //System.out.println("Nom: " + nom3);
        
        String nom4 = "Carlos";
        
        //if (nom1.equals(nom3))
            //System.out.println("Els noms són iguals");
        //else
            //System.out.println("Els noms NO són iguals");
        
        //nom4 = nom4 + " ha guanyat un premi.";
        //System.out.println(nom4);
        
        int edat = 21;
        for (int i = 0; i < 10; i++)
        {
            //System.out.println("Hola: " + i);
        }
        
        // nom4 = "Carlos"
        System.out.println(nom4.charAt(0));
        
        String nom5 = "carlos";
        if (nom4.equalsIgnoreCase(nom5))
            System.out.println(nom4 + " és igual a " + nom5);
        else
            System.out.println(nom4 + " NO és igual a " + nom5);
        
    }
}
