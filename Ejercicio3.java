import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int Num;
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        Num = sr.nextInt();
        int contador = Num;
        for (int i = 1; i < Num; i++) {
            contador *= i;
        }
        System.out.println("El factorial de " + Num + " es: " + contador);

    }
}
