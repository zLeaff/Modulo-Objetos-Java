/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ej02;

/**
 *
 * @author JB
 */
public class Principal {
    
    public static void main(String[] args){
        Jugador jugador = new Jugador(100, 60, "Lionel Messi", 100000, 20);
        Entrenador entrenador = new Entrenador(8, "Pep Guardiola", 80000, 10);

        System.out.println(jugador.toString());
        System.out.println(jugador.calcularSueldoACobrar());
        
        System.out.println(entrenador.toString());
    }
}
