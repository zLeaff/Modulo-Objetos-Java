/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalEj03;

/**
 *
 * @author JB
 */
public class Principal {
    
    
    public static void main(String[] args){
    
        // Instanciar un evento ocasional
        Evento eventoOcasional = new Evento("Banda XYZ", 10, "beneficio", "Organización ABC", 10);
        
        // Agregar temas al evento ocasional
        eventoOcasional.agregarTema("Tema 1");
        eventoOcasional.agregarTema("Tema 2");
        eventoOcasional.agregarTema("Tema 3");
        eventoOcasional.agregarTema("Tema 4");
        eventoOcasional.agregarTema("Tema 5");
        eventoOcasional.agregarTema("Tema 6");
        eventoOcasional.agregarTema("Tema 7");
        eventoOcasional.agregarTema("Tema 8");
        eventoOcasional.agregarTema("Tema 9");
        eventoOcasional.agregarTema("Tema 10");
        
        // Imprimir costo y llamar a actuar para el evento ocasional
        System.out.println("Costo del evento ocasional: $" + eventoOcasional.calcularCosto());
        System.out.println("Actuación del evento ocasional:");
        System.out.println(eventoOcasional.actuar());
        
        // Instanciar una gira
        Gira gira = new Gira("Banda ABC", 12, "Gira Mundial", 5);
        
        // Agregar fechas a la gira
        gira.agregarFecha(new Fecha("Ciudad 1", 1));
        gira.agregarFecha(new Fecha("Ciudad 2", 3));
        gira.agregarFecha(new Fecha("Ciudad 3", 5));
        gira.agregarFecha(new Fecha("Ciudad 4", 7));
        gira.agregarFecha(new Fecha("Ciudad 5", 9));
        
        // Agregar temas a la gira
        gira.agregarTema("Canción 1");
        gira.agregarTema("Canción 2");
        gira.agregarTema("Canción 3");
        gira.agregarTema("Canción 4");
        gira.agregarTema("Canción 5");
        gira.agregarTema("Canción 6");
        gira.agregarTema("Canción 7");
        gira.agregarTema("Canción 8");
        gira.agregarTema("Canción 9");
        gira.agregarTema("Canción 10");
        gira.agregarTema("Canción 11");
        gira.agregarTema("Canción 12");
        
        // Imprimir costo y llamar a actuar para la gira
        System.out.println("\nCosto de la gira: $" + gira.calcularCosto());
        System.out.println("Actuación de la gira:");
        System.out.println(gira.actuar());
    
        System.out.println(gira.actuar());
        
    }
}
