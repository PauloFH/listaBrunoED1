package q14;

import java.util.Scanner;

class Sgrau{
    int a,b,c;
    double delta;
    double x1,x2;
    double Delta(int a,int b, int c){
        delta = (b*b) - (4*a*c);
        return delta;
    }
    void Baskara(){
        x1 = (-b + Math.sqrt(Delta(a,b,c))) / (2*a);
        x2 = (-b - Math.sqrt(Delta(a,b,c))) / (2*a);
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
    }
    public Sgrau(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

public class q14 {
    /*Construa um programa que calcule uma equação do 2° grau.
Crie uma função com retomo para calcular o delta
Crie uma função sem retomo para calcular as raiaes. */
    public static void main(String[] args) {
    int tempa, tempb, tempc;
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o valor de a: ");
    tempa = input.nextInt();
    System.out.print("Digite o valor de b: ");
    tempb = input.nextInt();
    System.out.print("Digite o valor de c: ");
    tempc = input.nextInt();
    Sgrau f = new Sgrau(tempa, tempb, tempc);
        double delta = f.Delta(tempa, tempb, tempc);
        System.out.println("Delta = "+delta);
        f.Baskara();
        input.close();
    }
}
