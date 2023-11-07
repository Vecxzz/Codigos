import java.util.ArrayList;
import java.util.Scanner;

class Tarea{
    //Atributos
    private String descripcion;
    
    //Constructor
    public Tarea(String descripcion){
        this.descripcion = descripcion;
    }
    
    //Getters
    public String getDescripcion(){
        return descripcion;
    }
}

//Clase Principal (Lista Tareas)
public class ListaTareas{
    
    //Método Main
    public static void main(String[] args){
        //Crear Scanner
        Scanner sc = new Scanner(System.in);
        
        //Crear ArrayList
        ArrayList<Tarea> listaTareas = new ArrayList<>();
        int opcion = 0;
        
        while (opcion != 4){
            System.out.println("MENÚ");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Mostrar Tareas");
            System.out.println("3. Eliminar Tarea");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion){
                case 1:
                    //Ingresar Tarea
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String descripcion = sc.nextLine();
                    Tarea nuevaTarea = new Tarea(descripcion);
                    listaTareas.add(nuevaTarea);
                    System.out.println("Tarea Agregada con exito");
                    break;
                    
                case 2:
                    //Mostrar Tarea
                    System.out.println("Lista de Tareas: ");
                    for (int i = 0; i < listaTareas.size(); i++){
                        System.out.println((i + 1) + ". " + listaTareas.get(i).getDescripcion());
                    }
                    break;
                    
                case 3:
                    //Eliminar Tarea
                    System.out.println("Ingrese el número de la tarea a eliminar: ");
                    int tareaEliminar = sc.nextInt();
                    if (tareaEliminar > 0 && tareaEliminar <= listaTareas.size()){
                        listaTareas.remove(tareaEliminar - 1);
                        System.out.println("Tarea eliminada correctamente");
                    }
                    else{
                        System.out.println("Número de tarea inválido");
                    }
                    break;
                
                case 4:
                    //Salir
                    System.out.println("Saliendo del programa");
                    break;
                
                default:
                System.out.println("Opción no válida. Inténtelo de nuevo");
                break;
            }
        }
        
    }
}