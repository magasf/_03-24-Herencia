package com.adecco.presentacion;
import com.adecco.modelo.Gerente;
import com.adecco.modelo.Empleado;
import com.adecco.modelo.Area;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNombre("Luis Bofill");
        g1.setSueldo(5_000.98f);
        System.out.println(g1.toString());

        Empleado e1 = new Empleado();
        e1.setNombre("Ana Flores");
        e1.setSueldo(2_000f);
        System.out.println(e1.toString());

        Empleado e2 = new Empleado("Rodrigo M", 1_000f, LocalDate.of(1992,8,30));
        System.out.println(e2.toString());

        Gerente g2 = new Gerente("Rosa", 1_200f,null);
        System.out.println(g2.toString());


        //Ejercicio area
        Area objArea = new Area();
        System.out.println("Probar a, circulo" + objArea.areaCirculo(1f));
        System.out.println("Probar a, rectangulo" + objArea.areaRectangulo(3f,5f));



    }
}