/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03uf1;

/**
 *
 * @author rferrero
 */
public class OperadorsRelacionals {
    
    public static void main(String[] args) {
        
        /*
        System.out.println('G' < 'B');
        System.out.println('a' < 'B');
        System.out.println(0.1 + 0.1 + 0.1);
        
        System.out.println((5 == 5) | (5 < 4));
        System.out.println((5 == 5) ^ (5 < 6));
        
        System.out.println(6 | 3);
        System.out.println(6 & 3);
        
        System.out.println(6 << 1);
        System.out.println(6 >> 1);
        */
        
        int quantitat = 42;
        int delta     = 7;
        
        System.out.println(quantitat == 42);
        System.out.println(quantitat < 20);
        System.out.println(quantitat != delta);
        int residu = quantitat % delta;
        
        System.out.println(delta >= residu);
        System.out.println(quantitat & delta);
        System.out.println(quantitat | delta);
        System.out.println(quantitat << 1);
        System.out.println(quantitat >> 2);
        
        boolean resultat = false;
        System.out.println(!resultat);
        
        System.out.println(quantitat > 30 || delta == 0);
        
        
    }
}
