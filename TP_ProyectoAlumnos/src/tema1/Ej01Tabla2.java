/*
 1- Analice el programa Ej01Tabla2.java, que carga un vector que representa la
    tabla del 2. Luego escriba las instrucciones necesarias para:
    - generar enteros aleatorios hasta obtener el número 11. Para cada número
    muestre el resultado de multiplicarlo por 2 (accediendo al vector).
 */
package tema1;
import PaqueteLectura.GeneradorAleatorio;

public class Ej01Tabla2 {

    /**
     * Carga un vector que representa la tabla del 2
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int DF=11;  
        int [] tabla2 = new int[DF];
        int i = 0;// indices de 0 a 10
        int random = GeneradorAleatorio.generarInt(12);
        while (random != DF) {
            tabla2[i] = random * 2;
            System.out.println("2x" + random + "="+ tabla2[i]);
            i++;
            random = GeneradorAleatorio.generarInt(12);
        }

    }
    
}
