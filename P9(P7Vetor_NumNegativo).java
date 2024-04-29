import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = lerNumeros(scanner, 10);

        imprimirNumeros(numeros);

        imprimirPosicoesNegativos(numeros);

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
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    public static void imprimirPosicoesNegativos(double[] numeros) {
        System.out.println("\n\nPosições dos números negativos:");
        for (int i = 0; i < numeros.length; i++) { 
            if (numeros[i] < 0) {
                System.out.println("Posição " + i);
            }
        }
    }
}
