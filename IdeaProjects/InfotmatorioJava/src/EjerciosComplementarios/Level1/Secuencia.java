package EjerciosComplementarios.Level1;

import java.util.Scanner;

    public class Secuencia {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese numero entero: ");
            int a = sc.nextInt();



            for (int b = 1; b <= a; b++) {
                for (int c = 1; c <= b; c++) {
                    System.out.print(c + " ");
                }

                System.out.println("");
            }
        }
    }
