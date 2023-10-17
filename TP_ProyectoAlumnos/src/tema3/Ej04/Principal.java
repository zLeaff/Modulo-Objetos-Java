/*
 4-A- Un hotel posee N habitaciones. De cada habitación conoce costo por noche, si está
    ocupada y, en caso de estarlo, guarda el cliente que la reservó (nombre, DNI y edad).
    (i) Genere las clases necesarias. Para cada una provea métodos getters/setters adecuados.
    (ii) Implemente los constructores necesarios para iniciar: los clientes a partir de nombre,
    DNI, edad; el hotel para N habitaciones, cada una desocupada y con costo aleatorio e/
    2000 y 8000.
    (iii) Implemente en las clases que corresponda todos los métodos necesarios para:
    - Ingresar un cliente C en la habitación número X. Asuma que X es válido (es decir, está
    en el rango 1..N) y que la habitación está libre.
    - Aumentar el precio de todas las habitaciones en un monto recibido.
    - Obtener la representación String del hotel, siguiendo el formato:
    {Habitación 1: costo, libre u ocupada, información del cliente si está ocupada} 
    …
    {Habitación N: costo, libre u ocupada, información del cliente si está ocupada}

    B- Realice un programa que instancie un hotel, ingrese clientes en distintas habitaciones,
    muestre el hotel, aumente el precio de las habitaciones y vuelva a mostrar el hotel.
 */
package tema3.Ej04;

/**
 *
 * @author JB
 */
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

public class Principal {
    
    
    public static void main(String[] args){
        int habitaciones = 20;
        Hotel hotel = new Hotel(habitaciones);
        
        int i;
        for(i=0;i<habitaciones;i++){
            
            Cliente c = new Cliente();
            c.setDNI(GeneradorAleatorio.generarInt(10000) + 30000);
            c.setEdad(GeneradorAleatorio.generarInt(100));
            c.setNombre(GeneradorAleatorio.generarString(9));
            
            hotel.ingresarCliente(c, i);  
        }
        
        hotel.obtenerInfo();
        
        System.out.println();
        System.out.println("Actualizacion de precios: ");
        System.out.println();
        
        for(i=0;i<habitaciones;i++){
            hotel.getVector()[i].aumentarPrecio(GeneradorAleatorio.generarDouble(2000));
        }
        
        hotel.obtenerInfo();
    }
}
