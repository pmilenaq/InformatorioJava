package EjerciosComplementarios.Level2;

import java.util.ArrayList;
import java.util.Collections;

public class Cartas {

    public static void main(String[] args) {
        ArrayList<String> cartas = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            cartas.add("Carta numero " + (i + 1));
        }

        System.out.println("Cartas en el primer orden");
        for (String card : cartas) {
            System.out.println(card);
        }

        Collections.reverse(cartas);
        System.out.println("Cartas en orden inverso");
        for (String card : cartas) {
            System.out.println(card);
        }

        Collections.shuffle(cartas);
        System.out.println("Cartas mezcladas");
        cartas.forEach(System.out::println);
    }
}