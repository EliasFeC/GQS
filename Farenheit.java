import java.util.Scanner;

public class ConversorCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();
        scanner.close();

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
    }
}
