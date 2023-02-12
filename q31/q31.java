package q31;

import java.util.Scanner;

class Pessoa{
    String cpf;
    String nome;
    int idade;
    String sexo;
    double peso;
    double altura;
    double imc;
    public Pessoa(String cpf, String nome, int idade, String sexo, double peso, double altura) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.imc = peso / (altura * altura);
    }
}
public class q31 {
    /*31. Construa um programa que registre objetos da classe Pessoa, com os seguintes atributos: cpf, nome., idade, sexo, peso, altura, imc. Pennita que o
usuário defina a quantidade de pessoas em tempo de exe<:ução. Ao cadastrar uma pessoa, calcule o IMC (Índice de Massa Corporal). Ao final,
exiba a lista de pessoas (com seus respecti,·os atributos). */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a quantidade de pessoas: ");
        int qtd = in.nextInt();
        Pessoa[] pessoas = new Pessoa[qtd];
        String cpf;
        String nome;
        int idade;
        String sexo;
        double peso;
        double altura;
        Pessoa p1;
        for(int i = 0; i < qtd; i++){
            System.out.print("Digite o cpf da pessoa"+ i+": ");
            cpf = in.next();
            System.out.print("Digite o nome da pessoa"+ i+": ");
            nome = in.next();
            System.out.print("Digite a idade da pessoa"+ i+": ");
            idade = in.nextInt();
            System.out.print("Digite o sexo da pessoa"+ i+": ");
            sexo = in.next();
            System.out.print("Digite o peso da pessoa"+ i+": ");
            peso = in.nextDouble();
            System.out.print("Digite a altura da pessoa"+ i+": ");
            altura = in.nextDouble();
            p1 = new Pessoa(cpf, nome, idade, sexo, peso, altura);
            pessoas[i] = p1;
        }
        System.out.println("Pessoas cadastradas:");
        for(int i = 0; i < qtd; i++){
            System.out.println("Pessoa "+i+":");
            System.out.println("CPF: "+pessoas[i].cpf);
            System.out.println("Nome: "+pessoas[i].nome);
            System.out.println("Idade: "+pessoas[i].idade);
            System.out.println("Sexo: "+pessoas[i].sexo);
            System.out.println("Peso: "+pessoas[i].peso);
            System.out.println("Altura: "+pessoas[i].altura);
            System.out.println("IMC: "+pessoas[i].imc);
            System.out.println("--------------------");
        }
        in.close();

    }
}
