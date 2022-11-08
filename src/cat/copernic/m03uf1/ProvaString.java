/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03uf1;

/**
 *
 * @author rferrero
 */
public class ProvaString {
    
    public static void main(String[] args) {
        String nom = "Josep";
        
        String altreNom = new String(nom);               
        System.out.println(altreNom);
        
        String unAltreNom = new String("Joan");
        System.out.println(unAltreNom);
        
        char lletres[] = {'J','o','r','d','i'};
        String altreMes = new String(lletres);
        System.out.println(altreMes);
        
        int val = 123456;
        String valor = String.valueOf(val);
        System.out.println(valor);
        System.out.print("Caràcter de la posició 3: ");
        System.out.println(valor.charAt(3));
        
        String nom1 = "Jordi";
        String nom2 = "Jordi";
        
        System.out.println(nom1.equals(nom2));
        
        char lletres2[] = {'J','o','r','d','i'};
        String nom3 = new String(lletres2);
        System.out.println(nom3);
        
        System.out.println(nom1.equals(nom3));
        
        String quantitat = "120";
        int quantitatI = Integer.parseInt(quantitat);
        System.out.println(quantitat + 5);
        System.out.println(quantitatI + 5);
        
        Integer valInt = 450;
        String valorFinal = valInt.toString();
        System.out.println(valorFinal + 8);
        
    }
}
