/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras3D;
import figurasgeometricas.Figuras;
/**
 *
 * @author UTN
 */
public abstract class Figura3D extends Figuras {
    public double getVolumen(){
        return calcularVolumen();
    }
    protected abstract double calcularVolumen();
}
