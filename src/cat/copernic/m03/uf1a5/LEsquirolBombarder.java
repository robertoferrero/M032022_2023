/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cat.copernic.m03.uf1a5;

import java.util.Scanner;


/**
 *
 * @author rferrero
 */
public class LEsquirolBombarder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int FILES       = 11;
        final int COLUMNES    = 22;
        final int TOTALBOMBES = 3;
        
        
        Scanner sc = new Scanner(System.in);
        
        String presentacio = "  Lupin el MUSSOL ha amagat BOMBES per la ciutat\n" +
                "          desactiva-les abans no EXPLOTIN,\n" +
                "                 amb l'ajuda de\n" +
                "\n" +
                "    _      _                       _           _\n" +
                "   | |    ( )                     (_)         | |\n" +
                "   | |    |/  ___  ___  __ _ _   _ _ _ __ ___ | |\n" +
                "   | |       / _ \\/ __|/ _` | | | | | '__/ _ \\| |\n" +
                "   | |____  |  __/\\__ \\ (_| | |_| | | | | (_) | |\n" +
                "  _|______|  \\___||___/\\__, |\\__,_|_|_|  \\___/|_|\n" +
                " |  _ \\                | || |              | |\n" +
                " | |_) | ___  _ __ ___ | ||_|  __ _ _ __ __| | ___ _ __\n" +
                " |  _ < / _ \\| '_ ` _ \\| '_ \\ / _` | '__/ _` |/ _ \\ '__|\n" +
                " | |_) | (_) | | | | | | |_) | (_| | | | (_| |  __/ |\n" +
                " |____/ \\___/|_| |_| |_|_.__/ \\__,_|_|  \\__,_|\\___|_|\n" +
                "\n" +
                "\n" +
                "               (Prem [ENTER] per continuar)";

        
        System.out.println(presentacio);
        sc.nextLine();   
        
        // Crea i inicialitza el tauler
        char[][] tauler = new char[FILES-2][COLUMNES-2];
        for (int i = 0; i < tauler.length; i++) 
        {
            for (int j = 0; j < tauler[0].length; j++) 
            {
                tauler[i][j] = ' ';
            }
        }
        
        // Posició inicial de l'Esquirol
        int posXEsquirol = 0;
        int posYEsquirol = 0;        
        tauler[posXEsquirol][posYEsquirol] = 'E';
        
        // Posició inicial del Lupin
        int posXLupin = tauler.length-1;
        int posYLupin = tauler[0].length-1;
        tauler[posXLupin][posYLupin] = 'L';
        
        /* Mostrar el tauler */
        // Part superior
        for (int i = 0; i < COLUMNES; i++)        
            System.out.print("X");        
        System.out.println("");

        for (int i = 0; i < FILES-2; i++) {
            System.out.print("X");
            for (int j = 0; j < COLUMNES-2; j++)
                System.out.print(tauler[i][j]);            
            System.out.println("X");
        }
        // Part inferior
        for (int i = 0; i < COLUMNES; i++)        
            System.out.print("X");        
        System.out.println("");        
    }
    
}
