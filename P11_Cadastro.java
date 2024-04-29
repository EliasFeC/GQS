import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
    private List<Pessoa> listaPessoas;


    public Cadastro() {
        this.listaPessoas = new ArrayList<>();
    }


    public void cadastrarPessoa(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }


    public void imprimirCadastro() {
        for (Pessoa pessoa : listaPessoas) {
            pessoa.imprimirDetalhes();
        }
    }

  
    public void imprimirPessoasFisicas() {
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa instanceof PessoaFisica) {
                pessoa.imprimirDetalhes();
            }
        }
    }


    public void imprimirPessoasJuridicas() {
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa instanceof PessoaJuridica) {
                pessoa.imprimirDetalhes();
            }
        }
    }


    public Pessoa pesquisarPessoa(String chave) {
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa instanceof PessoaFisica && ((PessoaFisica) pessoa).getCpf().equals(chave)) {
                return pessoa;
            }
            if (pessoa instanceof PessoaJuridica && ((PessoaJuridica) pessoa).getCnpj().equals(chave)) {
                return pessoa;
            }
        }
        return null;
    }


    public void atualizarPessoa(String chave, Pessoa pessoaAtualizada) {
        for (int i = 0; i < listaPessoas.size(); i++) {
            Pessoa pessoa = listaPessoas.get(i);
            if ((pessoa instanceof PessoaFisica && ((PessoaFisica) pessoa).getCpf().equals(chave)) ||
                    (pessoa instanceof PessoaJuridica && ((PessoaJuridica) pessoa).getCnpj().equals(chave))) {
                listaPessoas.set(i, pessoaAtualizada);
                break;
            }
        }
    }


    public void excluirPessoa(String chave) {
        listaPessoas.removeIf(pessoa -> (pessoa instanceof PessoaFisica && ((PessoaFisica) pessoa).getCpf().equals(chave)) ||
                (pessoa instanceof PessoaJuridica && ((PessoaJuridica) pessoa).getCnpj().equals(chave)));
    }
}
