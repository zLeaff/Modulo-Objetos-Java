/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalEj03;

/**
 *
 * @author JB
 */
public class Gira extends Recital{
    private String nombreGira;
    private int fechasAgregadas;
    private int cantidadFechas;
    private int fechaActual;
    private Fecha[] listaFechas;
    
    public Gira(String nombreBanda, int cantidadTemas, String nombreGira, int cantidadFechas){
        super(nombreBanda, cantidadTemas);
        fechasAgregadas = 0;
        fechaActual = 0;
        setNombreGira(nombreGira);
        setCantidadFechas(cantidadFechas);
        listaFechas = new Fecha[cantidadFechas];
    }
    
    public void setNombreGira(String nombreGira){
        this.nombreGira = nombreGira;
    }
    
    public void setCantidadFechas(int cantidadFechas){
        this.cantidadFechas = cantidadFechas;
    }
    
    public String getNombreGira(){
        return nombreGira;
    }
    
    public int getCantidadFechas(){
        return cantidadFechas;
    }
    
    public int getFechasAgregadas(){
        return fechasAgregadas;
    }
    
    public int getFechaActual(){
        return fechaActual;
    }
    
    public void actualizarFecha(){
        if (getFechaActual()<getCantidadFechas()){
            fechaActual++;
        }
    }
    
    public void sumarAgregadas(){
        fechasAgregadas++;
    }
    
    public void agregarFecha(Fecha fecha){
        if (getFechasAgregadas() < getCantidadFechas()){
            listaFechas[getFechasAgregadas()] = fecha;
            sumarAgregadas();
        }
    }
    
    public String actuar(){
        String aux = "Buenas noches " + listaFechas[fechaActual].getCiudad() + ". \n";
        aux += super.actuar();
        actualizarFecha();
        return aux;
    }
    
    public double calcularCosto(){
        return 30000*getCantidadFechas();
    }
}
