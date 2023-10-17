/*
    4- Sobre un nuevo programa, modifique el ejercicio anterior para considerar que:
    a) Durante el proceso de inscripción se pida a cada persona sus datos (nombre, DNI, edad)
    y el día en que se quiere presentar al casting. La persona debe ser inscripta en ese día, en el
    siguiente turno disponible. En caso de no existir un turno en ese día, informe la situación.
    La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los 40 cupos
    de casting.
    Una vez finalizada la inscripción:
    b) Informar para cada día: la cantidad de inscriptos al casting ese día y el nombre de la
    persona a entrevistar en cada turno asignado.
 */
package tema2;

/**
 *
 * @author JB
 */
import PaqueteLectura.Lector;
public class Ej04ProgramaTV2 {
    
    public static void main(String[] args){
        String corte = "ZZZ";
        int dias = 5;
        int turnos = 8;
        int diasTotales = dias * turnos;
        Persona[][] matriz = new Persona[dias][turnos];
        
        int cantidad = 0;
        Persona p = new Persona();
        
        System.out.print("Nombre: ");
        p.setNombre(Lector.leerString());
        while (cantidad < diasTotales && !p.getNombre().equals(corte)){
            System.out.print("DNI: ");
            p.setDNI(Lector.leerInt());            
            System.out.print("Edad: ");
            p.setEdad(Lector.leerInt());
              
            System.out.print("Dia(1-5): ");
            int dia = Lector.leerInt();
            System.out.print("Turno(1-8): ");
            int turno = Lector.leerInt();
                
            if(matriz[dia - 1][turno - 1] == null){
                matriz[dia - 1][turno - 1] = p;
                cantidad++;
            }
            else
                System.out.println("El turno " + turno + " del dia " + dia + " se encuentra ocupado.");
                
            p = new Persona();
            System.out.print("Nombre: ");
            p.setNombre(Lector.leerString());            
        }
        
        int contador = 0;
        for (int i=0;i<dias;i++){
            for(int j = 0;j<turnos;j++){
                if(matriz[i][j] != null){
                    contador++;
                    System.out.println("Dia " + (i + 1) + " turno " + (j + 1) + " le corresponde a " + matriz[i][j].getNombre());
                }
            }
            System.out.println("El dia " + (i+1) + " se inscribieron " + contador + " personas.");
            contador = 0;
        }
        
    }
}
