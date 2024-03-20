package EjercicioProcesos1;

public class Main {
    public static void main(String[] args) {

        //Crear Proceso
        Procesos p1 = new Procesos("Llamar a Impresora", 1);
        Procesos p2 = new Procesos("Grabar el Disco", 2);
        Procesos p3 = new Procesos("Ejecutar el Programa", 3);
        Procesos p4 = new Procesos("Tomar datos Casilla", 4);


        //Ejecutar Proceso
        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}