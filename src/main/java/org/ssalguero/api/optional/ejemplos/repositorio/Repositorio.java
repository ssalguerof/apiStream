package org.ssalguero.api.optional.ejemplos.repositorio;

import org.ssalguero.api.optional.ejemplos.models.Computador;

import java.util.Optional;

public interface Repositorio <T>{
    Optional<Computador> filtrar(String nombre);
}
