//Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
//de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
//con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
package Personas;
import java.util.Scanner;

public class Ej1 {
    public Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        PersonaServicio s1 = new PersonaServicio();
        Personas p1 = null;
        Personas p2 = new Personas("Pepe", 0, "M", 50, 1);
        //TRABAJANDO CON IF
        try {
            if (p2.getEdad() <= 0);
        } catch (Exception e) {// (NullPointerException e)
            System.out.println("No tiene valores asignados");
        }
        //SIN IF 
        try {
            s1.esMayorDeEdad(p1.getEdad());
        } catch (Exception e) {// (NullPointerException e)
            System.out.println("No tiene valores asignados");
        }
    }
}

