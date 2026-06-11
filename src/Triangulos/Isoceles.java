/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulos;

/**
 *
 * @author UTN
 */
public class Isoceles extends Triangulo {
    
    public Isoceles(double ladoAB, double ladoC){
        super(ladoAB,ladoAB,ladoC);
    }
    @Override
    protected double calcularArea(){
        return (ladoC*Math.sqrt(4*Math.pow(ladoA,2)-Math.pow(ladoC,2))/4);
    }
    public String toString(){
        return "Triangulo Isosceles{\nLadoA: "+ ladoA + 
               "\nLadoB: "+ ladoB +
               "\nLadoC: "+ladoC +
               "\nPerimetro: " + getPerimetro() +
               "\nArea: " + getArea()+
               "\n}";
    }
}
