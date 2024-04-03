package Ejercicio2;

public class Array {


    //Crear Array
    private int[] array;


    //Constructor
    public Array(int tamano) {
        array = new int[tamano];
    }


    //Métodos
    public void setValor(int indice, int valor) {
        try {
            //Verificar si el índice esta dentro del rango válido
            if (indice >= 0 && indice < array.length) {
                array[indice] = valor;
            } else {
                //Si el índice esta fuera de rango, lanza una exepción
                throw new IndexOutOfBoundsException("Índice fuera de rango");
            }
        } catch (IndexOutOfBoundsException e) {
            //Capturar la excepción
            System.out.println("Se ha producido una Excepción: " + e.getMessage());
        }
    }
}