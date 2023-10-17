/*
 2- Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
    15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta
    obtener edad 0. Luego de almacenar la información:
    - Informe la cantidad de personas mayores de 65 años.
    - Muestre la representación de la persona con menor DNI.
 */
package tema2;

/**
 *
 * @author JB
 */
import PaqueteLectura.GeneradorAleatorio;

public class Ej02VectorPersonas {
    
    public static void main(String[] args){
        GeneradorAleatorio.iniciar();
        int DF = 15;
        Persona[] vectorPersonas = new Persona[15];
        int i = 0;
        int temp = 0;
        
        
        Persona p;
        p = new Persona();
        
        p.setNombre(GeneradorAleatorio.generarString(10));
        p.setEdad(GeneradorAleatorio.generarInt(90));
        while(i < DF && p.getEdad() != 0){
            p.setDNI(GeneradorAleatorio.generarInt(32000));
            vectorPersonas[i] = p;
            i++;
            temp++;
            
            p = new Persona();
            p.setNombre(GeneradorAleatorio.generarString(10));
            p.setEdad(GeneradorAleatorio.generarInt(90));
            p.setDNI(GeneradorAleatorio.generarInt(32000));          
        }
        
        for(i=0;i<temp;i++)
            System.out.println(vectorPersonas[i].toString());
        
        System.out.println(temp);
    }
}
