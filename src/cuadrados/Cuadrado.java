/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadrados;

/**
 *
 * @author UTN
 */
public class Cuadrado extends Rectangulo {
    public Cuadrado(double lado){
        super(lado,lado);
    }
    
    @Override
    protected double calcularPerimetro() {
        return base * 4;
    }

    @Override
    protected double calcularArea() {
       return Math.pow(base,2);
    }
    
    @Override
    public String toString(){
        return "Cuadrado{\nLado: " + this.base +
               "\nPerimetro: " + getPerimetro()+
               "\nArea: " + getArea() +
               "\n}";
    }
}
