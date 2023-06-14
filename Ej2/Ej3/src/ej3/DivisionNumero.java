//Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
//números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//una división con los dos numeros y mostrar el resultado.
package ej3;

import java.util.Scanner;

public class DivisionNumero {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        String numero1 = leer.nextLine();

        System.out.print("Ingrese el segundo número: ");
        String numero2 = leer.nextLine();

        try {
            int num1 = Integer.parseInt(numero1);
            int num2 = Integer.parseInt(numero2);

            if (num2 != 0) {
                int resultado = num1 / num2;
                System.out.println("El resultado de la division es: " + resultado);
            } else {
                System.out.println("No es posible dividir entre cero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir los números. Asegurese de ingresar valores enteros.");
        }
    }
}
