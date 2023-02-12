package q5;

import java.util.Scanner;

public class q5 {
    //5. Calcular e exibir a mêdia aritmética de três nômeros reais.
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        Double num1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        Double num2 = input.nextDouble();
        System.out.print("Digite o terceiro número: ");
        Double num3 = input.nextDouble();
        Double media = (num1 + num2 + num3) / 3.0 ;
        System.out.println("A média aritmética é: " + media);
        input.close();

    }
}
