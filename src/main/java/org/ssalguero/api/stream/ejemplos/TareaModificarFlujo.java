package org.ssalguero.api.stream.ejemplos;

import java.util.Arrays;
import java.util.stream.Stream;

public class TareaModificarFlujo {
    public static void main(String[] args) {
        int[] arreglo = new int[100];
        for (int i=0;i<arreglo.length;i++) {
            arreglo[i]=i+1;
        }

        //Stream<Integer> lista = Arrays.stream(arreglo).filter(valor -> valor % 10 != 0).;
    }
}
