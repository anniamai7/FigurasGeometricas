/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulos;
/**
 *
 * @author UTN
 */
public class Equilatero extends Triangulo {
    
    public Equilatero(double lado){
        super(lado,lado,lado);
    }
    @Override
    protected double calcularArea(){
        return (Math.sqrt(3)/4)*Math.pow(ladoA,2);
    }
    public String toString(){
        return "Triangulo equilatero{\nLadoA: "+ ladoA + 
               "\nLadoB: "+ ladoB +
               "\nLadoC: "+ladoC +
               "\nPerimetro: " + getPerimetro() +
               "\nArea: " + getArea()+
               "\n}";
    }
}
