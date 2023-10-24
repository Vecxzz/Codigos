import java.util.ArrayList;

public class EquipoDeFutbol {
    private ArrayList<String> jugadores;

    public EquipoDeFutbol(){
        jugadores = new ArrayList<String>();
    }

    public void agregarJugador(String jugador){
        jugadores.add(jugador);
    }

    public void eliminarJugadores(String jugador){
        jugadores.remove(jugador);
    }

    public void listarPlantilla(){
        System.out.println("Plantilla: ");
        for (String jugador : jugadores){
            System.out.println(jugador);
        }
    }

    //Crear método para que el usuario eliga
    public static void main(String args[]){
        EquipoDeFutbol miEqupo = new EquipoDeFutbol();

        //Agregar Jugadores
        miEqupo.agregarJugador("İlkay Gündoğan");
        miEqupo.agregarJugador("Jack Grealish");
        miEqupo.agregarJugador("Aubameyang");

        //Listar Plantilla
        miEqupo.listarPlantilla();

        //Eliminar Jugadores
        miEqupo.eliminarJugadores("Aubameyang");

        miEqupo.listarPlantilla();

    }

}
