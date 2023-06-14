package ej6a9;
public class Ej6a9 {
/*
6/ Dado el método metodoA de la clase A, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
class A {
public void metodoA() {
sentencia_a1
sentencia_a2
try {
sentencia_a3
sentencia_a4
} catch (MioException e){
sentencia_a6
}
sentencia_a5
}
}
    RESPUESTA:
    A/ Si se produce la excepcion seria: sentencia_a1, sentencia_a2, sentencia_a3, sentencia_a4
       sentencia_a6 y sentencia_a5
    B/ Si NO se produce la excepcion seria:sentencia_a1, sentencia_a2, sentencia_a3, sentencia_a4 y sentencia_a5   
    */
    
    
/*
7/Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
class B {
public void metodoB() {
sentencia_b1
try {
sentencia_b2
} catch (MioException e){
sentencia_b3
}
finally
sentencia_b4
}
}
    RESPUESTA:
    A/ Si se produce la excepcion seria: sentencia_a1, sentencia_a2, sentencia_a3 y sentencia_a4
    B/ Si NO produce la excepcion seria: sentencia_a1, sentencia_a2 y sentencia_a4
    */
    
    
/*
8/ Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
class Uno{
private static int metodo() {
int valor=0;
try {
valor = valor+1;
valor = valor + Integer.parseInt (”42”);
valor = valor +1;
System.out.println(”Valor final del try:” + valor) ;
} catch (NumberFormatException e) {
Valor = valor + Integer.parseInt(”42”);
System.out.println(“Valor final del catch:” + valor);
} finally {
valor = valor + 1;
System.out.println(”Valor final del finally: ” + valor) ;
}
valor = valor +1;
System.out.println(”Valor antes del return: ” + valor) ;
return valor;
}

public static void main (String[] args) {
try {
System.out.println (metodo()) ;
}catch(Exception e) {
System.err.println(”Excepcion en metodo() ”) ;
e.printStackTrace();
}
}
}
class Dos{
private static int metodo() {
int valor=0;
try{
valor = valor + 1;
valor = valor + Integer.parseInt (”W”);
valor = valor + 1;
System.out.println(”Valor final del try: ” + valor) ;
} catch ( NumberFormatException e ) {
valor = valor + Integer.parseInt (”42”);
System.out.println(”Valor final del catch: ” + valor) ;
} finally {
valor = valor + 1;
System.out.println(”Valor final del finally: ” + valor) ;
}
valor = valor + 1;
System.out.println(”Valor antes del return: ” + valor) ;
return valor;
}
public static void main (String[] args) {
try{
System.out.println ( metodo ( ) ) ;
} catch(Exception e) {
System.err.println ( ” Excepcion en metodo ( ) ” ) ;
e.printStackTrace();
}
}
}

class Tres{
private static int metodo( ) {
int valor=0;
try{
valor = valor + 1;
valor = valor + Integer.parseInt (”W”);
valor = valor + 1;
System.out.println(”Valor final del try: ” + valor);
} catch(NumberFormatException e) {
valor = valor + Integer.parseInt (”W”);
System.out.println(”Valor final del catch: ” + valor);
} finally{
valor = valor + 1;
System.out.println(”Valor final del finally:” + valor);
}
valor = valor + 1;
System.out.println(”Valor antes del return: ” + valor) ;
return valor;
}
public static void main (String[] args) {
try{
System.out.println( metodo ( ) ) ;
} catch(Exception e) {
System.err.println(”Excepcion en metodo ( ) ” ) ;
e.printStackTrace();
}
}
}
    RESPUESTA:
    Clase Uno:
        Valor final del try: 44
        Valor final del finally: 45
        Valor antes del return: 46   
    Clase Dos:
        Valor final del catch: 43
        Valor final del finally: 44
        Valor antes del return: 45  
    Clase Tres:
        Valor final del catch: 1
        Valor final del finally: 2
        Valor antes del return: 3
    */
    
    
/*
9/Dado el método metodoC de la clase C, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?

class C {
void metodoC() throws TuException{
sentencia_c1
try {
sentencia_c2
sentencia_c3
} catch (MioException e){
sentencia_c4
} catch (TuException e){
sentencia_c5
throw (e)
}
finally
sentencia_c6
    
    RESPUESTAS:
    A/ Si se produce MioException seria: sentencia_a1, sentencia_a2, sentencia_a3, sentencia_a4 y sentencia_6
    B/ Si NO produce la excepcion seria: sentencia_a1, sentencia_a2, sentencia_a3 y sentencia_a6
    C/ Si se produce TuException seria: sentencia_a1, sentencia_a2, sentencia_a3, sentencia_a5 y throw (e)
    */
}
