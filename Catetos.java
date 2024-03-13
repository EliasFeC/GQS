import java.util.Scanner;

public class CalculadoraHipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();
    
        System.out.print("Informe o valor do segundo cateto: ");
        double cateto2 = scanner.nextDouble();
        scanner.close();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("O valor da hipotenusa é: " + hipotenusa);
    }
}
