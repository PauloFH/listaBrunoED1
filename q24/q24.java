package q24;

import java.util.Scanner;

class calculadora{
    int fatorial(int num){
        int fatorial = num;
        for(int i = 1; i < num; i++){
            fatorial = fatorial * i;
        }
        return fatorial;
    }
    double raiz(double num){
        double raiz = Math.sqrt(num);
        return raiz;
    }
    double potencia(double num, double expoente){
        double potencia = Math.pow(num, expoente);
        return potencia;
    }
}
public class q24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 10;
        do{
            calculadora calc = new calculadora();
            while(n < 0 || n > 3){
            System.out.println("Menu de Opõções");
            System.out.println(" 1 - potenciação");
            System.out.println("2 - raiz quadrada");
            System.out.println("3 - fatorial");
            System.out.println("o - sair ");
            System.out.print("Digite a opção desejada: ");
            n = in.nextInt();
            }
            switch(n){
                case 1:
                    System.out.println("Digite um número: ");
                    n = in.nextInt();
                    System.out.println("Digite o expoente: ");
                    int expoente = in.nextInt();
                    System.out.println("A potência de " + n + " elevado a " + expoente + " é: " + calc.potencia(n, expoente));
                    break;
                case 2:
                    System.out.println("Digite um número: ");
                    n = in.nextInt();
                    System.out.println("A raiz quadrada de " + n + " é: " + calc.raiz(n));
                    break;
                case 3:
                    System.out.println("Digite um número: ");
                    n = in.nextInt();
                    System.out.println("O fatorial de " + n + " é: " + calc.fatorial(n));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(n != 0);
        
        in.close();
    }
}
