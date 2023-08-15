package org.ssalguero.api.stream.ejemplos;

import org.ssalguero.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {

    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(usuario -> usuario.getNombre().equals("Pepeb"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        //System.out.println(usuario.orElse(new Usuario("John", "Doe")).getNombre());
        //System.out.println(usuario.orElseGet(() -> new Usuario("John", "Doe")).getNombre());
        if (usuario.isPresent()){
            System.out.println(usuario.get().getNombre());
        }else {
            System.out.println("No se encontro el objeto");
        }
        //nombres.forEach(System.out::println);

    }
}
