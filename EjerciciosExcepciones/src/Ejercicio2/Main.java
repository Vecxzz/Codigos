package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        try {
            Array a1 = new Array(5);
            a1.setValor(0,10);
            a1.setValor(5,30); //Valor fuera de rango
        } catch (Exception e) {
            System.out.println("Se ha producido una Excepción: " + e.getMessage());
        }
    }
}