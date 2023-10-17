/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalEj02;

/**
 *
 * @author JB
 */
public class Estacionamiento {
    private String nombre;
    private String direccion;
    private int horaApertura; //00..24
    private int horaCierre;
    private int pisos;
    private int plazas;
    private Auto[][] matriz;
    
    public Estacionamiento (String nombre, String direccion){
        setNombre(nombre);
        setDir(direccion);
        horaApertura = 8;
        horaCierre = 21;
        pisos = 5;
        plazas = 10;
        matriz = new Auto[pisos][plazas];
    }
    
    public Estacionamiento (String nombre, String direccion, int horaApertura, int horaCierre, int pisos, int plazas){
        setNombre(nombre);
        setDir(direccion);
        setApertura(horaApertura);
        setCierre(horaCierre);
        setPisos(pisos);
        setPlazas(plazas);
        matriz = new Auto[pisos][plazas];
    }
    
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setDir(String direccion){
        this.direccion = direccion;
    }
    
    public void setApertura(int horaApertura){
        this.horaApertura = horaApertura;
    }
    
    public void setCierre(int horaCierre){
        this.horaCierre = horaCierre;
    }
    
    public void setPisos(int pisos){
        this.pisos = pisos;
    }
    
    public void setPlazas(int plazas){
        this.plazas = plazas;
    }
    
    //Getters
    public String getNombre(){
        return nombre;
    }
    
    public String getDir(){
        return direccion;
    }
    
    public int getPisos(){
        return pisos;
    }
    
    public int getPlazas(){
        return plazas;
    }
    
    //Methods
    public boolean estaVacia(int i, int j){
        return matriz[i][j] == null;
    }
    
    public void registrarAuto(Auto auto, int i, int j){
        if (estaVacia(i-1,j-1))
            matriz[i-1][j-1] = auto;
        else
            System.out.println("Lugar ocupado.");
    }
    
    public int cantidadAutosEnPlaza(int j){
        int contador = 0;
        for (int i=0;i<getPisos();i++){
            if(!estaVacia(i, j))
                contador++;
        }
        return contador;
    }
    
    public String obtenerUbicacionPorPatente(String patenteBuscada){
        String aux;
        boolean encontrado = false;
        int i = 0;
        int j = 0;
        while(i < pisos && !encontrado){
            j = 0;
            while(j < plazas && !encontrado){
                if (!estaVacia(i, j) && matriz[i][j].getPatente().equals(patenteBuscada)){
                    encontrado = true;
                } else {
                    j++;
                }
            }
            if (!encontrado){
                i++;
            }
        }
        if (encontrado)
            aux = "Auto ubicado en piso " + (i+1) + " plaza " + (j+1);
        else
            aux = "Auto inexistente";
        
        return aux;
    }
    
    public String toString(){
        String aux = getNombre() + "\n";
        for(int i=0;i<getPisos();i++){
            aux += "Piso " + (i+1) + "\n";
            for(int j=0;j<getPlazas();j++){
                if(estaVacia(i,j))
                    aux += "- Plaza " + (j+1) + ": vacia. \n";
                else
                    aux += matriz[i][j].toString() + "\n";
            }
        }
        return aux;
    }
}
