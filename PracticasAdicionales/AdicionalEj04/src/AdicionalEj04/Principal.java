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
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
public class Principal {
    
    public static void main(String[] args){
        Director dir1 = new Director ("Julian B", 40498, 26, 5);
        Director dir2 = new Director("Jose", 33333, 33, 3);
        
        CoroHileras coroH = new CoroHileras("Hilarius", dir1, 3);
        GeneradorAleatorio.iniciar();
        for(int i=0;i<3*3;i++){
            String nombre = "Corista " + i;
            int DNI = GeneradorAleatorio.generarInt(1000) + 2000;
            int edad = GeneradorAleatorio.generarInt(15) + 30;
            System.out.print("Tono: ");
            int tono = Lector.leerInt();
            Corista cor = new Corista(nombre, DNI, edad, tono);
            coroH.agregarCorista(cor);
        }
        
        System.out.println(coroH.estaLleno());
        System.out.println(coroH.bienFormado());
        
        
        CoroSemicircular coroS = new CoroSemicircular("Hilarius", dir2, 3);
        GeneradorAleatorio.iniciar();
        for(int i=0;i<3;i++){
            String nombre = "Corista " + i;
            int DNI = GeneradorAleatorio.generarInt(1000) + 2000;
            int edad = GeneradorAleatorio.generarInt(15) + 30;
            System.out.print("Tono: ");
            int tono = Lector.leerInt();
            Corista cor = new Corista(nombre, DNI, edad, tono);
            coroS.agregarCorista(cor);
        }
        
        System.out.println(coroS.estaLleno());
        System.out.println(coroS.bienFormado());
    }
}
