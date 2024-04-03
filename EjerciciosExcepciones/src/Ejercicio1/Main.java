package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        try {
            //Instanciar un objeto de la clase Persona
            Persona p1 = new Persona("Pedro",24);

            //Invocar el método imprimir
            p1.imprimir();
        } catch (Exception e) {
            System.out.println("Se ha producido una Excepción: " + e.getMessage());
        }
    }
}