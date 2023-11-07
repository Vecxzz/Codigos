import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args){
        //Crear Scanner
        Scanner sc = new Scanner(System.in);

        /*Ejercicio 1
        System.out.print("Ingrese su Número de Teléfono: ");
        String NumeroTel = sc.nextLine();

        String regexNumeroTel = "\\d{7,10}";

        Pattern pattern = Pattern.compile(regexNumeroTel);
        Matcher matcher = pattern.matcher(NumeroTel);

        if (matcher.matches()){
            System.out.println("Número de Teléfono válido");
        }
        else {
            System.out.println("Número de Teléfono invalido");
        }
        */


        /*Ejercicio 2
        System.out.print("Ingrese su Número de CUIL: ");
        String NumeroCuil = sc.nextLine();

        String regexNumeroCuil = "\\d{11}";

        Pattern pattern = Pattern.compile(regexNumeroCuil);
        Matcher matcher = pattern.matcher(NumeroCuil);

        if (matcher.matches()){
            System.out.println("Número de CUIL válido");
        }
        else {
            System.out.println("Número de CUIL invalido");
        }
        */


        /*Ejercicio 3
        System.out.print("Ingrese su Correo Electrónico: ");
        String CorreoElectronico = sc.nextLine();

        String regexCorreoElectronico = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z]+";

        Pattern pattern = Pattern.compile(regexCorreoElectronico);
        Matcher matcher = pattern.matcher(CorreoElectronico);

        if (matcher.matches()){
            System.out.println("Correo Electrónico válido");
        }
        else {
            System.out.println("Correo Electrónico invalido");
        }
        */


        /*Ejercicio 4
        System.out.print("Ingrese la Nomenclatura (22 Letras): ");
        String Nomenclatura = sc.nextLine();

        String regexNomenclatura = "^[a-zA-Z0-9]{22}";

        Pattern pattern = Pattern.compile(regexNomenclatura);
        Matcher matcher = pattern.matcher(Nomenclatura);

        if (matcher.matches()){
            System.out.println("Nomenclatura válida");
        }
        else {
            System.out.println("Nomenclatura invalida");
        }
        */


        /*Ejercicio 5 CORREGIR
        System.out.print("Ingrese su Nombre: ");
        String Nombre = sc.nextLine();

        String regexNombre = "[a-zA-Z]{7,10}";

        Pattern pattern = Pattern.compile(regexNombre);
        Matcher matcher = pattern.matcher(Nombre);

        if (matcher.matches()){
            System.out.println("Nombre válido");
        }
        else {
            System.out.println("Nombre invalido");
        }
        */


        /*Ejercicio 6
        System.out.print("Ingrese su Número de Teléfono: ");
        String NumeroTelefono = sc.nextLine();

        System.out.print("Ingrese su Número de CUIL: ");
        String NumeroCuil = sc.nextLine();

        System.out.print("Ingrese su Correo Electrónico: ");
        String CorreoElectronico = sc.nextLine();

        String regexNumeroTelefono = "\\d{7,10}";
        String regexNumeroCuil = "\\d{11}";
        String regexCorreoElectrinico = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z]+";

        Pattern patternNumeroTel = Pattern.compile(regexNumeroTelefono);
        Matcher matcherNumeroTel = patternNumeroTel.matcher(NumeroTelefono);

        Pattern patternNumeroCuil = Pattern.compile(regexNumeroCuil);
        Matcher matcherNumeroCuil = patternNumeroCuil.matcher(NumeroCuil);

        Pattern patternCorreoElectronico = Pattern.compile(regexCorreoElectrinico);
        Matcher matcherCorreoElectronico = patternCorreoElectronico.matcher(CorreoElectronico);

        if (matcherNumeroTel.matches()){
            System.out.println("Número de Teléfono válido");
        }
        else {
            System.out.println("Número de Teléfono invalido");
        }

        if (matcherNumeroCuil.matches()){
            System.out.println("Número de CUIL válido");
        }
        else {
            System.out.println("Número de CUIL invalido");
        }

        if (matcherCorreoElectronico.matches()){
            System.out.println("Correo Electrónico válido");
        }
        else {
            System.out.println("Correo Electrónico invalido");
        }
        */


        //Ejercicio 7

    }
}