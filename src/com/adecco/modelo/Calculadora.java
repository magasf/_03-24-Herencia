package com.adecco.modelo;

public class Calculadora {
    //Atributos
    private int num1;


    //Metodos
    public String mostrarTabla(){
        String resultado = "La tabla de multiplicar " + num1 + "\n";
        for (int i = 1; i <= 10; i++) {
            // forma mas larga de mostrar el resultado
//            resultado = resultado + i + " x " + num1 + " = " + (i * num1) + "/n";
            resultado +=  + i + " x " + num1 + " = " + (i * num1) + "\n";

        }
        return resultado;
    }



    //Constructures

    public Calculadora(int num1) {
        this.num1 = num1;

    }


    //Set y Get


}
