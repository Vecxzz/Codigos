package EjercicioProcesos1;

public class Procesos extends Thread {

    //Atributos
    public int id;


    //Constructor Vacio
    public Procesos() {
    }


    //Constructor Sobrecargado
    public Procesos(String name, int id) {
        super(name);
        this.id = id;
    }


    //Proceso
    public void run() {
        System.out.println("Soy el proceso: " + this.getName() + " con ID: " + id);
    }
}