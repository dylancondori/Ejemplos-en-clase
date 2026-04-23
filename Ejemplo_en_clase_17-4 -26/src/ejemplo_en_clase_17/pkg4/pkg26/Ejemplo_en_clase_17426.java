package ejemplo_en_clase_17.pkg4.pkg26;
import java.util.Scanner;
public class Ejemplo_en_clase_17426 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        int vector[] = new int [10];
        int i = 0;
        int v = 0;
        int o = 0;
        int c = 0;
        int promedio = 0;
        int resultado = 0;
        do{
             System.out.println("Ingrese un numero");
             vector[v] = u.nextInt();
             if(vector[v] < 0){
                 o++;
             }
             else{
                 c++;
             }
             promedio = promedio + vector[v];
             v++;
         }while (10 > v);
        resultado = promedio / 10;
        System.out.println("el promedio es de = "+resultado);
        System.out.println("los numeros positivos son: "+c);
        System.out.println("los numeros negativos son: "+o);
    }
    
}
