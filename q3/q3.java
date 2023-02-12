package q3;

import java.util.Scanner;


public class q3 {
    //3.Receba do teclado dois números inteiros, calcule e exiba os resultados das seguintes operações: adição, subtração, multiplicação, quocie,1te da divisão e o resto da divisão.
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.print("Numero 1: ");
    int i = sc.nextInt();
    System.out.print("Numero 2: ");
    int j = sc.nextInt();
    sc.close();
    System.out.println("Adição: "+(i+j));
    System.out.println("Subtração: "+(i-j));
    System.out.println("Multiplicação: "+(i*j));
    System.out.println("Quociente da divisão: "+(i/j));
    System.out.println("Resto da divisão: "+(i%j));
}
}
