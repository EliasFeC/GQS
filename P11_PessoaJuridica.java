import java.util.Scanner;

public class PessoaJuridica extends Pessoa {
    private String cnpj;


    public PessoaJuridica(String nome) {
        super(nome);
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public void lerCnpj() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o CNPJ: ");
        cnpj = scanner.nextLine();
    }


    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("CNPJ: " + cnpj);
    }
}
