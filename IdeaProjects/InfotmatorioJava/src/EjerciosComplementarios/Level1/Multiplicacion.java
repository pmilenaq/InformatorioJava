package EjerciosComplementarios.Level1;

import java.util.Scanner;

public class Multiplicacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingrese primer numero entero: ");
        num1 = sc.nextInt();

        System.out.println("Ingrese segundo numero entero: ");
        num2 = sc.nextInt();

        System.out.println("La multiplicacion de los dos numeros es " + (num1 * num2));
    }
}
