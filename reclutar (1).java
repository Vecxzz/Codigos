import java.util.Scanner;


public class reclutar{
    public static void main(String[] args) {
        String letras="ATCG";
        System.out.println("Ingrese el ADN de la persona");
        System.out.println("Ingrese las filas con 6 caracteres: ");
        String[] ADN=compopletarFilas(args,letras);
        
        
        if (isMutant(ADN)){
            System.out.println("La persona es mutante");
        
        }
        else{
            System.out.println("La persona no es mutante");
        }
    }

    //Funcion para completar las filas
    public static String [] compopletarFilas(String[]fila,String letra){
        Scanner teclado = new Scanner(System.in);
        String fil="";
        String [] retorno =new String[6];
        for (int i=0;i<6;i++){
            while (true) {
                System.out.print("Ingrese la fila "+(i+1)+": ");
                fil=teclado.nextLine().toUpperCase();;
                if (fil.length()==6){
                    if (validarCaracter(fil,letra)){
                        retorno[i]=fil;
                        break;
                    }
                    else{
                        System.out.println("Error algunos de los caracteres no son válidos");
                    }
                }
                else{
                    System.out.println("Error número de caracteres incorrectos");
                    System.out.println("---------------------");
                    
                }
            }
        }
        return retorno;
    }
    //Funcion para validar los caracteres ingresados en la fila
    public static boolean validarCaracter(String caracteres,String letra){
        
        for (int i=0 ;i<6;i++){
            //Saca el caracter de la palabra
            char caracter=caracteres.charAt(i);
            //Bucsa la primera ocurrecnia del caracte en la lista de letra
            if (letra.indexOf(caracter)==-1){
                return false;
            }        
        }
        return true;
    }
    //Funcion para validar si e mutante o no

    public static boolean isMutant(String[] dna){
        //Crear array multidimensional de los caracteres del ADN
        char [][] dniArray=new char[6][6];
        for (int i=0 ;i<6;i++){
            //Devuelve una cadena de caractres
            dniArray[i]=dna[i].toCharArray();
            
        }
        System.out.println("El ADN QUEDO ASI:");
        for (int i=0 ;i<6;i++){
            for (int j=0 ;j<6;j++){
                System.out.print(dniArray[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("---------------------------");
        int Secuencia=0;
        //Validar si se ecuentra 4 letras iguales horizontalemnte
        for (int i=0 ;i<6;i++){
            for (int j=0 ;j<=2;j++){
                if (dniArray[i][j]==dniArray[i][j+1]&&
                dniArray[i][j]==dniArray[i][j+2]&&
                dniArray[i][j]==dniArray[i][j+3]){
                    Secuencia++;

                }
            }
        }
        //Validar si se ecuentra 4 letras iguales verticalmente
        for (int j=0 ;j<6;j++){
            for (int i=0 ;i<=2;i++){
                if (dniArray[i][j]==dniArray[i+1][j]&&
                dniArray[i][j]==dniArray[i+2][j]&&
                dniArray[i][j]==dniArray[i+3][j]){
                    Secuencia++;
                }
            }
        }
         //Validar si se ecuentra 4 letras iguales de forma vertical de arriba a la izquierda hacia abajo a la derecha
        for (int i=0 ;i<2;i++){
            for (int j=0 ;j<=2;j++){
                if (dniArray[i][j]==dniArray[i+1][j+1]&&
                    dniArray[i][j]==dniArray[i+2][j+2]&&
                    dniArray[i][j]==dniArray[i+3][j+3]){
                    Secuencia++;
                }
            }
        }
        //Validar si se ecuentra 4 letras iguales de forma vertical de arriba a la derecha hacia abajo a la izquierda
        for (int i=6 ;i>2;i--){
            for (int j=-1 ;j>=2;j--){
                if (dniArray[i][j]==dniArray[i-1][j-1]&&
                    dniArray[i][j]==dniArray[i-2][j-2]&&
                    dniArray[i][j]==dniArray[i-3][j-3]){
                    Secuencia++;
                }
            }
        }
        if (Secuencia>1){
            
            return true;
        }
        else{ 
            return false;
        }
       
    }

}    
    
   



