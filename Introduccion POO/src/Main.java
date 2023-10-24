import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        //Crear Scanner
        Scanner sc = new Scanner(System.in);

        //Ejercicio 1
        ArrayList<String> marcas = new ArrayList<>();

        while (true){
            System.out.println("Ingrese una marca de auto: ");
            String marca = sc.nextLine();
            marcas.add(marca);

            System.out.println("Marca agregada");
            System.out.println("¿Desea agregar otra marca? 1/0 : ");
            int opcion = sc.nextInt();

            if (opcion == 0){
                System.out.println("Saliendo del programa");
                break;
            } else if (opcion == 1) {
                marca = sc.nextLine();
            }
        }

        for (String marca : marcas){
            System.out.println(marca);
        }






    }
}