import java.util.Scanner;

public class CalculadoraAreaLosango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();
        System.out.print("Informe a diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();
        scanner.close();

        double area = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("A área do losango é: " + area);
    }
}
