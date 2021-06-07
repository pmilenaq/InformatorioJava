package EjerciosComplementarios.Level2;

import java.util.HashMap;
import java.util.HashSet;


public class Empleados {
    public static void main(String[] args) {
        HashSet<Empl> empl = new HashSet<>();
        HashMap<Integer, Float> salarios = new HashMap<>();

        empl.add(new Empl("Empleado 1", 34567893, 4, 653));
        empl.add(new Empl("Empleado 2", 35858908, 5, 765));
        empl.add(new Empl("Empleado 3", 23175843, 6, 842));
        empl.add(new Empl("Empleado 4", 13567345, 7, 943));

        for (Empl i : empl) {
            salarios.put(i.getDni(), i.getSalary());
        }

        salarios.forEach((dni, salario) -> System.out.println("Dni: " + dni + " - Sueldo correspondiente: " + salario));
    }
}
 class Empl {
    String nombre;
    int dni;
    float horasTrabajadas;
    float precioPorHora;

    public Empl(String nombre, int dni, float horasTrabajadas, float precioPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.precioPorHora = precioPorHora;
    }

    public int getDni() {
        return dni;
    }

    public float getSalary() {
        return this.horasTrabajadas * this.precioPorHora;
    }
}

