package EjerciosComplementarios.Level2;

import java.util.ArrayList;
import java.util.List;

public class Estudiantes {

        public static void main(String[] args) {
            ArrayList<String> nombres = new ArrayList<>();
            getIncluir(nombres);

            List<String> primerCurso = nombres.subList(0,
                    4);
            List<String> segundoCurso = nombres.subList(4,
                    8);
            List<String> tercerCurso = nombres.subList(8,
                    12);

            System.out.println("Estudiantes del primer curso:");
            System.out.println(primerCurso);
            System.out.println("Estudiantes del segundo curso:");
            System.out.println(segundoCurso);
            System.out.println("Estudiantes del tercer curso:");
            System.out.println(tercerCurso);

        }

        private static void getIncluir(ArrayList<String> nombres) {
        incluir(nombres);
        }

            public static void incluir(ArrayList<String> array) {
            array.add("Eloisa");
            array.add("Antonio");
            array.add("Jorge");
            array.add("Paula");
            array.add("Gustavo");
            array.add("Nestor");
            array.add("Sol");
            array.add("Micaela");
            array.add("Franco");
            array.add("Lucia");
            array.add("Fabian");
            array.add("Jose");
        }




}
