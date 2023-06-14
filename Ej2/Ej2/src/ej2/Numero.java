//Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
//generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
//de rango).
package ej2;

public class Numero {
    public static void main(String[] args) {
        Numero num = new Numero();
        num.iniciar();
    }
    public void iniciar(){
        int[] numero = {1, 2, 3, 4, 5};
        try {
            int elemento = numero[10];
            System.out.println("Elemento obtenido: " + elemento);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El codigo esta mal, zoquete " + e.getMessage());
        }
    }
}

