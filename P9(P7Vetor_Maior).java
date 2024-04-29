import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = lerNumeros(scanner, 10);
        imprimirNumeros(numeros);
        
        double menor = encontrarMenor(numeros);
        double maior = encontrarMaior(numeros);

        imprimirMenorMaior(menor, maior);

        scanner.close();
    }

 public static double[] lerNumeros(Scanner scanner, int quantidade) {
        double[] numeros = new double[quantidade];
        System.out.println("Digite " + quantidade + " números reais:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        return numeros;
    }

 public static void imprimirNumeros(double[] numeros) {
        System.out.println("\nNúmeros digitados:");
        for (double num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

 public static double encontrarMenor(double[] numeros) {
        double menor = numeros[0];
        for (double num : numeros) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public static double encontrarMaior(double[] numeros) {
        double maior = numeros[0];
        for (double num : numeros) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public static void imprimirMenorMaior(double menor, double maior) {
        System.out.println("\nMenor número: " + menor);
        System.out.println("Maior número: " + maior);
    }
}
