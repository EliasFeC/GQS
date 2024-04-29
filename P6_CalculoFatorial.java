import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int numeroFatorial = lerNumero("Informe um número para calcular o fatorial:");
        if (numeroFatorial >= 0) {
            long fatorial = calcularFatorial(numeroFatorial);
            JOptionPane.showMessageDialog(null, "O fatorial de " + numeroFatorial + " é: " + fatorial);
        } else {
            JOptionPane.showMessageDialog(null, "Número inválido.");
        }
    }
    private static int lerNumero(String mensagem) {
        String entrada = JOptionPane.showInputDialog(mensagem);
        return Integer.parseInt(entrada);
    }
    private static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
