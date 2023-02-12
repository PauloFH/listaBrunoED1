package q32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class q32 {
    /*31. Construa um programa que registre objetos da classe Pessoa, com os seguintes atributos: cpf, nome., idade, sexo, peso, altura, imc. Pennita que o
usuário defina a quantidade de pessoas em tempo de exe<:ução. Ao cadastrar uma pessoa, calcule o IMC (Índice de Massa Corporal). Ao final,
exiba a lista de pessoas (com seus respecti,·os atributos). */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        pessoasData pd = new pessoasData("pessoas.dat");
        List<Pessoa> PessoasList =  pd.carregar();
        
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
         PessoasList = Arrays.asList(pessoas);
        try{
            
            pd.gravar(PessoasList);
        }
        catch(Exception e){
            System.out.println("Erro: "+e);
        }
        in.close();

        for( Pessoa pessoa : PessoasList){
            System.out.println("Nome: "+pessoa.nome +" \n CPF: "+pessoa.cpf+" \n Idade: "+pessoa.idade+" \n Sexo: "+pessoa.sexo+" \n Peso: "+pessoa.peso+" \n Altura: "+pessoa.altura+" \n IMC: "+pessoa.imc+" \n");
            
        }           
    }
}
class pessoasData{
    private String filename = "pessoas.dat";

    public pessoasData(String nome) {
        this.filename = filename;
    }
    void gravar(List<Pessoa> pessoas){
        try{
            ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream(filename));
            for(Pessoa p: pessoas){
                arquivo.writeObject(p);
            }
            arquivo.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public List<Pessoa> carregar(){
        List<Pessoa> pessoas = new ArrayList<>();
        try{
            Pessoa p = null;
            ObjectInputStream arquivo = new ObjectInputStream(new FileInputStream(filename));
        do {
            p = (Pessoa) arquivo.readObject();
            if(p != null){
                pessoas.add(p);
            }
            
        } while (p != null);
        arquivo.close();
      }  catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        return pessoas;
    }
}
