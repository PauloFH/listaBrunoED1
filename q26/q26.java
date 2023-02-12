package q26;

import java.util.Scanner;

public class q26 {
    /*26. Construa um programa pra ler e exibir uma matriz de inteiros. Em tempo de execução, o usu.ário pode de.fmir o tamanho da matriz. */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linhas, colunas;
        System.out.print("Digite o número de linhas da matriz: ");
        linhas = in.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        colunas = in.nextInt();
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
            }
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    
        in.close();
    }
}
