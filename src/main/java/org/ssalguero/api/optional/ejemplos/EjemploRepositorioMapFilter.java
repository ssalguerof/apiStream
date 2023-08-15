package org.ssalguero.api.optional.ejemplos;

import org.ssalguero.api.optional.ejemplos.models.Computador;
import org.ssalguero.api.optional.ejemplos.models.Fabricante;
import org.ssalguero.api.optional.ejemplos.models.Procesador;
import org.ssalguero.api.optional.ejemplos.repositorio.ComputadorRepositorio;
import org.ssalguero.api.optional.ejemplos.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");
        System.out.println(f);

    }

}
