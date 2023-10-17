/*
 3-A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
    Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para:
    (i) devolver la cantidad de libros que almacenados
    (ii) devolver si el estante está lleno
    (iii) agregar un libro al estante 
    (iv) devolver el libro con un título particular que se recibe.
 */
package tema3;

/**
 *
 * @author JB
 */
public class Estantes {
    private int maxLibros = 20;
    private Libro[] vectorLibro;
    private int almacenados;
    
    public Estantes(){
        almacenados = 0;
        vectorLibro = new Libro[maxLibros];
    }
    
    public int getAlmacenados(){
        return almacenados;
    }
    
    public boolean getDisponibilidad(){
        return almacenados == maxLibros; //false si tiene lugar
    }
    
    public void agregarLibro(Libro libro){
        if(!getDisponibilidad()){
            vectorLibro[almacenados] = libro;
            almacenados++;
        } else {
            System.out.println("El estante esta lleno.");
        }
    }
    
    public Libro getLibroTitulo(String titulo){
        for(int i=0;i<almacenados; i++){
            if(vectorLibro[i].getTitulo().equals(titulo)){
                return vectorLibro[i];
            }
        }
        return null;
    }
}
