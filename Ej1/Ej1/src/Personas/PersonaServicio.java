
package Personas;
import java.util.Scanner;

public class PersonaServicio {
    private char sexo;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Personas crearPersonas() {
        Personas p1 = new Personas();
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona");
        p1.setEdad(leer.nextInt());
        leer.nextLine(); 
        System.out.println("Ingrese el sexo (H/M/O)");
        p1.setSexo(leer.next());
        while (p1.getSexo().charAt(0) != 'H' && p1.getSexo().charAt(0) != 'M' && p1.getSexo().charAt(0) != 'O') {
        System.out.println("El sexo introducido no es correcto. Introduce H, M o O.");
        System.out.print("Introduce el sexo de la persona (H/M/O): ");
        p1.setSexo(leer.next());
        }
        System.out.println("Ingrese el peso de la persona");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona");
        p1.setAltura(leer.nextDouble());
        return p1;
    }

    public boolean esMayorDeEdad(int edad) {
        if (edad < 18) {
            return false;
        } else {
            return true;
        }
    }

    public int calcularIMC(double peso, double altura) {
        int result;
        result = 0;
        double a = altura;
        double t = peso / (a * a);
        if (t < 20) {
            return -1;
        } else if (t > 25) {
            return 1;
        } else {
            return 0;
        }
    }
}
