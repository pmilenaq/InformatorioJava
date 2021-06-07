package EjerciosComplementarios.Level1;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese primer numero entero: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese potencia: ");
        int num2 = sc.nextInt();

        int resultado = 1;
        for( int i = 1; i <= num2; i++ ) resultado *= num1;
        System.out.println("La operacion de potencia es: " + resultado);



    }
}
