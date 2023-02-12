package q7;

import java.util.Scanner;

public class q7 {
    //Calcular uma divisão entre dois números reais Produza um alerta em e.aso de divisão por zero.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        Double num1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        Double num2 = input.nextDouble();
        input.close();
        if (num1 == 0 || num2 == 0) {
            System.out.println("Divisão por zero!");
        } else {
            System.out.println("Divisão: "+ num1 / num2);
        }

    }

}
