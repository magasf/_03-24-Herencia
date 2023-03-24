package com.adecco.modelo;

public class Rectangulo extends Punto{
    //Atributos
    private int base;
    private int altura;

    //Metodo
    public double calcularArea(){
        return base*altura;

    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                "} " + super.toString();
    }
    //Constructores

    public Rectangulo(){}

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(int x, int y, int base, int altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    //Set y Get


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}


