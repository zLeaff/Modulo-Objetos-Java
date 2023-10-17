/*
 3- Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice
    la matriz con números aleatorios entre 0 y 30.
    Luego realice las siguientes operaciones:
    - Mostrar el contenido de la matriz en consola.
    - Calcular e informar la suma de los elementos de la fila 1
    - Generar un vector de 5 posiciones donde cada posición j contiene la suma
    de los elementos de la columna j de la matriz. Luego, imprima el vector.
    - Lea un valor entero e indique si se encuentra o no en la matriz. En caso de
    encontrarse indique su ubicación (fila y columna) en caso contrario
    imprima “No se encontró el elemento”.
 */
package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ej03Matrices {

    public static void main(String[] args) {
	//Paso 2. iniciar el generador aleatorio     
	GeneradorAleatorio.iniciar();
        
        //Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios
        int DF = 5;
        int [][] matriz = new int[5][5];
        int i, j;
        int random;
        for (i=0;i<DF;i++)
            for(j=0;j<DF;j++){
                random = GeneradorAleatorio.generarInt(31);
                matriz[i][j] = random;
            }
        
        //Paso 4. mostrar el contenido de la matriz en consola
        for (i=0;i<DF;i++){
            for(j=0;j<DF;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
        int fila = 1;
        int suma = 0;
        
        for (j=0;j<DF;j++)
            suma += matriz[fila][j];
        
        System.out.println("Suma de la fila " + fila + " = " + suma);
        
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
        int [] vectorSuma = new int[DF];
        
        for(j=0;j<DF;j++){
            suma = 0;
            for(i=0;i<DF;i++)
                suma += matriz[i][j];
            vectorSuma[j] = suma;
        }
        
        for (i=0;i<DF;i++)
            System.out.println(vectorSuma[i]);

        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
        boolean encontrado = false;
        System.out.print("Ingrese un valor a buscar: ");
        int valor = Lector.leerInt();
        i = 0;

        while (i < DF && !encontrado){
            j = 0;
            while(j < DF && !encontrado){
                if (matriz[i][j] == valor)
                    encontrado = true;
                else
                    j++;
            }
            if (!encontrado)
                i++;
        }
        
        if (encontrado)
            System.out.println("El valor ingresado " + valor + " se encuentra en la fila " + (i+1) + " columna " + (j+1));
        else
            System.out.println("No se encontro el elemento.");
        

    }
}
