/*
 5- El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen
    (con puntaje de 1 a 10) los siguientes aspectos: (0) Atención al cliente (1) Calidad
    de la comida (2) Precio (3) Ambiente.
    Escriba un programa que lea desde teclado las calificaciones de los cinco clientes
    para cada uno de los aspectos y almacene la información en una estructura. Luego
    imprima la calificación promedio obtenida por cada aspecto..
 */
package tema1;

/**
 *
 * @author JB
 */

import PaqueteLectura.Lector;

public class Ej05Restaurante {
    
    public static void main(String[] args){
        int clientes = 5;
        int aspectos = 4;
        int[][] matriz = new int[clientes][aspectos];
        
        int i,j;
        
        for (i=0;i<clientes;i++){
            System.out.println("Cliente " + (i+1));
            for (j=0;j<aspectos;j++){
                System.out.print("Ingrese nota(1-10) del aspecto nro " + (j+1) + ": ");
                int nota = Lector.leerInt();
                matriz[i][j] = nota;
            }
        }
        
        int suma;
        double promedio;
        
        for(j=0;j<aspectos;j++){
            suma = 0;
            for(i=0;i<clientes;i++)
                suma+= matriz[i][j];
            promedio = suma / clientes;
            System.out.println("Promedio del aspecto " + (j+1) + ": " + promedio);
        }
    }
}
