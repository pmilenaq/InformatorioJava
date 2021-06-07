package EjerciosComplementarios.Level1;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de "+n+" es :"+factorial);
    }
}
