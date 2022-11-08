/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03uf1;

/**
 *
 * @author rferrero
 */
public class SetmanesDiesHores {
    
    public static void main(String[] args) {
        
        int horesInicials = 1000;
        
        int setmanes = horesInicials/(24*7);                
        
        int horesResiduals = horesInicials - setmanes*24*7;
        //int horesResiduals = horesInicials % (24*7);
        
        //System.out.println(horesResiduals);
        int dies = horesResiduals/24;        
        
        //horesResiduals = horesResiduals - dies*24;
        horesResiduals -= dies*24;
        //horesResiduals = horesResiduals % 24;
        //horesResiduals %= 24;
        
        System.out.println(setmanes + " setmanes, " + dies + " dies, " + 
                           horesResiduals + " hores.");        
        
        
        
        
    }
}
