/*
 2-A- Modifique la clase Libro.java (carpeta tema3) para ahora considerar que el primer
    autor es un objeto instancia de la clase Autor.
    Implemente la clase Autor, sabiendo que se caracterizan por nombre, biografía y origen
    y que deben permitir devolver/modificar el valor de sus atributos y devolver una
    representación String formada por nombre, biografía y origen.
    Luego realice las modificaciones necesarias en la clase Libro.
 */
package tema3;

/**
 *
 * @author JB
 */
public class Autor {
    private String nombre;
    private String biografia;
    private String origen;
    
    public Autor(String unNombre, String unaBiografia, String unOrigen){
        nombre = unNombre;
        biografia = unaBiografia;
        origen = unOrigen;
    }
    
    public Autor(){
    
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getBiografia(){
        return biografia;
    }
    
    public String getOrigen(){
        return origen;
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public void setBiografia(String unaBiografia){
        biografia = unaBiografia;
    }
    
    public void setOrigen(String unOrigen){
        origen = unOrigen;
    }
    
    
    @Override
    public String toString(){
        String aux = "Nombre: " + nombre + "\n";
        aux += "Biografia: " + biografia + "\n";
        aux += "Origen: " + origen;
        return aux;
    }
}
