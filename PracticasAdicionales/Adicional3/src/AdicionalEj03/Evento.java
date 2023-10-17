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
public class Evento extends Recital {
    private String motivo;
    private String contratante;
    private int dia;
    
    public Evento(String nombreBanda, int cantidadTemas, String motivo, String contratante, int dia){
        super(nombreBanda, cantidadTemas);
        setMotivo(motivo);
        setContratante(contratante);
        setDia(dia);
    }
    
    public void setMotivo(String motivo){
        this.motivo = motivo;
    }
    
    public void setContratante(String contratante){
        this.contratante = contratante;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public String getMotivo(){
        return motivo;
    }
    
    public String getContratante(){
        return contratante;
    }
    
    public String actuar(){
        boolean valido;
        String aux;
        if(getMotivo().equals("beneficio")){
            valido = true;
            aux = "Recuerden colaborar con " + getContratante() + "\n";
        }
        else if(getMotivo().equals("show de TV")) {
            valido = true;
            aux = "Saludos amigos televidentes." + "\n";
        }
        else if(getMotivo().equals("show privado")){
            valido = true;
            aux = "Un feliz cumple para " + getContratante() + "\n";
        }
        else {
            valido = false;
            aux = "Recital invalido";
        }
        
        if(valido)
            aux += super.actuar();
        
        return aux;
    }
    
    public double calcularCosto(){
        double costo = 0;
        if(getMotivo().equals("beneficio"))
            costo = 0;
        else if(getMotivo().equals("show de TV"))
            costo = 50000;
        else if(getMotivo().equals("show privado"))
            costo = 150000;
        
        return costo;
    }
   
}
