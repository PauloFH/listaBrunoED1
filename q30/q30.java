package q30;

import java.util.Scanner;

public class q30 {
    //Construa um programa que in,·erta a frase digitada pelo usuário. Por exemplo, se string l for "bom dia", então string2 será "aid mob".

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String l = in.nextLine();
        String l2 = "";
        in.close();
        for (int i = l.length() - 1; i >= 0; i--) {
            l2 += l.charAt(i);
        }
        System.out.println(l2);
    }
}
