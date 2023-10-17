/*
 B- Realizar un programa que instancie un círculo, le cargue información leída de teclado e
    informe en consola el perímetro y el área.
    NOTA: la constante PI es Math.PI
 */
package tema3;

/**
 *
 * @author JB
 */
import PaqueteLectura.Lector;

public class Ej05Circulo {
    
    public static void main(String[] args){
        Circulo circ = new Circulo();
        
        System.out.println("Radio: ");
        circ.setRadio(Lector.leerDouble());
        
        System.out.println("Color de relleno: ");
        circ.setRelleno(Lector.leerString());
        
        System.out.println("Color de linea: ");
        circ.setLinea(Lector.leerString());
        
        System.out.println("Area: " + circ.calcularArea());
        System.out.println("Perimetro: " + circ.calcularPerimetro());
    }
}
