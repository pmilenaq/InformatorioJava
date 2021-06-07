package EjerciosComplementarios.Level2;

import java.util.ArrayList;

public class Ciudades {
    public static void main(String[] args ) {
        ArrayList<String> ciudades = new ArrayList();
        ciudades.add("Bariloche");
        ciudades.add("Cordoba");
        ciudades.add("Resistencia");
        int i;
        i = 0;
        for (i = 0; i< ciudades.size(); i++) {
            System.out.println("#" + (i+1) + "-" + ciudades.get(i));
        }
    }
}
