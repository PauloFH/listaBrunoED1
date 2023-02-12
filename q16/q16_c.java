package q16;

import java.util.Scanner;

public class q16_c {
        /*Construa um programa que leia do usuârio um número inicial e um número final. Em seguida. exiba na tela uma sequencia com os nômeros desse
intervalo infonnado pelo usuário. Exemplo: caso o usuário entre com os números 4 e 10, o resultado do programa seria: 4 5 6 7 8 9 10
c) Construa este programa utilizando a estrutura for */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inicial: ");
        int num1 = in.nextInt();
        System.out.print("Digite um número final: ");
        int num2 = in.nextInt();
        System.out.print("Sequência de números: "+ num1);
        for(int i = num1+1; i <= num2;i++){
            System.out.print(", "+i+ " ");
        }
        in.close();
    }
}
