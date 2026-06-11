/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulos;

/**
 *
 * @author UTN
 */
public class Escaleno extends Triangulo {
    public Escaleno(double ladoA,double ladoB, double ladoC){
        super(ladoA,ladoB,ladoC);
    }
    @Override
    protected double calcularArea(){
        double S = (ladoA + ladoB + ladoC)/2;
        return Math.sqrt(S*(S-ladoA)*(S-ladoB)*(S-ladoC));
    }
    public String toString(){
        return "Triangulo Escaleno{\nLadoA: "+ ladoA + 
               "\nLadoB: "+ ladoB +
               "\nLadoC: "+ladoC +
               "\nPerimetro: " + getPerimetro() +
               "\nArea: " + getArea()+
               "\n}";
    }
}
