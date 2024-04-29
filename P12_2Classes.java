import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Digite o divisor: ");
        int divisor = scanner.nextInt();

        Divisao div = new Divisao();

        try {
            int resultado = div.dividir(dividendo, divisor);
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) { 
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

class Divisao {
    public int dividir(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        } else if (dividendo == 0) {
            throw new ArithmeticException("O dividendo não pode ser zero");
        } else if (divisor < 10) {
            throw new ArithmeticException("O divisor deve ser maior ou igual a 10");
        }

        return dividendo / divisor;
    }
}
