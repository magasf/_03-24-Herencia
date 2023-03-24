package com.adecco.modelo;

import java.time.LocalDate;

public class Gerente extends Empleado{
    //Atributos
    private String departamento;

    //Metodos

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                "} " + super.toString();
    }


    //Constructores
    public Gerente (){};

    public Gerente(String nombre, float sueldo, LocalDate fNacimiento) {
        super(nombre, sueldo, fNacimiento);
    }

    //Setters y Getters


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
