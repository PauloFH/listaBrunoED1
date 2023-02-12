package q23;

import java.util.Scanner;

public class q23 {
    /* 23. Construa um programa que calcule o fatorial de um número. Use uma estrutura de repetição. Fatorial: 11! = 11 (n - l)!
Exemplo: 5!=5x4x 3x2x1 =120 ou 5!=Jx2x 3x 4 x5=120 */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = in.nextInt();
        int fatorial = n;
        for(int i = 1; i < n; i++){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);
        in.close();
    }
}
