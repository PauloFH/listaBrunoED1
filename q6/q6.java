package q6;

import java.util.Scanner;

public class q6 {
    /* Construa um programa que gerencia a conta de uma pizzaria.
Preço do refrigerante: RS 1,50. Preço da fatia de pi2za: RS 3,00. Taxa do garçom: 10%.
Receba do usuário: a quantidade de re.frigerante.s. a quantidade de fatias e a quantidade de pessoas na mesa.
Calcule e exiba: o total sem a taxa, o total com a taxa, o rateio por pessoa com a taxa.
*/
    public static void main(String[] args) {
        double refrigerante = 1.50;
        double fatias_pizza = 3.00;
        double taxa_garco = 10.00;
        Scanner input = new Scanner(System.in);
        System.out.print("Quantidade de refrigerante: ");
        int re_frigerante = input.nextInt();
        System.out.print("Quantidade de fatias: ");
        int fatias = input.nextInt();
        System.out.print("Quantidade de pessoas na mesa: ");
        int pessoas = input.nextInt();
        input.close();
        double total_staxa = (re_frigerante * refrigerante) + (fatias * fatias_pizza);
        double total_ctaxa = total_staxa + (total_staxa * (taxa_garco*pessoas) / 100);
        System.out.println("Total sem a taxa: " + total_staxa);
        System.out.println("Total com a taxa: " + total_ctaxa);
    }
}
