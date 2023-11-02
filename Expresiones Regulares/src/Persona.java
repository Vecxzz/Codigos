import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
    //Agrupar conjunto de datos de una persona
    private String nombre;
    private String correoElectronico;
    private String numeroTelefono;
    private String codPostal;
    private String paginaWeb;

    //Constructor
    public Persona(String nombre, String correoElectronico, String numeroTelefono, String codPostal, String paginaWeb) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
        this.codPostal = codPostal;
        this.paginaWeb = paginaWeb;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getCorreoElectronico(){
        return correoElectronico;
    }

    public String getNumeroTelefono(){
        return numeroTelefono;
    }

    public String getCodigoPostal(){
        return codPostal;
    }

    public String getPaginaWeb(){
        return paginaWeb;
    }

    public static void main(String[] args){
        //Crear el objeto Persona 1
        Persona persona1 = new Persona(
                "Marta Gonzalez",
                "marta.gonzalez@gmail.com",
                "261-342-8973",
                "2801",
                "www.martagonzalez.com"
        );

        //Crear el objeto Persona 2
        Persona persona2 = new Persona(
                "Elena Ramirez",
                "ramirezelena34@gmail.com",
                "265.345.2356",
                "EA21",
                "http://www.elena.net"
        );


        //Crear un ArrayList para almacenar los datos de la persona1
        ArrayList<Persona> datosPersona1 = new ArrayList<>();
        datosPersona1.add(persona1);

        //Crear un ArrayList para almacenar los datos de la persona2
        ArrayList<Persona> datosPersona2 = new ArrayList<>();
        datosPersona2.add(persona2);


        //Definir Expresión Regular (NOMBRE)
        String regexNombre = "[a-zA-Z]+\\s[a-zA-Z]+";

        //Definir Expresión Regular (CORREO ELECTRONICO)
        String regexCorreo = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z]+";

        //Definir Expresión Regular (NÚMERO DE TELÉFONO)
        String regexNumero = "\\d{3}[\\s-]\\d{3}[\\s-]\\d{4}";

        //Definir Expresión Regular (CÓDIGO POSTAL)
        String regexCodigo = "^[0-9]{4}";

        //Definir Expresión Regular (PÁGINA WEB)
        String regexPagina = "^(https?:\\/\\/)?(www\\.)[a-zA-Z0-9.-]+\\.[a-z-A-Z0-9.-]+$";



        //Buscar las expresiones en Persona1
        for (Persona persona : datosPersona1){
            //Aplicar la expresión regular al campo NOMBRE
            Pattern patternNombre = Pattern.compile(regexNombre);
            Matcher matcherNombre = patternNombre.matcher(persona.getNombre());

            //Aplicar la expresión regular al campo CORREO ELECTRONICO
            Pattern patternCorreo = Pattern.compile(regexCorreo);
            Matcher matcherCorreo = patternCorreo.matcher(persona.getCorreoElectronico());

            //Aplicar la expresión regular al campo NÚMERO DE TELÉFONO
            Pattern patternNumero = Pattern.compile(regexNumero);
            Matcher matcherNumero = patternNumero.matcher(persona.getNumeroTelefono());

            //Aplicar la expresión regular al campo CÓDIGO POSTAL
            Pattern patternCodigo = Pattern.compile(regexCodigo);
            Matcher matcherCodigo = patternCodigo.matcher(persona.getCodigoPostal());

            //Aplicar la expresión regular al campo PÁGINA WEB
            Pattern patternPagina = Pattern.compile(regexPagina);
            Matcher matcherPagina = patternPagina.matcher(persona.getPaginaWeb());

            if (matcherNombre.find()){
                System.out.println("Nombre Válido para " + persona.getNombre() + ": " + matcherNombre.group());
            }
            else {
                System.out.println("El Nombre NO es Válido");
            }
            if (matcherCorreo.find()){
                System.out.println("Correo Electronico Válido para " + persona.getCorreoElectronico() + ": " + matcherCorreo.group());
            }
            else {
                System.out.println("El Correo Electronico NO es Válido");
            }
            if (matcherNumero.find()){
                System.out.println("Número de Teléfono Válido para " + persona.getNumeroTelefono() + ": " + matcherNumero.group());
            }
            else {
                System.out.println("El Número de Teléfono NO es Válido");
            }
            if (matcherCodigo.find()){
                System.out.println("Código Postal Válido para " + persona.getCodigoPostal() + ": " + matcherCodigo.group());
            }
            else {
                System.out.println("El Código Postal NO es Válido");
            }
            if (matcherPagina.find()){
                System.out.println("Página Web Válida para " + persona.getPaginaWeb() + ": " + matcherPagina.group());
            }
            else {
                System.out.println("La Página Web NO es Válida");
            }
        }

        System.out.println(" ");

        //Buscar las expresiones en Persona2
        for (Persona persona : datosPersona2){
            //Aplicar la expresión regular al campo NOMBRE
            Pattern patternNombre = Pattern.compile(regexNombre);
            Matcher matcherNombre = patternNombre.matcher(persona.getNombre());

            //Aplicar la expresión regular al campo CORREO ELECTRONICO
            Pattern patternCorreo = Pattern.compile(regexCorreo);
            Matcher matcherCorreo = patternCorreo.matcher(persona.getCorreoElectronico());

            //Aplicar la expresión regular al campo NÚMERO DE TELÉFONO
            Pattern patternNumero = Pattern.compile(regexNumero);
            Matcher matcherNumero = patternNumero.matcher(persona.getNumeroTelefono());

            //Aplicar la expresión regular al campo CÓDIGO POSTAL
            Pattern patternCodigo = Pattern.compile(regexCodigo);
            Matcher matcherCodigo = patternCodigo.matcher(persona.getCodigoPostal());

            //Aplicar la expresión regular al campo PÁGINA WEB
            Pattern patternPagina = Pattern.compile(regexPagina);
            Matcher matcherPagina = patternPagina.matcher(persona.getPaginaWeb());

            if (matcherNombre.find()){
                System.out.println("Nombre Válido para " + persona.getNombre() + ": " + matcherNombre.group());
            }
            else {
                System.out.println("El Nombre NO es Válido");
            }
            if (matcherCorreo.find()){
                System.out.println("Correo Electronico Válido para " + persona.getCorreoElectronico() + ": " + matcherCorreo.group());
            }
            else {
                System.out.println("El Correo Electronico NO es Válido");
            }
            if (matcherNumero.find()){
                System.out.println("Número de Teléfono Válido para " + persona.getNumeroTelefono() + ": " + matcherNumero.group());
            }
            else {
                System.out.println("El Número de Teléfono NO es Válido");
            }
            if (matcherCodigo.find()){
                System.out.println("Código Postal Válido para " + persona.getCodigoPostal() + ": " + matcherCodigo.group());
            }
            else {
                System.out.println("El Código Postal NO es Válido");
            }
            if (matcherPagina.find()){
                System.out.println("Página Web Válida para " + persona.getPaginaWeb() + ": " + matcherPagina.group());
            }
            else {
                System.out.println("La Página Web NO es Válida");
            }
        }

    }
}