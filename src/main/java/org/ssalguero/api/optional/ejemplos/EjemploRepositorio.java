package org.ssalguero.api.optional.ejemplos;

import org.ssalguero.api.optional.ejemplos.models.Computador;
import org.ssalguero.api.optional.ejemplos.repositorio.ComputadorRepositorio;
import org.ssalguero.api.optional.ejemplos.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("asus").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontro"));

        /*Optional<Computador> pc = repositorio.filtrar("asus rog");
        if (pc.isPresent()){
            System.out.println(pc.get().toString());
        }else{
            System.out.println("No se encontro");
        }*/


    }
}
