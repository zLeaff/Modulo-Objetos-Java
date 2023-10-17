/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author JB
 */
public class VisorFiguras {
    private int almacenadas;
    private int capacidad = 5;
    private Figura[] vector;
    
    public VisorFiguras(){
        vector = new Figura[capacidad];
        almacenadas = 0;
    }
    
    public boolean quedaEspacio(){
        return almacenadas<capacidad;
    }
    
    public void guardar(Figura f){
        if (almacenadas < capacidad){
            vector[almacenadas] = f;
            almacenadas++;
        }
    }
    
    public void mostrar(){
        for (int i=0;i<almacenadas;i++)
            System.out.println(vector[i].toString());
    }
    
    public int getAlmacenadas() {
        return almacenadas;
    }
}
