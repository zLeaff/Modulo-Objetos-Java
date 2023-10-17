/*
 B- Realizar un programa que instancie un triángulo, le cargue información leída desde
    teclado e informe en consola el perímetro y el área.    
 */
package tema3;

/**
 *
 * @author JB
 */
import PaqueteLectura.Lector;

public class Ej01Triangulo {
    
    public static void main(String[] args){
        Triangulo t = new Triangulo();
        
        System.out.println("Primer lado del triangulo: ");
        t.setLadoA(Lector.leerDouble());
        
        System.out.println("Segundo lado del triangulo: ");
        t.setLadoB(Lector.leerDouble());
        
        System.out.println("Tercer lado del triangulo: ");
        t.setLadoC(Lector.leerDouble());
        
        System.out.println("Perimetro del triangulo: " + t.calcularPerimetro());
        System.out.println("Area del triangulo: " + t.calcularArea());
    }
}
