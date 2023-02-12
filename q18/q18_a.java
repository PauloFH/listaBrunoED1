package q18;

import java.util.Scanner;

public class q18_a {
    /*18. Verificar se a senha. informada durante a execução, é correta. Quando a senha estiver corre.ta. exiba «senha correta" e o programa é encerrado.
Quando a senha estiver errada, exiba '"senha incorreta", e pennita a entrada novamente da senha, repetindo esse processo até que a senha entrada
seja corre.ta.
a) Resolva esse problema utilizando a estrutura while.
b) Resolva esse problema utilizando a estrutura do-while. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String senhac = "senha";
        System.out.print("Digite a senha: ");
        String senha = in.nextLine();
        while(!senha.equals(senhac)){
            System.out.print("Senha incorreta. Digite novamente: ");
            senha = in.nextLine();
        }System.out.println("Senha correta.");
        in.close();
    }

}
