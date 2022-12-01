/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a4;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ex14_GeneraCorreu {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introdueix el teu nom: ");
        String nom = entrada.nextLine().toLowerCase();
        
        System.out.print("Introdueix els teus cognoms: ");
        String cognoms = entrada.nextLine().toLowerCase();
        
        // Separem cognom1 i cognom2
        int pos = cognoms.indexOf(" ");
        String cognom1 = cognoms.substring(0,pos);
        String cognom2 = cognoms.substring(pos+1);

        final String caractersNoPermesos = "áàéèíóòúçñ";
        final String caractersPermesos   = "aaeeiooucn";
        
        // Canviem el nom i cognoms amb caràcters ASCII
        for (int i = 0; i < caractersNoPermesos.length(); ++i)
        {
            nom     = nom.replace(caractersNoPermesos.substring(i, i + 1), caractersPermesos.substring(i ,i + 1));
            cognom1 = cognom1.replace(caractersNoPermesos.substring(i, i + 1), caractersPermesos.substring(i ,i + 1));
            cognom2 = cognom2.replace(caractersNoPermesos.substring(i, i + 1), caractersPermesos.substring(i ,i + 1));
        }

        System.out.println("La teva adreça de correu és: ");
        System.out.println(cognom1 + "." + cognom2 + "." + nom + "@alumnat.copernic.cat");
        
        entrada.close();
	}    
}
