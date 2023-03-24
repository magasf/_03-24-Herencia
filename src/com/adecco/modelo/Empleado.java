package com.adecco.modelo;

import java.time.LocalDate;

public class Empleado {

    //1. Atributos
    protected String nombre;
    protected float sueldo;
    protected LocalDate fNacimiento;


    //2. Metodos

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", fNacimiento=" + fNacimiento +
                '}';
    }


    //3. Constructores
    public Empleado(){};

    public Empleado(String nombre, float sueldo, LocalDate fNacimiento) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fNacimiento = fNacimiento;
    }

    //4. Setters y Getters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
}
