/*
 1- Realice un programa que cree un objeto persona con datos leídos desde teclado. Luego
    muestre en consola la representación de ese objeto en formato String
 */
package tema2;

/**
 *
 * @author JB
 */
import PaqueteLectura.Lector;
public class Ej01Persona {
    
    public static void main(String[] args){
        Persona p;
        p = new Persona();
        
        System.out.print("Nombre: ");
        p.setNombre(Lector.leerString());
        
        System.out.print("DNI: ");
        p.setDNI(Lector.leerInt());
        
        System.out.print("Edad: ");
        p.setEdad(Lector.leerInt());
        
        System.out.println(p.toString());
        
    }
}
