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
public class Ex14_GeneraCorreu {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String lletresProhibides  = "áàéèíïóòúüñç";
        String lletreAlternatives = "aaeeiioouunc";
        
        String lletra = "í";
        String nomAlter = "";
        int pos = 0;
        pos = lletresProhibides.indexOf(lletra);
        if (pos >= 0) // És prohibida
            nomAlter = nomAlter + lletreAlternatives.charAt(pos);
        else
            nomAlter = nomAlter + lletra;
        
        System.out.println(nomAlter);
            
                
                
    }
}
