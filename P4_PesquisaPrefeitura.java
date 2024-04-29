import java.util.Scanner;

public class PesquisaPrefeitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalSalarios = 0;
        int totalFilhos = 0;
        int totalPessoas = 0;
        
        while (true) {
            System.out.print("Digite o salário (ou um valor negativo para sair): ");
            int salario = scanner.nextInt();
            if (salario < 0) {
                break;
            }
            
            System.out.print("Digite o número de filhos: ");
            int filhos = scanner.nextInt();
            
            totalSalarios += salario;
            totalFilhos += filhos;
            totalPessoas++;
        }
        
        double mediaSalarios = (double) totalSalarios / totalPessoas;
        double mediaFilhos = (double) totalFilhos / totalPessoas;
        
        System.out.println("a. Média salarial da população: " + mediaSalarios);
        System.out.println("b. Média do número de filhos: " + mediaFilhos);
        
        scanner.close();
    }
}
