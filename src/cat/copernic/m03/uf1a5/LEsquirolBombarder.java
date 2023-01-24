/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cat.copernic.m03.uf1a5;

import java.io.IOException;
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
        
        // Posició de les bombes
        for (int i = 0; i < TOTALBOMBES; i++) {
            boolean posBombaCorrecte = false;
            while (!posBombaCorrecte) {
                int x = (int)(Math.random()*(tauler.length-1));
                int y = (int)(Math.random()*(tauler[0].length-1));                
                if (x > 0 && y > 0 && tauler[x][y] != '*') {
                    tauler[x][y] = '*';
                    posBombaCorrecte = true;
                }
            }
        }
        
        boolean finalPrograma = false;
        do {
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

            // Pregunta moviment l'esquirol
            System.out.print("Cap a on vols moure? [w, a, s ,d] ");
            // Llegim el moviment com un char
            // ??? Comprovar si realment ens han introduït un char (INTRO?)
            char moviment = sc.nextLine().charAt(0);

            switch (moviment) {
                case 'w':   // Up
                    if (posXEsquirol > 0 && 
                        tauler[posXEsquirol-1][posYEsquirol] != 'L') {
                        tauler[posXEsquirol][posYEsquirol] = ' ';
                        posXEsquirol--;                        
                    }                    
                    break;
                case 'a':   // Left
                    if (posYEsquirol > 0 && 
                        tauler[posXEsquirol][posYEsquirol-1] != 'L') {
                        tauler[posXEsquirol][posYEsquirol] = ' ';
                        posYEsquirol--;                        
                    }                     
                    break;
                case 's':   // Down
                    if (posXEsquirol < tauler.length-1 && 
                        tauler[posXEsquirol+1][posYEsquirol] != 'L') {
                        tauler[posXEsquirol][posYEsquirol] = ' ';
                        posXEsquirol++;
                    }
                    break;
                case 'd':   // Right
                    if (posYEsquirol < tauler[0].length-1 && 
                        tauler[posXEsquirol][posYEsquirol+1] != 'L') {
                        tauler[posXEsquirol][posYEsquirol] = ' ';
                        posYEsquirol++;                        
                    }                                         
                    break;
                case 'e':   // Esquirol fa explotar una bomba
                    break;
                case 't':   // Fer trampa
                    break;
                case 'q':   // Sortir
                    finalPrograma = true;
                    break;
            }
            tauler[posXEsquirol][posYEsquirol] = 'E';
            
            // Esborrem pantalla
            try {
  		if (System.getProperty("os.name").contains("Windows")) {
    		  new ProcessBuilder("cmd", "/c", "cls").
                          inheritIO().start().waitFor();
  		} else {
    	    		System.out.print("\033[H\033[2J");
    			System.out.flush();
  		}
            } catch (IOException | InterruptedException ex) {}
            
        } while(!finalPrograma);
    }
    
}
