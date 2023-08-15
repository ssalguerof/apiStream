package org.ssalguero.api.stream.ejemplos;

public class PruebaClaseInterna {
    public static void main(String[] args) {
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();

        externa.imprimir();
        interna.imprimir();
    }
}
