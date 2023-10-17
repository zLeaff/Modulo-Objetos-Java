/*
 3-A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
    Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para:
    (i) devolver la cantidad de libros que almacenados (ii) devolver si el estante está lleno
    (iii) agregar un libro al estante (iv) devolver el libro con un título particular que se recibe.
    A REALIZADO

    B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante,
    busque e informe el autor del libro “Mujercitas”.
 */
package tema3;

/**
 *
 * @author JB
 */

import PaqueteLectura.Lector;

public class Ej03CargaLibros {
    
    public static void main(String[] args){
        Estantes e = new Estantes();
        
        for(int i=0;i<5;i++){
            Libro libro = new Libro();
            Autor autor = new Autor();
            
            //Lectura datos de libro
            System.out.print("Titulo: ");
            libro.setTitulo(Lector.leerString());
            
            System.out.print("Editorial: ");
            libro.setEditorial(Lector.leerString());
            
            System.out.print("Año de edición: ");
            libro.setAñoEdicion(Lector.leerInt());
            
            //Lectura de autor
            System.out.println("Datos del autor.");
            System.out.print("Nombre del Autor: ");
            autor.setNombre(Lector.leerString());
            
            System.out.print("Biografia del autor: ");
            autor.setBiografia(Lector.leerString());
            
            System.out.print("Origen del autor: ");
            autor.setOrigen(Lector.leerString());
            
            libro.setPrimerAutor(autor);
            
            System.out.print("ISBN: ");
            libro.setISBN(Lector.leerString());
            
            System.out.print("Precio: ");
            libro.setPrecio(Lector.leerDouble());
            
            e.agregarLibro(libro);
        }
        
        Libro aux = e.getLibroTitulo("Mujercitas");
        System.out.println(aux.getPrimerAutor().toString());
    }
            
}
