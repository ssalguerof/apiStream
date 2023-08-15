package org.ssalguero.api.stream.ejemplos;

public class ExternaLocal {
    int atributo1 = 12;
    public void imprimir(String parametro){
        System.out.println("inicio de metodo imprimir de la clase ExternaLocal");
        int variableLocal = 2;

        class Local{
            public void imprimir(){
                System.out.println("Metodo imprimir de la clase local");
                System.out.println(atributo1);
                System.out.println(parametro);
                System.out.println(variableLocal);
            }
        }

        Local local = new Local();
        local.imprimir();
        System.out.println("Fin de metodo imprimir de la clase ExternaLocal");
    }

    public static void main(String[] args) {
        ExternaLocal externa = new ExternaLocal();
        externa.imprimir("texto parametro");
    }
}
