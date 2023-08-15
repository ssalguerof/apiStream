package org.ssalguero.api.stream.ejemplos.InyeccionDependencia;

public class ServicioImpresion {
    ServicioEnvio servicioA;
    ServicioPDF servicioB;
    public ServicioImpresion(ServicioEnvio servicioEnvio, ServicioPDF servicioPDF){
        this.servicioA = servicioEnvio;
        this.servicioB = servicioPDF;

    }
    public void imprimir(){
       servicioA.enviar();
       servicioB.pdf();
    }



}
