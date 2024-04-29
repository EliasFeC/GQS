import java.util.Scanner;

public class Pessoa {
    private String nome;


    public Pessoa(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void lerNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome: ");
        nome = scanner.nextLine();
    }


    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
    }
}
