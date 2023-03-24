package com.adecco.presentacion;

import com.adecco.modelo.Circulo;
import com.adecco.modelo.Punto;
import com.adecco.modelo.Rectangulo;

public class ProbarHerencia {
    public static void main(String[] args) {
        Punto p1 = new Punto(0,1);
        System.out.println(p1.toString());
        Circulo c1 = new Circulo(2);
        System.out.println("Area del circulo " + c1.CalcularArea());
        Circulo c2 = new Circulo(2,5,1);
        System.out.println(c2.toString());
        System.out.println("Area del circulo 2 " + c2.CalcularArea());
        Rectangulo r1 = new Rectangulo(2,4,5,9);
        System.out.println("Area del rectangulo " + r1.calcularArea());
        Rectangulo r2 = new Rectangulo(2,4);
        System.out.println(r2.toString());
        System.out.println("Area del rectangulo 2 " + r2.calcularArea());
    }
}
