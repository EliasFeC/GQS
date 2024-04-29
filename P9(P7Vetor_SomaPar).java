import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = lerNumeros(scanner, 10);
        imprimirNumeros(numeros);
        int somaPares = calcularSomaPares(numeros);
        imprimirSomaPares(somaPares);
        scanner.close();
      
    }
    public static int[] lerNumeros(Scanner scanner, int quantidade) {
        int[] numeros = new int[quantidade]; 
        System.out.println("Digite " + quantidade + " números inteiros:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Número " + (i + 1) + ": "); 
            numeros[i] = scanner.nextInt();
        }
        return numeros; 
    }
    public static void imprimirNumeros(int[] numeros) {
        System.out.println("\nNúmeros digitados:");
        for (int numero : numeros) { 
            System.out.print(numero + " "); 
        }
        System.out.println(); 
    }
    public static int calcularSomaPares(int[] numeros) {
        int somaPares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                somaPares += numero; 
            }
        }
        return somaPares; 
    }
    public static void imprimirSomaPares(int somaPares) {
        System.out.println("\n\nA soma dos números pares é: " + somaPares);
    }
}
