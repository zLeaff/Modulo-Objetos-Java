/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author JB
 */
public class MainVisorFiguras {
    public static void main(String[] args) {
        
        VisorFiguras visor = new VisorFiguras();
        
        Cuadrado c1 = new Cuadrado(10,"Violeta","Rosa");
        Rectangulo r= new Rectangulo(20,10,"Azul","Celeste");
        Cuadrado c2= new Cuadrado(30,"Rojo","Naranja");
        Cuadrado c3= new Cuadrado(30,"Amarillo","Fuccia");
        Rectangulo r2= new Rectangulo(20,10,"Azul","Celeste");
        r2.despintar();
        
        
        visor.guardar(c1);
        visor.guardar(r);
        visor.guardar(c2);
        visor.guardar(c3);
        visor.guardar(r2);
        
        visor.mostrar();
        System.out.println();
        System.out.println(visor.quedaEspacio());
        System.out.println();
        System.out.println(visor.getAlmacenadas());
        
    }
}
