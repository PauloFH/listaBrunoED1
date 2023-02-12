package q29;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q29 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String n = sc.next();
        sc.close();
        char [] t = n.toCharArray();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<t.length;i++){
            list.add(t[i]-'0');
        }

    }
}
