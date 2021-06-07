package EjerciosComplementarios.Level1;

import java.util.Scanner;

public class DatosPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Nombre y Apellido: ");
        String nomYAp = sc.nextLine();

        System.out.println("Ingrese edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese direccion de domicilio: ");
        String domicilio = sc.nextLine();

        System.out.println("Ingrese Ciudad: ");
        String ciudad = sc.nextLine();

        System.out.println(ciudad + " " + domicilio + "  " + edad + "  " + nomYAp);
    }






}
