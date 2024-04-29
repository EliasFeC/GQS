import javax.swing.JOptionPane;

public class Principal {
    public static void main(String args[]) {
        validarNota();
        validarSalario();
        validarSexo();
        validarIdade();
        JOptionPane.showMessageDialog(null, "Todos os dados foram informados corretamente.");
    }

    // Método para validar a nota (entre 0 e 10)
    private static void validarNota() {
        String entrada;
        do {
            entrada = JOptionPane.showInputDialog("Informe a nota (entre 0 e 10): ");
            double nota;
            try {
                nota = Double.parseDouble(entrada);
                if (nota < 0 || nota > 10) {
                    throw new NumberFormatException();
                }
                JOptionPane.showMessageDialog(null, "Nota informada corretamente.");
                break; // Nota válida, sai do loop
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Nota inválida. Informe um valor entre 0 e 10.");
            }
        } while (true);
    }

    // Método para validar o salário (maior que zero)
    private static void validarSalario() {
        String entrada;
        do {
            entrada = JOptionPane.showInputDialog("Informe o salário (maior que zero): ");
            double salario;
            try {
                salario = Double.parseDouble(entrada);
                if (salario <= 0) {
                    throw new NumberFormatException();
                }
                JOptionPane.showMessageDialog(null, "Salário informado corretamente.");
                break; // Salário válido, sai do loop
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Salário inválido. Informe um valor maior que zero.");
            }
        } while (true);
    }

    // Método para validar o sexo (m ou f)
    private static void validarSexo() {
        String entrada;
        do {
            entrada = JOptionPane.showInputDialog("Informe o sexo (m ou f): ");
            if (entrada.equalsIgnoreCase("m") || entrada.equalsIgnoreCase("f")) {
                JOptionPane.showMessageDialog(null, "Sexo informado corretamente.");
                break; // Sexo válido, sai do loop
            } else {
                JOptionPane.showMessageDialog(null, "Sexo inválido. Informe 'm' para masculino ou 'f' para feminino.");
            }
        } while (true);
    }

    // Método para validar a idade (entre 0 e 150)
    private static void validarIdade() {
        String entrada;
        do {
            entrada = JOptionPane.showInputDialog("Informe a idade (entre 0 e 150): ");
            int idade;
            try {
                idade = Integer.parseInt(entrada);
                if (idade < 0 || idade > 150) {
                    throw new NumberFormatException();
                }
                JOptionPane.showMessageDialog(null, "Idade informada corretamente.");
                break; // Idade válida, sai do loop
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Idade inválida. Informe um valor entre 0 e 150.");
            }
        } while (true);
    }
}
