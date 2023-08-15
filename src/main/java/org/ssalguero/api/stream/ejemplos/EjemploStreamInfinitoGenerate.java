package org.ssalguero.api.stream.ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

public class EjemploStreamInfinitoGenerate {

    public static void main(String[] args) {

        AtomicInteger contador = new AtomicInteger(0);
        IntBinaryOperator ibo = (x, y) -> (x + y);

        Stream.generate(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return  contador.accumulateAndGet(1, ibo);
        })

                .limit(5)
                .forEach(System.out::println);
    }
}
