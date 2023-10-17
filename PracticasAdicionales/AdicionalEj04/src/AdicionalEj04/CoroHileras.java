/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalEj04;

/**
 *
 * @author JB
 */
public class CoroHileras extends Coro{
    private int filasCompletas, agregadosFila;
    private Corista[][] posiciones;
    
    public CoroHileras(String nombreCoro, Director director, int dim){
        super(nombreCoro, director, dim);
        posiciones = new Corista[dim][dim];
        filasCompletas = 0;
        agregadosFila = 0;
    }
    
    
    public int getFilasCompletas(){
        return filasCompletas;
    }
    public int getAgregadosFila(){
        return agregadosFila;
    }

    public void agregarCorista(Corista corista){
        if(agregadosFila == getDim()&& filasCompletas < getDim()){
            agregadosFila = 0;
            filasCompletas++;
        }
        if(posiciones[filasCompletas][agregadosFila] == null){
            posiciones[getFilasCompletas()][getAgregadosFila()] = corista;
            agregadosFila++;
            sumarAgregados();
        }
    }
    
    public boolean bienFormado(){
        for(int i=0;i<getDim();i++){
            int primerTono = posiciones[i][0].getTono();
            
            for(int j=0;j<getDim();j++){
                if(posiciones[i][j].getTono() != primerTono)
                    return false;
            }
            
            if (i < getDim() - 1){
                if(primerTono < posiciones[i+1][0].getTono())
                    return false;
            }
        }
        
        return true;
    }
    
    public boolean estaLleno(){
        return getAgregados() == getDim()*getDim();
    }
    
}
