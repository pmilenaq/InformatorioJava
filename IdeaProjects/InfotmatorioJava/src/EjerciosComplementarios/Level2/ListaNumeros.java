package EjerciosComplementarios.Level2;

import java.util.ArrayList;

public class ListaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Primera lista de numeros Enteros");
        System.out.println("Tamaño: " + numeros.size());
            for (int i : numeros) {
                System.out.println(i);
            }

            numeros.add(0, 33);
            numeros.add(993);
            System.out.println("Resultado de Lista");
            System.out.println("Tamaño: " + numeros.size());
            for (int i : numeros) {
                System.out.println(i);
            }

    }
}
