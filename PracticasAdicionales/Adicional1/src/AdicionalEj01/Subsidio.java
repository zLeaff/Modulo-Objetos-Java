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
public class Subsidio {
    private double montoPedido;
    private String motivo;
    private boolean otorgado;
    
    public Subsidio(double montoPedido, String motivo){
        setMonto(montoPedido);
        setMotivo(motivo);
        otorgado = false;
    }
    
    public void otorgar(){
        otorgado = true;
    }
    
    public void setMonto(double montoPedido){
        this.montoPedido=montoPedido;
    }
    
    public void setMotivo(String motivo){
        this.motivo = motivo;
    }
    
    public boolean getOtorgado(){
        return otorgado;
    }
    
    public double getMonto(){
        return montoPedido;
    }
    
    public String getMotivo(){
        return motivo;
    }
    
}
