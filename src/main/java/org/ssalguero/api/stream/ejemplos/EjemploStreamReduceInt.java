package org.ssalguero.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {

    public static void main(String[] args) {

        Stream<Integer> valores = Stream.of(5,10,15,20);

        //Integer resultado = valores.reduce(0, (a, b)-> a+b);
        Integer resultado = valores.reduce(0, Integer::sum);
        System.out.println(" = " + resultado);
    }
}
