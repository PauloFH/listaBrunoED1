package q25;

import java.util.Scanner;

public class q25 {
    /*Construa um programa pra ler e exibir um vetor de inteiros. Em tempo de execução, o usuário pode definir o tamanho do vetor. */

    public static void main(String[] args) {
        int tam;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        tam = in.nextInt();
        int[] vetor = new int[tam];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            vetor[i] = in.nextInt();
        }
        System.out.println("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        in.close();
    }
}
