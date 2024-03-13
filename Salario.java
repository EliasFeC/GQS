import java.util.Scanner;

public class CalculadoraSalariosMinimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        System.out.print("Informe o valor do salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();
        scanner.close();

        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
        
        System.out.println("O funcionário recebe aproximadamente " + quantidadeSalariosMinimos + " salários mínimos.");
    }
}
