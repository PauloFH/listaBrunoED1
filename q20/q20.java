package q20;

import java.util.Scanner;

public class q20 {
    /*20. Construa um programa que calcule o rendimento mensal de um investimento em poupança. \•'ariá,·eis: in,·estimento inicial, investimento
mensal. quantidade de meses. saldo acumulado, taxa de juros mensal. rendimento mensal */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do investimento inicial: ");
        double Capital = in.nextDouble();
        System.out.println("Digite o valor do investimento mensal: ");
        double aporte = in.nextDouble();
        System.out.println("Digite a quantidade de meses: ");
        int meses = in.nextInt();
        System.out.println("Digite a taxa de juros mensal: ");
        double taxaJuros = in.nextDouble();
        double rendimentoMensal = 0;
        Double Montante = (Capital*((1 + Math.pow((taxaJuros /100),meses)))) + (aporte*((Math.pow(((1 + (taxaJuros / 100))),meses)-1)/(taxaJuros / 100)));
        for(int i = 0; i < meses; i++){
            rendimentoMensal = Montante -(Capital + aporte*meses);
            Capital = rendimentoMensal;
        }
        rendimentoMensal = Montante - Capital+aporte;
        System.out.println("O rendimento mensal é: " + rendimentoMensal);
        System.out.println("O saldo acumulado é: " + Montante);
        in.close();
    }
}
