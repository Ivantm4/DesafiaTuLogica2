import java.util.Scanner;
public class EjercicioNumero4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pide al usuario introducir tres números
            System.out.println("Introduce el primer número:");
            int num1 = scanner.nextInt();

            System.out.println("Introduce el segundo número:");
            int num2 = scanner.nextInt();

            System.out.println("Introduce el tercer número:");
            int num3 = scanner.nextInt();

            // Pide al usuario el orden de ordenamiento (ascendente o descendente)
            System.out.println("Selecciona el orden de ordenamiento ('asc' o 'desc' o 1 para ascendente, 2 para descendente):");
            String orden = scanner.next();

            // Proceso de ordenamiento
            if (orden.equals("asc") || orden.equals("1")) {
                // Orden ascendente
                if (num1 > num2) {
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                }

                if (num2 > num3) {
                    int temp = num2;
                    num2 = num3;
                    num3 = temp;
                }

                if (num1 > num2) {
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
            } else if (orden.equals("desc") || orden.equals("2")) {
                // Orden descendente
                if (num3 > num2) {
                    int temp = num3;
                    num3 = num2;
                    num2 = temp;
                }

                if (num2 > num1) {
                    int temp = num2;
                    num2 = num1;
                    num1 = temp;
                }

                if (num3 > num2) {
                    int temp = num3;
                    num3 = num2;
                    num2 = temp;
                }
            } else {
                System.out.println("Orden no válido. Debe seleccionar 'asc', 'desc', 1 o 2.");
                return;
            }

            // Muestra los tres números ordenados
            System.out.println("Números ordenados:");

            System.out.println(num1 + ", " + num2 + ", " + num3);

            scanner.close();
        }
}

