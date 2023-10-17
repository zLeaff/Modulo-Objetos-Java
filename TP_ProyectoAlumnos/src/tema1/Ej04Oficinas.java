/*
 4- Un edificio de oficinas está conformado por 8 pisos (1..8) y 4 oficinas por piso
    (1..4). Realice un programa que permita informar la cantidad de personas que
    concurrieron a cada oficina de cada piso. Para esto, simule la llegada de personas al
    edificio de la siguiente manera: a cada persona se le pide el nro. de piso y nro. de
    oficina a la cual quiere concurrir. La llegada de personas finaliza al indicar un nro.
    de piso 9. Al finalizar la llegada de personas, informe lo pedido.
 */
package tema1;

/**
 *
 * @author JB
 */
import PaqueteLectura.Lector;

public class Ej04Oficinas {
    
    public static void main (String[] args){
        int pisos = 8;
        int oficinas = 4;
        int[][] matriz = new int[8][4];
        
        int i, j;
        for (i=0;i<pisos;i++)
            for(j=0;j<oficinas;j++)
                matriz[i][j] = 0;
        
        int piso, oficina;
        
        System.out.print("Piso(1-8): ");
        piso = Lector.leerInt();
        
        while (piso != 9) {
            System.out.print("Oficina(1-4): ");
            oficina = Lector.leerInt();
            matriz[piso - 1][oficina - 1] += 1;
            
            System.out.print("Piso(1-8): ");
            piso = Lector.leerInt();
        }
        
        System.out.println();
      
        for(i=0;i<pisos;i++){
            System.out.println("Piso " + (i+1));
            for(j=0;j<oficinas;j++)
                System.out.println("Oficina " + (j + 1) + ": " + matriz[i][j] + " personas");
            System.out.println();
        }
    }
}
