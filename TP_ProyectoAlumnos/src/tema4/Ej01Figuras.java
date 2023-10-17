/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author JB
 */
public class Ej01Figuras {
    
    public static void main(String[] args){
        Circulo circ = new Circulo(4, "rojo", "gris");
        Triangulo tri = new Triangulo(2, 6, 7, "rojo", "blanco");
        
        System.out.println("Circulo " + circ.toString());
        System.out.println("Triangulo " + tri.toString());
        System.out.println(tri.calcularArea());
        
        System.out.println();
        circ.despintar();
        tri.despintar();
        System.out.println("Se despintan las figuras");
        System.out.println();
        
        System.out.println("Circulo " + circ.toString());
        System.out.println("Triangulo " + tri.toString());
    }
}
