/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3.punto1;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Marcos
 */
public class ProgramaPrincipal {
    
    public static void main(String[] args){
        
        System.out.println("ingrese las caracteristicas del triangulo");
        double l1,l2,l3;
        l1 = Lector.leerDouble() ;
        l2 = Lector.leerDouble() ;
        l3 = Lector.leerDouble() ;
        String borde,relleno;
        borde = Lector.leerString();
        relleno = Lector.leerString() ;
        Triangulo t1 = new Triangulo(l1,l2,l3,relleno,borde);
        
        System.out.println(t1.calcularArea());
        System.out.println(t1.calcularPerimetro());
    }
}
