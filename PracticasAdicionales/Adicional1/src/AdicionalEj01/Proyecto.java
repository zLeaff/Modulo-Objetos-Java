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
public class Proyecto {
    private int codigo;
    private int investigadores;
    private Investigador[] vectorInv;
    private String nombreP;
    private String nombreD;
    
    public Proyecto(String nombreP, int codigo, String nombreD){
        setNombreP(nombreP);
        setCodigo(codigo);
        setNombreD(nombreD);
        investigadores = 0;
        vectorInv = new Investigador[50];
    }
    
    public void setNombreP(String nombreP){
        this.nombreP = nombreP;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setNombreD(String nombreD){
        this.nombreD = nombreD;
    }
    
    public void agregarInvestigador(Investigador inv){
        if (investigadores < 50) {
            vectorInv[investigadores] = inv;
            investigadores++;
        } else
            System.out.println("Cupo de investigadores lleno.");
    }
    
    public void otorgarTodos(String nombre){
        for(int i=0; i<investigadores;i++){
            if(vectorInv[i].getNombre().equals(nombre))
                for(int j=0;j<vectorInv[i].getCantSub();j++)
                vectorInv[i].getSubsidio(j).otorgar();
        }
    }
    
    public String getNombreP(){
        return nombreP;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public int getInvestigadores(){
        return investigadores;
    }
    
    public String getNombreD(){
        return nombreD;
    }
    
    public double getMontoProyecto(){
        double monto = 0;
        for(int i=0;i<investigadores;i++){
            monto += vectorInv[i].calcularSubsidios();
        }
        return monto;
    }
    
    public String toString(){
        String aux = "Proyecto " + getNombreP() +
                     ". Codigo: " + getCodigo() +
                     ". Digirigod por: " + getNombreD() +
                     ". Dinero total otorgado: $" + getMontoProyecto();
        for (int i=0;i<investigadores;i++)
            aux+= "\n" + vectorInv[i].toString();
        return aux;
    }


}
