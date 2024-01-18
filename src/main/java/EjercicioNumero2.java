import java.util.Scanner;

public class EjercicioNumero2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir un número hasta que sea positivo

        int numero;

        System.out.print("Introduce un número positivo: ");

        numero = scanner.nextInt();

        while (numero <= 0) {

            System.out.print("Introduce un número positivo: ");

            numero = scanner.nextInt();
        }

        // Mostrar los primeros 20 números sucesivos

        System.out.println("Los primeros 20 números sucesivos a " + numero + " son:");

        for (int i = 1; i <= 20; i++) {

            System.out.print(numero + i + " ");
        }

        scanner.close();
    }
}
