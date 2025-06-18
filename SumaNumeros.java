import java.util.Scanner;
public class SumaNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca el primer número
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        // Pedir al usuario que introduzca el segundo número
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        // Sumar los dos números
        int resta = numero1 - numero2;

        // Mostrar el resultado de la suma
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: "  + resta);

        // Cerrar el scanner
        scanner.close();
    }
}
