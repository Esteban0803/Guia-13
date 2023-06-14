//Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
//causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
//no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
//número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
//utilizando bloques try/catch para las distintas excepciones
package ej4;

import java.util.InputMismatchException;

public class Ej4 {
    public static void main(String[] args) {
        try {
            int numero = obtenerNumero();
            int resultado = convertirEntero(numero);
            int division = dividirNumero(resultado);
            
            System.out.println("El resultado de la division es: " + division);
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no valida. Se esperaba un numero entero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: No se pudo convertir la cadena a entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division por cero.");
        }
    }

    public static int obtenerNumero() {
        int numero = 0;
        try {
            System.out.print("Ingrese un numero entero: ");
            numero = new java.util.Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            throw e;
        }
        return numero;
    }

    public static int convertirEntero(int numero) {
        int resultado = 0;
        try {
            resultado = Integer.parseInt(String.valueOf(numero));
        } catch (NumberFormatException e) {
            throw e;
        }
        return resultado;
    }

    public static int dividirNumero(int numero) {
        int division = 0;
        try {
            division = numero / 0;
        } catch (ArithmeticException e) {
            throw e;
        }
        return division;
    }
}
