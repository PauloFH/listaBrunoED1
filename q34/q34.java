package q34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q34 {
    /*Construa um programa que oonte a quantidades de vezes que as palavras de uma frase aparecem.
E.xemplo: "estude muito sempre sempre esrude" Resultado: estu.de=2 muito= l sempre=2 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();
        in.close();
        List<palavra> palavras = new ArrayList<palavra>();
        String[] palavrasFrase = frase.split(" ");
        for(int i = 0; i < palavrasFrase.length; i++){
            String p = palavrasFrase[i];
            boolean achou = false;
            for(palavra palavra : palavras){
                if(palavra.palavra.equals(p)){
                    palavra.achou();
                    achou = true;
                    break;
                }
            }
            if(!achou){
                palavra palavra = new palavra();
                palavra.palavra = p;
                palavra.achou();
                palavras.add(palavra);
            }
        }
        for(int i = 0; i < palavras.size(); i++){
            System.out.println(palavras.get(i).palavra + " = " + palavras.get(i).qtd);
        }
}
}
class palavra{
    String palavra;
    int qtd;
    void achou(){
        qtd++;
    }
}
