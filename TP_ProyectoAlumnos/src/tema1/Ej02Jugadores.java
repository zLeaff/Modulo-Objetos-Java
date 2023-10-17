
package tema1;

/*
    2- Escriba un programa que lea las alturas de los 15 jugadores de un equipo de
    básquet y las almacene en un vector. Luego informe:
    - la altura promedio
    - la cantidad de jugadores con altura por encima del promedio
NOTA: Dispone de un esqueleto para este programa en Ej02Jugadores.java
*/
import PaqueteLectura.Lector;

public class Ej02Jugadores {

  
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
        int DF = 15;
        double altura;
        //Paso 3: Crear el vector para 15 double 
        double [] vector = new double[DF];
        //Paso 4: Declarar indice y variables auxiliares a usar
        int i, cantidad = 0;
        double promedio;
        double alturaTotal = 0;
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for (i=0;i<DF;i++){
            altura = Lector.leerDouble();
            vector[i] = altura;
            alturaTotal += altura;
        }
        //Paso 7: Calcular el promedio de alturas, informarlo
        promedio = alturaTotal / DF;
        System.out.println("La altura promedio es: " + promedio);
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        for (i=0; i<DF; i++) {
            if (vector[i] > promedio)
                cantidad+=1;
        }
        //Paso 9: Informar la cantidad.
        System.out.println("Hay " + cantidad + " que superan la altura promedio");
    }
    
}
