package q10;

import java.util.Scanner;

public class q10 {
    //Construa um programa que leia um número inteiro e identifique se ele é par ou ímpar.
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = cin.nextInt();
        if(num % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }
        cin.close();
}
}
