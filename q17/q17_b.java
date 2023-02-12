package q17;

import java.util.Scanner;

public class q17_b {
    /*17. Construa um programa que leia do usuârio um número inicial e um número fmal. Em seguida. exiba na tela uma sequencia apenas com os
números ímpares dentro deste intervalo infonnado pelo uruário. Exemplo: caso o usuário entre com os números 4 e 10. o resultado seria: 5 7 9
a) Construa este programa utilizando a estrutura while.
b) Construa este programa utilizando a estrutura do-while.
c) Construa este programa utilizando a estrutura for.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inicial: ");
        int num1 = in.nextInt();
        System.out.print("Digite um número final: ");
        int num2 = in.nextInt();
        System.out.print("Sequência de números ímpares: ");
        do{
            if(num1 % 2 != 0){
                System.out.print(num1 + " ");
            }
            num1++;
        }while(num1 < num2);
        in.close();
    }
}
