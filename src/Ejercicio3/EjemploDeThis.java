package Ejercicio3;

public class EjemploDeThis {
    private static String nombre;

    public EjemploDeThis(String nombre) {
        this.nombre = nombre;
    }

    public static void metodoStatico() {
        System.out.println(nombre);
    }
}

