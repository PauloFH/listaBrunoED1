package q36;

import java.util.Scanner;

public class q36 {
    /* 36. Construa e use uma função para calcular o fatorial de um número utilizando recursi,·idade.*/

    public static void main(String[] args) {
        fat f = new fat();
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = in.nextInt();
        System.out.println(f.fatorial(n));
        in.close();
    }

}

class fat{

    int fatorial(int n){
        if(n == 0){
            return 1;
        }
        return n * fatorial(n - 1);
    }
}