/*
 5-A- Definir una clase para representar círculos. Los círculos se caracterizan por su radio
    (double), el color de relleno (String) y el color de línea (String).
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
public class Circulo {
    private double radio;
    private String colorRelleno;
    private String colorLinea;
    
    public Circulo(){

    }
    
    
    public double getRadio(){
        return radio;
    }
    
    public String getRelleno(){
        return colorRelleno;
    }
    
    public String getLinea(){
        return colorLinea;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public void setRelleno(String relleno){
        colorRelleno = relleno;
    }
    
    public void setLinea(String linea){
        colorLinea = linea;
    }
    
    public double calcularArea(){
        return Math.PI * (radio * radio);
    }
    
    public double calcularPerimetro(){
        return Math.PI * (radio * 2);
    }
}
