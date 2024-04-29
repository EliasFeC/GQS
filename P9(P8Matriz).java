import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = lerMatriz(scanner, 5, 5);
        imprimirElementosParImpar(matriz, 5, 5);
        imprimirMatrizTransposta(matriz, 5, 5);
        trocarDiagonais(matriz, 5);
        imprimirMatriz(matriz, 5, 5);

        scanner.close(); 
    }

    public static int[][] lerMatriz(Scanner scanner, int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        System.out.println("Digite os elementos da matriz " + linhas + "x" + colunas + ":");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt(); 
            }
        }
        return matriz;
    }

    public static void imprimirElementosParImpar(int[][] matriz, int linhas, int colunas) {
        System.out.println("\nElementos nas posições onde a linha é par e a coluna é ímpar:");
        for (int i = 0; i < linhas; i += 2) { 
            for (int j = 1; j < colunas; j += 2) { 
                System.out.print(matriz[i][j] + " "); 
            }
        }
        System.out.println(); 
    }

    public static void imprimirMatrizTransposta(int[][] matriz, int linhas, int colunas) {
        System.out.println("\nMatriz transposta:");
        for (int j = 0; j < colunas; j++) { 
            for (int i = 0; i < linhas; i++) { 
                System.out.print(matriz[i][j] + " "); 
            }
            System.out.println();
        }
    }

    public static void trocarDiagonais(int[][] matriz, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][tamanho - 1 - i];
            matriz[i][tamanho - 1 - i] = temp;
        }
    }

    public static void imprimirMatriz(int[][] matriz, int linhas, int colunas) {
        System.out.println("\nMatriz após a troca das diagonais:");
        for (int i = 0; i < linhas; i++) { 
            for (int j = 0; j < colunas; j++) { 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

