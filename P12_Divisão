import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = scanner.nextInt();

        try {
            int resultado = dividendo / divisor;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida!");
        } finally {
            scanner.close();
        }
    }
}
