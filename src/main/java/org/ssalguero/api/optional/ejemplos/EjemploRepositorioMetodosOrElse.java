package org.ssalguero.api.optional.ejemplos;

import org.ssalguero.api.optional.ejemplos.models.Computador;
import org.ssalguero.api.optional.ejemplos.repositorio.ComputadorRepositorio;
import org.ssalguero.api.optional.ejemplos.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        //Computador defecto = new Computador("HP Omen", "LA00001");
        Computador pc = repositorio.filtrar("rog").orElse(valorDefecto());
        System.out.println(pc);

        pc = repositorio.filtrar("macbook pro").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);
        System.out.println(pc);
    }

    public static Computador valorDefecto(){
        System.out.println("Obtenniendo valor por defecto");
        return new Computador("HP Omen", "LA00001");
    }
}
