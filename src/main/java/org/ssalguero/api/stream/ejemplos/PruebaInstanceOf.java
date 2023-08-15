package org.ssalguero.api.stream.ejemplos;

import org.ssalguero.api.stream.ejemplos.models.Animal;

public class PruebaInstanceOf {
    public static void main(String[] args) {
        Perro perro = new Perro();
        System.out.println("EL objeto es una instancia de Animal: "+ (perro instanceof Animal ));
    }
}
