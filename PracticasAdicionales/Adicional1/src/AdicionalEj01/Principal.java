/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalEj01;

/**
 *
 * @author JB
 */
public class Principal {
    
    public static void main(String[] args){
        // Crear el proyecto
        Proyecto proyecto = new Proyecto("Proyecto de Investigación", 1, "Director");

        // Crear tres investigadores
        Investigador investigador1 = new Investigador("Investigador 1", "Especialidad 1", 3);
        Investigador investigador2 = new Investigador("Investigador 2", "Especialidad 2", 4);
        Investigador investigador3 = new Investigador("Investigador 3", "Especialidad 3", 5);

        // Agregar investigadores al proyecto
        proyecto.agregarInvestigador(investigador1);
        proyecto.agregarInvestigador(investigador2);
        proyecto.agregarInvestigador(investigador3);

        // Crear dos subsidios para cada investigador
        Subsidio subsidio1 = new Subsidio(1000, "Motivo 1");
        Subsidio subsidio2 = new Subsidio(1500, "Motivo 2");
        
        Subsidio subsidio3 = new Subsidio(800, "Motivo 3");
        Subsidio subsidio4 = new Subsidio(1200, "Motivo 4");
        
        Subsidio subsidio5 = new Subsidio(2000, "Motivo 5");
        Subsidio subsidio6 = new Subsidio(750, "Motivo 6");

        // Agregar subsidios a los investigadores
        investigador1.agregarSubsidio(subsidio1);
        investigador1.agregarSubsidio(subsidio2);
        
        investigador2.agregarSubsidio(subsidio3);
        investigador2.agregarSubsidio(subsidio4);
        
        investigador3.agregarSubsidio(subsidio5);
        investigador3.agregarSubsidio(subsidio6);

        // Otorgar los subsidios de un investigador
        proyecto.otorgarTodos("Investigador 1");
        proyecto.otorgarTodos("Investigador 3");

        // Imprimir todos los datos del proyecto
        System.out.println(proyecto.toString());
    }
    
}
