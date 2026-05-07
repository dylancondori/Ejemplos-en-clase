package ejemplo_importante_1;

public class Ejemplo_importante_1 {
    static float FuncionEjemplo( int nota1, int nota2 ){
        float resultado = (nota1 + nota2) / 2.0f;
        return resultado;
    }
    public static void main(String[] args) {
        float res = FuncionEjemplo(6,9);
        System.out.println(res);
    }
    
}
