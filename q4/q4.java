package q4;

import java.util.Scanner;
public class q4 {
    //4.Calcular e exibir a mêdia aritmética de três numeros inteiros.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = input.nextInt();
        input.close();
        double media = (num1 + num2 + num3) / 3;
        System.out.println("A média aritmética é: " + media);
    }
}
