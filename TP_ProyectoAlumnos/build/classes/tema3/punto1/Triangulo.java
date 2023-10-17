/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3.punto1;

/**
 *
 * @author Marcos
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String relleno;
    private String borde;
    
    public Triangulo(double l1,double l2,double l3, String unRelleno , String unBorde){
      lado1 =l1;
      lado2 =l2;
      lado3 =l3;
      relleno = unRelleno;
      borde = unBorde;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getBorde() {
        return borde;
    }

    public void setBorde(String borde) {
        this.borde = borde;
    }
    
    public double calcularPerimetro(){
        double aux;
        aux = lado1 + lado2 + lado3 ;
        return aux;
    }
    
    public double calcularArea(){
        double aux,s;
        s = (lado1 + lado2 + lado3 ) / 2;
        aux = Math.sqrt( s * (s - lado1)*(s - lado2 )*(s - lado3 ));
        return aux;
    }
}
