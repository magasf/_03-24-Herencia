package com.adecco.modelo;


public class Circulo extends Punto{


    //Atributo
    private double radio;

    //Metodo
    public double CalcularArea(){
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                "} " + super.toString();
    }
    //Constructores

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }
}

