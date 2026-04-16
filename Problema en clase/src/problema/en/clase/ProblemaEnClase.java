package problema.en.clase;
import java.util.Scanner;
public class ProblemaEnClase {
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        int dni = 0;
        boolean input_valido = false;
        do{
           try{
           System.out.println("ingrese un DNI");
           dni = Lector.nextInt();
           }
           catch(Exception error){
               System.out.println("Error dato invalido");
               Lector.next();
               continue;
           }
           String dni_convertido = String.valueOf(dni);
           int cantidad_digitos = dni_convertido.length();
           if(cantidad_digitos == 8){
               input_valido = true;
           }
           else{
               System.out.println("No son 8 digitos");
           }
        }
        while (input_valido == false);
        System.out.println("A sido ingresado correctamente,es "+dni);
    }
}
