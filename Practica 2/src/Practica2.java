import java.util.Scanner;
public class Practica2 {
    public static void main(String [] args) {
        //Práctica realizada por Natalia Cristóbal, curso 1A de DAW
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora: Por favor introduzca solo números positivos y operadores de suma, resta," +
                " multipilación o división.");
        System.out.println("-Introduce el primer número");
        int n1 = sc.nextInt();

        /* Vamos a comprobar si los números introducidos son negativos, para ello usaremos un if/else. En caso de ser positivos
        se continuara preguntando el siguiente número y luego la siguiente operación, de lo contrario se notoficara el error y con
        un System.exit pararemos el programa */

        if (n1>=0){
            System.out.println("-Introduce el segundo número");
        } else {
            System.out.println("Error, número negativo");
            System.exit(0);
        }

        int n2 = sc.nextInt();

        if (n2>=0){
            System.out.println("-Introduce la operación");
        } else {
            System.out.println("Error, número negativo");
            System.exit(0);
        }

        String op = sc.next();

        /* Luego he considerado que habría que validar que operación introducida, pero luego me he dado cuenta de que sería
        repetitivo y un paso intermedio que no vale para nada */

        //Defino las operaciones posibles
        int suma = n1 + n2;
        int resta = n1 - n2;
        int multi = n1 * n2;
        int division = n1 / n2;

        //Y finalmente dejo un switch para validar las operaciones y dar el resultado directamnete

        switch (op) {
            case "+" -> System.out.println("El resultado de la suma sería " + suma + ".");
            case "-" -> System.out.println("El resultado de la resta sería " + resta + ".");
            case "*" -> System.out.println("El resultado de la multipilación sería " + multi + ".");
            case "/" -> System.out.println("El resultado de la división sería " + division + ".");
            default -> System.out.println("Error, operación no válida");
        }


    }
}
