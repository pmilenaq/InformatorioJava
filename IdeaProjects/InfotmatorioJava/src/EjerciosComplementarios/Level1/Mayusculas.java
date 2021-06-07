package EjerciosComplementarios.Level1;

import java.util.Scanner;

public class Mayusculas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        sc.close();



        for(int i = 0; i < cadena.length(); i++) {
            char letras = cadena.charAt(i);
            if (letras >= 97 && letras <= 122) {
                letras -= 32;
            }

            System.out.print(letras);
        }

    }
}
