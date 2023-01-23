/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.uf1a5;

/**
 *
 * @author rferrero
 */
public class Temperatures {
    
    public static void main(String[] args) {
        
        int[] temperatures = new int[24];
        
        temperatures[0] = 12;
        temperatures[1] = 13;
        
        for (int i = 0; i < temperatures.length; i++)
        {
            System.out.println("Temperatura a les " + i + "h: " + 
                     temperatures[i] + "ºC");
        }
    }
}
