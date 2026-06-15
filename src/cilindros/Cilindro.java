/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cilindros;
import figuras3D.Figura3D;
import circulo.Circulo;
import cuadrados.Rectangulo;
/**
 *
 * @author UTN
 */
public class Cilindro extends Figura3D {
    private Circulo base;
    private Circulo tapa;
    private Rectangulo borde;
    
    public Circulo getbase(){
        return base;
    }

    public Circulo getTapa() {
        return tapa;
    }

    public Rectangulo getBorde() {
        return borde;
    }
    public Cilindro(double radio, double altura){
        this.base = new Circulo(radio);
        this.tapa = new Circulo(radio);
        this.borde = new Rectangulo(tapa.getPerimetro(),altura);
    }
    
    @Override
    protected double calcularArea(){
        return 2 *tapa.getArea()+ tapa.getPerimetro()*borde.getAltura();
    }
    @Override
    protected double calcularPerimetro(){
        return base.getPerimetro();
    }
    @Override
    protected double calcularVolumen(){
        return tapa.getArea()*borde.getAltura();
    }
    
}
