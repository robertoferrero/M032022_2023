package cat.copernic.m03.uf1a4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// opcional: import cat.copernic.m03.uf1a4.Marca;
/**
 *
 * @author rferrero
 */
public class Enumeracions {
 
    public static void main(String[] args) {
        
        // Marques: Peugeot, Seat, Citroen, Mercedes
        
        /*
        Marca marca = Marca.Peugeot;
        
        //marca = "Peuget";
        
        if (marca == Marca.Peugeot) {
            System.out.println("Marca Peugeot");
        } 
        else if (marca == Marca.Seat) {
            System.out.println("Marca Seat está roto");
        }
        */
        
        enum Equip {Alemanya, Franca, Espanya, Corea, Brasil};
        
        Equip equip = Equip.Alemanya;
        
        System.out.println("Nom equip: " + equip);
        if (equip == Equip.Alemanya )
            System.out.println("Aquest equip sempre guanya");
            
        else
            System.out.println("Aquest equip perd");
    }
}
