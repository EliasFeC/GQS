import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println("\n\nPosições dos números negativos:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 0) {
                System.out.println("Posição " + i);
            }
        }

        scanner.close();
    }
}
