import java.util.Scanner;

public class AnaliseNotasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeAlunosAprovados = 0;
        int quantidadeAlunosReprovados = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0;
        int totalAlunos = 0;
        
        while (true) {
            System.out.print("Digite a nota final do aluno (ou um valor negativo para sair): ");
            double nota = scanner.nextDouble();
            if (nota < 0) {
                break;
            }
            
            System.out.print("Digite o total de faltas do aluno: ");
            int faltas = scanner.nextInt();
            
            if (nota >= 90) {
                quantidadeAlunosAprovados++;
            }
            
            if (nota < 70 || faltas >= 20) {
                quantidadeAlunosReprovados++;
            }
            
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            
            if (nota < menorNota) {
                menorNota = nota;
            }
            
            somaNotas += nota;
            totalAlunos++;
        }
        
        double mediaNotas = somaNotas / totalAlunos;
        
        System.out.println("a. Quantidade de alunos com nota final maior ou igual a 90: " + quantidadeAlunosAprovados);
        System.out.println("b. Quantidade de alunos reprovados por nota ou falta: " + quantidadeAlunosReprovados);
        System.out.println("c. Maior nota: " + maiorNota);
        System.out.println("   Menor nota: " + menorNota);
        System.out.println("d. Média de notas da turma: " + mediaNotas);
        
        scanner.close();
    }
}
