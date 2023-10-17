/*
 1-A- Definir una clase para representar triángulos. Un triángulo se caracteriza por el
    tamaño de sus 3 lados (double), el color de relleno (String) y el color de línea (String).
    Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
    Provea métodos para:
    - Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
    - Calcular el perímetro y devolverlo (método calcularPerimetro)
    - Calcular el área y devolverla (método calcularArea)
 */
package tema3;

/**
 *
 * @author JB
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String colorRelleno;
    private String colorLinea;
    
    public Triangulo(double ladoA, double ladoB, double ladoC, String relleno, String linea){
        lado1 = ladoA;
        lado2 = ladoB;
        lado3 = ladoC;
        colorRelleno = relleno;
        colorLinea = linea;
    }
    
    public Triangulo() {
    
    }
    
    public double getLadoA(){
        return lado1;
    }
    
    public double getLadoB(){
        return lado2;
    }
    
    public double getLadoC(){
        return lado3;
    }
    
    public void setLadoA(double ladoA){
        lado1 = ladoA;
    }
    
    public void setLadoB(double ladoB){
        lado2 = ladoB;
    }
    
    public void setLadoC(double ladoC){
        lado3 = ladoC;
    }
    
    public double calcularPerimetro() {
        return (getLadoA() + getLadoB() + getLadoC());
    }
    
    public double calcularArea(){
        double s = (getLadoA() + getLadoB() + getLadoC())/2;
        double area = Math.sqrt(s*(s-getLadoA())*(s-getLadoB())*(s-getLadoC()));
        return area;
    }
}
