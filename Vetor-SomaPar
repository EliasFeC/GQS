import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        int somaPares = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }

        System.out.println("\n\nA soma dos números pares é: " + somaPares);

        scanner.close();
    }
}
