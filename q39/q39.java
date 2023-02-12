package q39;
import java.util.ArrayList;
import java.util.Scanner;

public class q39 {
    /*39. Utiliza!ldo o recurso Generic de Java, coJ1strua um programa que tenha funcionalidades de um CRUD (create, read, update e dele.te) de
Pessoa. */
public static void main(String[] args) {
    CRUD<Pessoa> crudPessoas = new CRUD<>();
    Scanner scanner = new Scanner(System.in);

    int opcao = 0;
    while (opcao != 5) {
        System.out.println("1 - Adicionar Pessoa");
        System.out.println("2 - Exibir todas as Pessoas");
        System.out.println("3 - Atualizar Pessoa");
        System.out.println("4 - Remover Pessoa");
        System.out.println("5 - Sair");
        System.out.print("Opção: ");
        opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            Pessoa pessoa = new Pessoa(nome, idade);
            crudPessoas.adicionar(pessoa);
        } else if (opcao == 2) {
            crudPessoas.exibirTodos();
        } else if (opcao == 3) {
            System.out.print("Índice da Pessoa a ser atualizada: ");
            int index = scanner.nextInt();
            System.out.print("Novo Nome: ");
            String nome = scanner.next();
            System.out.print("Nova Idade: ");
            int idade = scanner.nextInt();
            Pessoa pessoa = new Pessoa(nome, idade);
            crudPessoas.atualizar(index, pessoa);
        } else if (opcao == 4) {
            System.out.print("Índice da Pessoa a ser removida: ");
            int index = scanner.nextInt();
            crudPessoas.remover(index);
        }
    }
    scanner.close();
}

}

 class CRUD<T> {
    private ArrayList<T> lista;

    public CRUD() {
        lista = new ArrayList<>();
    }

    public void adicionar(T obj) {
        lista.add(obj);
    }

    public void exibirTodos() {
        for (T obj : lista) {
            System.out.println(obj.toString());
        }
    }

    public void atualizar(int index, T obj) {
        lista.set(index, obj);
    }

    public void remover(int index) {
        lista.remove(index);
    }

}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
        
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade;
    }
}    