/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author UTN
 */
public abstract class Figuras {
    protected double area;
    protected double perimetro;

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    public abstract double calcularPerimetro();
    public abstract double calcularArea();
}
