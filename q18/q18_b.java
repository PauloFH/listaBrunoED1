package q18;

import java.util.Scanner;

public class q18_b {
    /*18. Verificar se a senha. informada durante a execução, é correta. Quando a senha estiver corre.ta. exiba «senha correta" e o programa é encerrado.
Quando a senha estiver errada, exiba '"senha incorreta", e pennita a entrada novamente da senha, repetindo esse processo até que a senha entrada
seja corre.ta.
a) Resolva esse problema utilizando a estrutura while.
b) Resolva esse problema utilizando a estrutura do-while. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senha = "123456";
        String senhaDigitada;
        do{
            System.out.println("Digite a senha: ");
            senhaDigitada = input.nextLine();
        }while(!senhaDigitada.equals(senha));
        System.out.println("Senha correta!");
        input.close();
    }
}
