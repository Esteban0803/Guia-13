//Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
//debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
//ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
//número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
//consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
//ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
//controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
//carácter fallido como un intento.
package ej5;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ej5 {
    public Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int numeroAdivinar = generarNumeroAleatorio(1, 500);
        int intentos = 0;

        System.out.println("******ADVIVINA EL NUMERO!******");

        while (true) {
            try {
                int numeroUsuario = pedirNumero();
                intentos++;

                if (numeroUsuario == numeroAdivinar) {
                    System.out.println("¡Felicidades! Has adivinado el número " + numeroAdivinar + ".");
                    break;
                } else if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor que " + numeroUsuario + ".");
                } else {
                    System.out.println("El número a adivinar es menor que " + numeroUsuario + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número válido.");
                intentos++;
                Scanner leer2 = new Scanner(System.in);
                leer2.next();
            }
        }

        System.out.println("Has realizado " + intentos + " intentos.");
    }

    private static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private static int pedirNumero() {
        System.out.print("Introduce un número: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    } 
}
