package org.ssalguero.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamReduceRange {

    public static void main(String[] args) {

        IntStream valores = IntStream.range(5,20).peek(System.out::println);

        //Integer resultado = valores.reduce(0, (a, b)-> a+b);
        //Integer resultado = valores.reduce(0, Integer::sum);
        //Integer resultado = valores.sum();
        IntSummaryStatistics stats = valores.summaryStatistics();
        //System.out.println(" = " + resultado);
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Suma: " + stats.getSum());
        System.out.println("Promedio: " + stats.getAverage());
        System.out.println("Total elementos: "+ stats.getCount());
    }
}
