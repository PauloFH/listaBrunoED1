package q22;

import java.util.Scanner;

public class q22 {
    /*22. Construa um programa que calcule o somatôrio dos números inteiros de um intervalo, definido por um nUmero inicial e um número final.
E.xemplo: caso as entradas fossem 4 e 9, o resultado seria: 39 */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número inicial: ");
        int n1 = in.nextInt();
        System.out.print("Digite o número final: ");
        int n2 = in.nextInt();
        int soma = 0;
        for(int i = n1; i <= n2; i++){
            soma += i;
        }
        System.out.println("A soma dos números do intervalo é: " + soma);
        
        in.close();
    }
}
