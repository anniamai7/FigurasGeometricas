/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramides;
import figuras3D.Figura3D;
import cuadrados.Cuadrado;
import Triangulos.Triangulo;
import Triangulos.Equilatero;
/**
 *
 * @author UTN
 */
public class Piramide extends Figura3D {
    private Cuadrado base;
    private Triangulo cara1;
    private Triangulo cara2;
    private Triangulo cara3;
    private Triangulo cara4;

    public Cuadrado getBase() {
        return base;
    }

    public Triangulo getCara1() {
        return cara1;
    }

    public Triangulo getCara2() {
        return cara2;
    }

    public Triangulo getCara3() {
        return cara3;
    }

    public Triangulo getCara4() {
        return cara4;
    }
    
    public Piramide(double lado){
        this.base = new Cuadrado(lado);
        this.cara1 = new Equilatero(lado);
        this.cara2 = new Equilatero(lado);
        this.cara3 = new Equilatero(lado);
        this.cara4 = new Equilatero(lado);
    }
    public double calcularAltura(){
        return Math.sqrt(Math.pow(cara1.getLadoA(),0)-Math.pow(cara1.getLadoA()/2,2));
    }

    @Override
    protected double calcularVolumen() {
        return (base.getArea()*calcularAltura())/3;
    }

    @Override
    protected double calcularPerimetro() {
        return base.getPerimetro()* 2 ;
    }

    @Override
    protected double calcularArea() {
        return base.getArea() + cara1.getArea();
    }
    
    
}
