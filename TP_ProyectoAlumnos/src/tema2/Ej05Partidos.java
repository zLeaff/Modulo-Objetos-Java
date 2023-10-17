/*
 5- Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en
    el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
    nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga:
    - Para cada partido, armar e informar una representación String del estilo:
    {EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
    - Calcular e informar la cantidad de partidos que ganó River.
    - Calcular e informar el total de goles que realizó Boca jugando de local.
 */
package tema2;

/**
 *
 * @author JB
 */
import PaqueteLectura.Lector;

public class Ej05Partidos {
    
    public static void main(String[] args){
        String corte = "ZZZ";
        
        int DF = 20;
        int j = 0;
        Partido[] vectorPartido = new Partido[DF];
        
        Partido p = new Partido();
        
        System.out.print("Equipo Local: ");
        p.setLocal(Lector.leerString());
        System.out.print("Equipo visitante: ");
        p.setVisitante(Lector.leerString());
        
        while (j < DF && !p.getVisitante().equals(corte)) {
            System.out.print("Goles equipo local: ");
            p.setGolesLocal(Lector.leerInt());
            System.out.print("Goles equipo visitante: ");
            p.setGolesVisitante(Lector.leerInt());

            vectorPartido[j] = p;
            j++;
            
            p = new Partido();
            System.out.print("Equipo Local: ");
            p.setLocal(Lector.leerString());
            System.out.print("Equipo visitante: ");
            p.setVisitante(Lector.leerString());
        }
        
        int i;
        for(i=0;i<j;i++)
            System.out.println(vectorPartido[i].getLocal() + " " + 
                               vectorPartido[i].getGolesLocal() + 
                               " VS " + vectorPartido[i].getVisitante() + " " + vectorPartido[i].getGolesVisitante());
        
        
        int partidosRiver = 0;
        int golesBoca = 0;
        
        for(i=0;i<j;i++){
            if(vectorPartido[i].getGanador().equals("River")){
                partidosRiver++;
            }
            
            if(vectorPartido[i].getLocal().equals("Boca"))
                golesBoca += vectorPartido[i].getGolesLocal();
            
            if(vectorPartido[i].getVisitante().equals("Boca"))
                golesBoca += vectorPartido[i].getGolesVisitante();           
        }
        
        System.out.println("River gano " + partidosRiver + " partidos.");
        System.out.println("Boca anoto " + golesBoca + " en sus partidos");
    }
}
