import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;
        while (true) {
            int numero = lerNumero("Informe um número (ou 0 para sair):");
            if (numero == 0) {
                break;
            }
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        JOptionPane.showMessageDialog(null, "O maior número informado é: " + maiorNumero +
                                            "\nO menor número informado é: " + menorNumero);
    }

    private static int lerNumero(String mensagem) {
        String entrada = JOptionPane.showInputDialog(mensagem);
        return Integer.parseInt(entrada);
    }
}
