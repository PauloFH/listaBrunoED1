package q19;

import java.util.Scanner;

public class q19 {
    /*19. Construa um programa para exibir a tabuada de qualquer número '"n" (1 a 9), sendo "n" um número fornecido pelo usuârio. U tilize estrutura de
repetição. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Digite um número entre 1 e 9: ");
        n = in.nextInt();
        while(n < 1 || n > 9) {
            System.out.print("Digite um número entre 1 e 9: ");
            n = in.nextInt();
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        in.close();
    }
}
