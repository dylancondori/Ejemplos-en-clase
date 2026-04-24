package ejemplo_en_clase_17.pkg4.pkg26;
import java.util.Scanner;
public class Ejemplo_en_clase_17426 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        int vector[] = new int [10];
        int v = 0;
        int o = 0;
        int c = 0;
        float promedio = 0.0f;
        float promedio_negativo = 0.0f;
        float resultado = 0.0f;
        float resultado1 = 0.0f;
        while (10 > v){
             System.out.println("Ingrese un numero");
             vector[v] = u.nextInt();
             if(vector[v] > 0){
                 promedio = promedio + vector[v];
                 o++;
             }
             else{
                 promedio_negativo = promedio_negativo + vector[v];
                 c++;
             }
             v++;
         }
        resultado = promedio / 10;
        resultado1= promedio_negativo / 10;
        System.out.println("el promedio positivo es de = "+resultado);
        System.out.println("el promedio negativo es de = "+resultado1);
        System.out.println("los numeros positivos son: "+c);
        System.out.println("los numeros negativos son: "+o);
    }
    
}
