package org.ssalguero.api.stream.ejemplos.InyeccionDependencia;

public class Principal {
    public static void main(String[] args) {
        //ServicioImpresion servicioImpresion = new ServicioImpresion(new ServicioEnvio(), new ServicioPDF());
        ServicioImpresion servicioImpresion = new ServicioImpresion(new ServicioEnvioAspecto(), new ServicioPDF());
        servicioImpresion.imprimir();
    }
}
