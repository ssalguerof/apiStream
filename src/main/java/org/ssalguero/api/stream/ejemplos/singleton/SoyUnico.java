package org.ssalguero.api.stream.ejemplos.singleton;

public class SoyUnico {
    private String nombre;
    private static SoyUnico soyUnico;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private SoyUnico(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static SoyUnico getSingletonInstance(String nombre) {
        if (soyUnico == null){
            soyUnico = new SoyUnico(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase SoyUnico");
        }

        return soyUnico;
    }
    // metodos getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static SoyUnico getSoyUnico() {
        return soyUnico;
    }

    public static void setSoyUnico(SoyUnico soyUnico) {
        SoyUnico.soyUnico = soyUnico;
    }
}
