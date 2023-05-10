
public class Main {
    public static void main(String[] args) {
//        String nombre = "Bernardo";
//        int cantidad;
//        char inicial;
//
//        System.out.println();
//        System.out.println(nombre);
//
//        cantidad = nombre.length();
//        inicial = nombre.charAt(0);
//        nombre = nombre.toUpperCase();

//        if(nombre.equals("BERNARDO")){
//            System.out.println("Se paso el nombre a mayuscula");
//        }
//        System.out.println("El nombre es "+nombre);
//        System.out.println("El nombre tiene "+cantidad + " de letras");
//        System.out.println(inicial);


//        Ejercicio 1
//        Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
//        mensaje.

        String nombre1 = "Bernardo";
        String nombre2 = "Jose";

        if(nombre1.equals(nombre2)){
            System.out.println("Los nombres son iguales");
        }else
            System.out.println("Los nombres son diferentes");


//        Ejercicio 2
//
//        Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
//        Informar el resultado obtenido.

        Integer num1 = 5;
        Integer num2 = 15;
        int comparar;

        if (num1.equals(num2)){
            System.out.println("Ambos numeros son iguales");
        } else {
            comparar = num1.compareTo(num2);
            if (comparar> 0){
                System.out.println("El numero 1 es mayor que numero 2");
            }else
                System.out.println("El numero 2 es mayor");
            
        }
    }
}