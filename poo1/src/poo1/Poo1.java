/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1;

/**
 *
 * @author migue
 */
public class Poo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Usuario usuario1 = new Usuario("Miguel",18);
     Usuario usuario2 = new Usuario("Juan",20);
     
     int sumaEdades = usuario1.getEdad() + usuario2.getEdad();
        System.out.println(sumaEdades);
    }
    
}
