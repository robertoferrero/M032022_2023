/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class ReplaceAll {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix una cadena: ");
        String cadena = sc.nextLine();
        
        // Demana i comprova text a substituir
        String textASubstituir;
        boolean longitudCorrecta = false;
        do {
            System.out.print("Text a substituir    : ");
            textASubstituir = sc.nextLine();
            if (textASubstituir.length() > cadena.length()) {
                System.out.println("Text massa llarg!");
            } else
                longitudCorrecta = true;
        } while(!longitudCorrecta);
        
        // Demana i comprova text nou
        String textNou;
        longitudCorrecta = false;
        do {
            System.out.print("Text nou             : ");
            textNou = sc.nextLine();
            if (textNou.length() == 0) {
                System.out.println("Has d'introduir un text!");
            } else
                longitudCorrecta = true;
        } while(!longitudCorrecta);
        
        // Implementació de ReplaceAll
        String novaCadena = "";
        int indexAnterior = 0;
        int index = cadena.indexOf(textASubstituir,indexAnterior);
        int comptador = 0;
        while (index != -1) {
            novaCadena += cadena.substring(indexAnterior,index) + textNou ;
            indexAnterior = index + textASubstituir.length();
            comptador++;
            index = cadena.indexOf(textASubstituir,indexAnterior);
        }
        novaCadena += cadena.substring(indexAnterior);
        System.out.println("Cadena nova: " + novaCadena);
        System.out.println("Total substitucions: " + comptador);
    }
}