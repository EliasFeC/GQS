import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int somaIdades = 0;
        int contador = 0;
        while (true) {
            int idade = lerNumero("Informe uma idade (ou um número negativo para sair):");
            if (idade < 0) {
                break;
            }
            somaIdades += idade;
            contador++;
        }
        double mediaIdades = contador > 0 ? (double) somaIdades / contador : 0;
        JOptionPane.showMessageDialog(null, "A média das idades informadas é: " + mediaIdades);
    }

    private static int lerNumero(String mensagem) {
        String entrada = JOptionPane.showInputDialog(mensagem);
        return Integer.parseInt(entrada);
    }
}
