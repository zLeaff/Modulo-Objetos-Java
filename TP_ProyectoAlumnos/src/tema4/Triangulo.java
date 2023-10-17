/*
 1-A- Definir una clase para representar triángulos. Un triángulo se caracteriza por el
    tamaño de sus 3 lados (double), el color de relleno (String) y el color de línea (String).
    Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
    Provea métodos para:
    - Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
    - Calcular el perímetro y devolverlo (método calcularPerimetro)
    - Calcular el área y devolverla (método calcularArea)
 */
package tema4;

/**
 *
 * @author JB
 */
public class Triangulo extends Figura {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Triangulo(double ladoA, double ladoB, double ladoC, String relleno, String linea){
        super(relleno, linea);
        setLadoA(ladoA);
        setLadoB(ladoB);
        setLadoC(ladoC);
    }
    
    public double getLadoA(){
        return ladoA;
    }
    
    public double getLadoB(){
        return ladoB;
    }
    
    public double getLadoC(){
        return ladoC;
    }
    
    public void setLadoA(double ladoA){
        this.ladoA = ladoA;
    }
    
    public void setLadoB(double ladoB){
        this.ladoB = ladoB;
    }
    
    public void setLadoC(double ladoC){
        this.ladoC = ladoC;
    }
    
    public double calcularPerimetro() {
        return (getLadoA() + getLadoB() + getLadoC());
    }
    
    public double calcularArea(){
        double s = (getLadoA() + getLadoB() + getLadoC())/2;
        double area = Math.sqrt(s*(s-getLadoA())*(s-getLadoB())*(s-getLadoC()));
        return area;
    }
    
    public String toString(){
        String aux = super.toString() + 
                "Lado 1: " + getLadoA() +
                "Lado 2: " + getLadoB() +
                "Lado 3: " + getLadoC();
        return aux;
    }
}
