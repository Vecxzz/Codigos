package Ejercicio1;

public class Persona {


    //Atributos
    private String nombre;
    private int edad;


    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //Métodos
    public void imprimir() {
        String mensaje = null;
        System.out.println(mensaje.toString());
    }
}