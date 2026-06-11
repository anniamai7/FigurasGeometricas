/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulos;
import figurasgeometricas.Figuras;
/**
 *
 * @author UTN
 */
public abstract class Triangulo extends Figuras {
    protected double ladoA;
    protected double ladoB;
    protected double ladoC;

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    @Override
    protected double calcularPerimetro(){
        return ladoA + ladoB + ladoC;
    }
    
    
}
