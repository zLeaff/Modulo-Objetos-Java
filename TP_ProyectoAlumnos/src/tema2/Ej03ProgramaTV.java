/*
 3- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en
    cada día se entrevistarán a 8 personas en distinto turno.
    a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
    nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
    personas primero completan el primer día en turnos sucesivos, luego el segundo día y así
    siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los
    40 cupos de casting.
    Una vez finalizada la inscripción:
    b) Informar para cada día y turno asignado, el nombre de la persona a entrevistar.
    NOTA: utilizar la clase Persona. Pensar en la estructura de datos a utilizar. Para comparar
    Strings use el método equals.
 */
package tema2;

/**
 *
 * @author JB
 */
import PaqueteLectura.Lector;
public class Ej03ProgramaTV {
    
    public static void main(String[] args){
        String corte = "ZZZ";
        int dias = 5;
        int turnos = 8;
        Persona[][] matriz = new Persona[dias][turnos];
        
        int i = 0;
        
        Persona p = new Persona();
        
        System.out.print("Nombre: ");
        p.setNombre(Lector.leerString());
        while (i < dias && !p.getNombre().equals(corte)){
            int j = 0;
            while (j < turnos && !p.getNombre().equals(corte)){
                System.out.print("DNI: ");
                p.setDNI(Lector.leerInt());            
                System.out.print("Edad: ");
                p.setEdad(Lector.leerInt());
                matriz[i][j] = p;
                j++;
                p = new Persona();
                System.out.print("Nombre: ");
                p.setNombre(Lector.leerString()); 
            }
            if(!p.getNombre().equals(corte))
                i++;
        }
        
        i = 0;
        boolean nullEncontrado = false;
        while (i < dias && !nullEncontrado){
            int j = 0;
            while(j < turnos && !nullEncontrado){
                if(matriz[i][j] != null){
                    System.out.println("Dia " + (i + 1) + " turno " + (j + 1) + " le corresponde a " + matriz[i][j].getNombre());
                    j++;
                }
                else
                    nullEncontrado = true;
            }
            if (!nullEncontrado)
                i++;
        };
        
    }
}
