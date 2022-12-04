/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a4;

/**
 *
 * @author rober
 */
public class Ex13_NomesLletresEspaisOrdenats {
    
    public static void main(String[] args) {
    
        String prova = "public static void mainString args ";

        String cadenaOrdenada = prova.substring(0,1);

        for (int i = 1; i < prova.length(); ++i) {  
            String lletraAInsertar = prova.substring(i,i+1);
            int j = 0;
            // Saltem tots els caràcters que estiguin alfabèticament abans del
            // que volem insertar
            while(j < cadenaOrdenada.length() && 
                  lletraAInsertar.compareTo(cadenaOrdenada.substring(j)) > 0)
                j++;
            
            // Mirem si hem sortit perquè hem trobat una posició on insertar
            // el caràcter o aquest és posterior alfabèticament i ha d'anar al
            // final
            if (j < cadenaOrdenada.length())
                cadenaOrdenada = cadenaOrdenada.substring(0,j) + lletraAInsertar + 
                        cadenaOrdenada.substring(j);
            else
                cadenaOrdenada += lletraAInsertar;
        }
        
        System.out.println(cadenaOrdenada);
    }

    
}
