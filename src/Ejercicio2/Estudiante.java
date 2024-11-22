package Ejercicio2;

public class Estudiante {
    private int id;
    private String nombre;
    private int edad;

    public Estudiante(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante() {
        this(0,"Desconocido", 0);
    }

    public void mostrarEstudiante() {
        System.out.println("IDENTIFICACION: " + id);
        System.out.println("NOMBRE: " + nombre);
        System.out.println("EDAD: " + edad);
    }
}
