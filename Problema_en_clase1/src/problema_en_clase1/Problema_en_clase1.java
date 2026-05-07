package problema_en_clase1;
import java.util.Scanner;
public class Problema_en_clase1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int vector[] = new int[10];
int indice = 0;
int j;

// Cargar datos
for(int o = 0; o < 10; o++){
    System.out.println("Ingrese un número:");
    vector[o] = num.nextInt();
}

// Burbuja
for(indice = 0; indice < 9; indice++){
    for(j = 0; j < 9 - indice; j++){
        if(vector[j] < vector[j + 1]){ // descendente
            int temporal = vector[j];
            vector[j] = vector[j + 1];
            vector[j + 1] = temporal;
        }
    }
}

// Mostrar resultado
for(int i = 0; i < 10; i++){
    System.out.println(vector[i]);
}
    }
}
