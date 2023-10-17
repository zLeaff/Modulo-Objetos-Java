/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3.punto2;

/**
 *
 * @author Marcos
 */
public class Autor {
    private String Nombre;
    private String Biografia;
    private String Origen;
    
    public Autor (String unNombre ,String unaBiografia ,String unOrigen) {
    Nombre = unNombre;
    Biografia= unaBiografia;
    Origen = unOrigen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getBiografia() {
        return Biografia;
    }

    public void setBiografia(String Biografia) {
        this.Biografia = Biografia;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    @Override
    public String toString() {
        String aux = "Autor{" + "Nombre=" + Nombre + ", Biografia=" + Biografia + ", Origen=" + Origen + '}';
        return aux ;
    }
    
}
