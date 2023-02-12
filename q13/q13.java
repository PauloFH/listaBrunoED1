package q13;

import java.util.Scanner;

public class q13 {
    /*Construa um programa que calcule para o aluno rua média parcial e informe sua situação parcial (Aprovado. Recuperação ou Reprovado).
Caso ele esteja em Recuperação, calcule quanto ele precisa tirar na 4􀆢 prova para ser aprovado (média final maior ou igual que 5,0).
Obser,;ação: utilize os pesos e regras da UFERSA... */
  
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("digite a primeira nota: ");
    double nota1 = in.nextDouble();
    System.out.print("digite a segunda nota: ");
    double nota2 = in.nextDouble();
    System.out.print("digite a terceira nota: ");
    double nota3 = in.nextDouble();
    double media = (nota1 + nota2 + nota3) / 3;
    System.out.println("A média parcial do aluno é: " + media);
    if(media >= 7) {
        System.out.println("Aprovado!");

    }else{

        if(media < 3.5); {
        System.out.println("O aluno está Reprovado!");
        }if(media >= 3.5 && media < 7) {
        System.out.println("O aluno está em Recuperação!");
        double nota4 =  ((5*10)- (media*6))/4; 
        System.out.println("Para passar, o aluno precisa tirar: " + (nota4) + " na 4ª prova.");
        }

    }
    in.close();
    }
}

