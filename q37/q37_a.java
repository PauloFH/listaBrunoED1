package q37;

import java.util.Scanner;

public class q37_a {
    /*Calcule o somatório dos números inteiros do intervalo entre dois números. No mesmo programa, implemente esse cálculo em duas funções:
a) Reolva o problema com estrutu.ra de .repetição.
*/
    public static void main(String[] args) {
        som s = new som();
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = in.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = in.nextInt();
        System.out.println(s.somatorio(n1, n2));
    in.close();
    }

}
class som{
    int somatorio(int n1, int n2){
        int soma = 0;
        for(int i = n1; i <= n2; i++){
            soma += i;
        }
        return soma;
    }
}