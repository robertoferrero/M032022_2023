/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cat.copernic.m03uf1;

/**
 *
 * @author rferrero
 */
public class OperadorsAritmetics {
 
    public static void main(String[] args) {
        

        //System.out.println(a);
        
        int quantitat = 42, delta = 5, residu = 0;
        String nom = "Roberto";
        
        //quantitat + delta -> quantitat
        quantitat += delta;
        System.out.println(quantitat);
        
        // quantitat % 2 -> residu
        residu = quantitat % 2;
        System.out.println(residu);
        
        // quantitat % 5 -> quantitat
        quantitat %= 5;
        System.out.println(quantitat);
        
        // --quantitat -> residu
        residu = --quantitat;
        System.out.println("quantitat = " + quantitat);
        System.out.println("residu    = " + residu);
        
        // delta++ -> quantitat
        quantitat = delta++;
        System.out.println("quantitat = " + quantitat);
        System.out.println("delta     = " + delta);
        
        // delta++ -> quantitat
        quantitat = ++delta;
        System.out.println("quantitat = " + quantitat);
        System.out.println("delta     = " + delta);
        
        // quantitat / 7 -> quantitat
        quantitat /= 7;
        System.out.println("quantitat = " + quantitat);
        
        int a = 7, b = 12;
        int c = (++a + b ) % 3;
        
        
        System.out.println(c);
        
        
    }
}
