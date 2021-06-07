package EjerciosComplementarios.Level1;

import java.util.Scanner;
/**
 * Solicitar por consola el nombre del usuario
 * e imprimir por pantalla el siguiente mensaje
 * “HOLA {USUARIO}!!!”
 */

    public class Home {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese su nombre de usuario:");

            String nombre = sc.nextLine(); //Se lee el nombre con nextLine() que retorna un String con el nombre

            System.out.println("HOLA " + nombre );
        }
    }
