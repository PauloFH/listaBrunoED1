package q8;

import java.util.Scanner;

public class q8 {
    //Calcular o IMC (índice de massa corporal) de uma pessoa Produza um alerta em caso de divisão por zero.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();
        System.out.print("Digite seu altura: ");
        double altura = input.nextDouble();
        input.close();
        if(altura == 0|| peso == 0) {
            System.out.println("Divisão por zero!");
            return;
        }
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
    }
}
