package q33;
import java.util.Scanner;

public class q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        int[] letras = new int[26];

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra >= 'a' && letra <= 'z') {
                letras[letra - 'a']++;
            } else if (letra >= 'A' && letra <= 'Z') {
                letras[letra - 'A']++;
            }
        }

        for (int i = 0; i < letras.length; i++) {
            if (letras[i] > 0) {
                char letra = (char) ('a' + i);
                System.out.println(letra + " = " + letras[i]);
            }
        }
		scanner.close();
    }
}
