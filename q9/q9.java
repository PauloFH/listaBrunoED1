package q9;

import java.util.Scanner;

import java.lang.Math;
public class q9 {
    //Construa um programa que calcule a ârea de um círculo tendo como entrada o valor do raio, que de e ser positivo. Use o valor da constante PI
    //,indo da biblioteca matemática.

    public static void main(String[] args) {
        double raio;
        Scanner input = new Scanner(System.in);
        do{
         raio = input.nextDouble();
        }
        while(raio <= 0);
        input.close();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println(area);
    }
}
