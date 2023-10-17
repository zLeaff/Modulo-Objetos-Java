/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalEj01;

/**
 *
 * @author JB
 */
public class Investigador {
    private String nombreCompleto;
    private String especialidad;
    private int categoria;
    private int subsidios;
    private Subsidio [] vectorSub;
    
    public Investigador(String nombreCompleto, String especialidad, int categoria){
        setNombre(nombreCompleto);
        setEsp(especialidad);
        setCat(categoria);
        subsidios = 0;
        vectorSub = new Subsidio[5];
    }
    
    public void setNombre(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }
    
    public void setEsp(String especialidad){
        this.especialidad = especialidad;
    }
    
    public void setCat(int categoria){
        this.categoria = categoria;
    }
    
    public String getNombre(){
        return nombreCompleto;
    }
    
    public String getEsp(){
        return especialidad;
    }
    
    public int getCat(){
        return categoria;
    }
    
    public int getCantSub(){
        return subsidios;
    }
    
    public Subsidio getSubsidio(int i){
        return vectorSub[i];
    }
    
    public void agregarSubsidio(Subsidio sub){
        if (subsidios < 5){
            vectorSub[subsidios] = sub;
            subsidios++;
        }
        else
            System.out.println("Limite de subsidios alcanzado.");
    }
    
    public double calcularSubsidios(){
        double dineroSub = 0;
        for(int i=0;i<subsidios;i++){
            if (vectorSub[i].getOtorgado() == true)
                dineroSub += vectorSub[i].getMonto();
        }
        return dineroSub;
    }
    
    public String toString(){
        String aux = " - " + getNombre() +
                     " | Categoria " + getCat() +
                     " | Especialidad " + getEsp() + 
                     " | Subsidio total recibido  $" + calcularSubsidios();
        return aux;
    }
}
