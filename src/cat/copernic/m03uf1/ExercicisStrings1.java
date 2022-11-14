/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03uf1;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class ExercicisStrings1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix una data: ");
        
        String data = sc.nextLine();
        
        int posBarraDia = data.indexOf("/");
        if (posBarraDia >= 0)
        {
            int dia = Integer.parseInt(data.substring(0,posBarraDia));

            int posBarraMes = data.indexOf("/",posBarraDia + 1);        
            int mes = Integer.parseInt(data.substring(posBarraDia + 1,posBarraMes));

            int posEspai = data.indexOf(" ",posBarraMes + 1);
            int any = Integer.parseInt(data.substring(posBarraMes + 1,posEspai));

            int posDosPunts = data.indexOf(":",posEspai + 1);
            int hora = Integer.parseInt(data.substring(posEspai + 1,posDosPunts));

            int minuts = Integer.parseInt(data.substring(posDosPunts + 1));
            System.out.println("Dia: " + dia);
            System.out.println("Mes: " + mes);
            System.out.println("Any: " + any);
            System.out.println("Hora  : " + hora);
            System.out.println("Minuts: " + minuts);
        }
        else
            System.out.println("Error: No s'ha trobat la /");
        
        //System.out.println("      ho la     ".trim());
    }
}
