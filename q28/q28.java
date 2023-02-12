package q28;

import java.util.Scanner;

public class q28 {
    /*28. Construa um programa que identifique o maior e o menor número de um vetor de inteiros. */
    
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
        int maior = vetor[0];
        int menor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }  
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        in.close();
    }

}
