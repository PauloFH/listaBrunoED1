package q27;

import java.util.Scanner;

public class q27 {
    /*27. Construa e use uma função que produz um novo vetor de inteiros oom a ordem inversa do ,·etor original passado por parâmetro. */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tam;
        System.out.print("Digite o tamanho do vetor: ");
        tam = in.nextInt();
        int[] vetor = new int[tam];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            vetor[i] = in.nextInt();
        }
        int[] vetorIn = new int[tam];
        for (int i = 0; i < vetorIn.length; i++) {
            vetorIn[i] = vetor[vetor.length - 1 - i];
        }
        System.out.println("Vetor Invertido: ");
        for (int i = 0; i < vetorIn.length; i++) {
            System.out.print(vetorIn[i] + " ");
        }
        in.close();
    }

}
