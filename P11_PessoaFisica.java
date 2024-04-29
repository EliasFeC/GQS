import java.util.Scanner;

public class PessoaFisica extends Pessoa {
    private String cpf;


    public PessoaFisica(String nome) {
        super(nome);
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void lerCpf() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o CPF: ");
        cpf = scanner.nextLine();
    }


    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("CPF: " + cpf);
    }
}
