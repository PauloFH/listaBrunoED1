package q2;

import java.util.Scanner;
public class q2 {
    //2.Atribua com valores vindos do teclado ,-ariáveis adequadas para: rua idade., rua altura. primeira letra do seu nome, seu nome completo.
    // Depois exiba os dados na tela.
    
    static Scanner sc = new Scanner(System.in);
     public static void main(String[] args) {
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite a primeira letra do seu nome: ");
        char primeiraLetra = sc.next().charAt(0);
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.next();
        
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Primeira letra do nome: " + primeiraLetra);
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println();
     }
}
