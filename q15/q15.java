package q15;

import java.util.Scanner;

public class q15 {
    /*Construa um programa que leia um número inteiro digitado pelo uruário. Caso o número pertença ao intervalo de 1 a 5, exiba o número por
e:-..1enso. Caso o número não pertença a este intervalo. exiba a mensagem ",-ator im-alido". */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
            switch(num){
                case 1:
                    System.out.println("Um");
                    break;
                case 2:
                    System.out.println("Dois");
                    break;
                case 3:
                    System.out.println("Três");
                    break;
                case 4:
                    System.out.println("Quatro");
                    break;
                case 5:
                    System.out.println("Cinco");
                    break;
                default:
                    System.out.println("Número inválido");
                    break;
            }
        input.close();
    }
}
