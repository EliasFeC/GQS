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

        double menor = numeros[0];
        double maior = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        
        System.out.println("\n\nMenor número: " + menor);
        System.out.println("Maior número: " + maior);

        scanner.close();
    }
}
