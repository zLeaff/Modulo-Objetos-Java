/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ej06;

/**
 *
 * @author JB
 */
public class Principal {
    
    public static void main(String[] args){
        Estacion estLp = new Estacion("La plata", -34.921, -57.955);
        SistemaAnual sistAn = new SistemaAnual(estLp, 2021, 3);
        
        System.out.println(sistAn.toString());
        
        Estacion estMdq = new Estacion("Mar del Plata", -38.002, -57.556);
        SistemaMensual sistMen = new SistemaMensual(estMdq, 2020, 4);
        System.out.println(sistMen.toString());
    }
}
