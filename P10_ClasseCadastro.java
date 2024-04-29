import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Cadastro {
    private List<Veiculo> listaVeiculos;
    private List<PessoaFisica> listaPessoasFisicas;
    private List<PessoaJuridica> listaPessoasJuridicas;

    public Cadastro() {
        this.listaVeiculos = new ArrayList<>();
        this.listaPessoasFisicas = new ArrayList<>();
        this.listaPessoasJuridicas = new ArrayList<>();
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        listaVeiculos.add(veiculo);
    }

    public void imprimirVeiculos() {
        JOptionPane.showMessageDialog(null, listaVeiculos.toString());
    }

    public Veiculo pesquisarVeiculo(String chave) {
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getNumeroChassi().equals(chave) || veiculo.getPlaca().equals(chave)) {
                return veiculo;
            }
        }
        return null;
    }

    public void atualizarVeiculo(String chave, Veiculo veiculoAtualizado) {
        for (int i = 0; i < listaVeiculos.size(); i++) {
            Veiculo veiculo = listaVeiculos.get(i);
            if (veiculo.getNumeroChassi().equals(chave) || veiculo.getPlaca().equals(chave)) {
                listaVeiculos.set(i, veiculoAtualizado);
                break;
            }
        }
    }

    public void excluirVeiculo(String chave) {
        listaVeiculos.removeIf(veiculo -> veiculo.getNumeroChassi().equals(chave) || veiculo.getPlaca().equals(chave));
    }

    public void cadastrarPessoaFisica(PessoaFisica pessoaFisica) {
        listaPessoasFisicas.add(pessoaFisica);
    }

    public void imprimirPessoasFisicas() {
        JOptionPane.showMessageDialog(null, listaPessoasFisicas.toString());
    }

    public PessoaFisica pesquisarPessoaFisica(String cpf) {
        for (PessoaFisica pessoaFisica : listaPessoasFisicas) {
            if (pessoaFisica.getCpf().equals(cpf)) {
                return pessoaFisica;
            }
        }
        return null;
    }

    public void atualizarPessoaFisica(String cpf, PessoaFisica pessoaFisicaAtualizada) {
        for (int i = 0; i < listaPessoasFisicas.size(); i++) {
            PessoaFisica pessoaFisica = listaPessoasFisicas.get(i);
            if (pessoaFisica.getCpf().equals(cpf)) {
                listaPessoasFisicas.set(i, pessoaFisicaAtualizada);
                break;
            }
        }
    }

    public void excluirPessoaFisica(String cpf) {
        listaPessoasFisicas.removeIf(pessoaFisica -> pessoaFisica.getCpf().equals(cpf));
    }

    public void
