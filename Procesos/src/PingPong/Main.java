package PingPong;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {

        //Declaracion de 2 threads
        PingPong t1 = new PingPong("PING",33);
        PingPong t2 = new PingPong("PONG",10);

        //Activacion
        t1.start();
        t2.start();

        //Espera 2 segundos
        try { sleep(5000);
        } catch (InterruptedException e) {};

        //Finaliza la ejecucion de los threads
        t1.stop();
        t2.stop();
    }
}
