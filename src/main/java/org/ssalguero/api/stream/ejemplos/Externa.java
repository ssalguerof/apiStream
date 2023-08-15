package org.ssalguero.api.stream.ejemplos;

public class Externa {
    public class Interna{
        public void imprimir(){
            System.out.println("Clase interna");
        }
    }

    public void imprimir(){
        System.out.println("Clase externa");
    }
}
