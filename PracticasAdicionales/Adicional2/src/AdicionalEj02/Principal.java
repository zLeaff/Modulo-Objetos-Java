/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalEj02;

/**
 *
 * @author JB
 */
import PaqueteLectura.Lector;
public class Principal {
    
    public static void main(String[] args) {
        // Instanciamos un estacionamiento con 3 pisos y 3 plazas por piso
        Estacionamiento estacionamiento = new Estacionamiento("Mi Estacionamiento", "123 Calle Principal", 9, 21, 3, 3);

        // Registramos 6 autos en el estacionamiento en distintos lugares
        estacionamiento.registrarAuto(new Auto("Juan", "ABC123"), 1, 1);
        estacionamiento.registrarAuto(new Auto("María", "XYZ789"), 2, 2);
        estacionamiento.registrarAuto(new Auto("Pedro", "DEF456"), 3, 3);
        estacionamiento.registrarAuto(new Auto("Laura", "GHI789"), 1, 2);
        estacionamiento.registrarAuto(new Auto("Carlos", "JKL012"), 2, 1);
        estacionamiento.registrarAuto(new Auto("Ana", "MNO345"), 3, 1);

        // Muestra la representación String del estacionamiento en consola
        System.out.println(estacionamiento);

        // Muestra la cantidad de autos ubicados en la plaza 1
        int cantidadAutosPlaza1 = estacionamiento.cantidadAutosEnPlaza(1);
        System.out.println("Cantidad de autos en la plaza 1: " + cantidadAutosPlaza1);

        // Lee una patente por teclado e informa si el auto se encuentra en el estacionamiento
        // En este ejemplo, supondremos que la patente ingresada es "XYZ789"
        System.out.println("Ingrese patente a buscar: ");
        String patenteBuscada = Lector.leerString();
        System.out.println(estacionamiento.obtenerUbicacionPorPatente(patenteBuscada));
        estacionamiento.registrarAuto(new Auto("Juan", "ABC123"), 2, 2);
        
    }
}
