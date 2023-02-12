package q38;


public class q38 {
    
    /* 38.	Utilizando o recurso Generic de Java, faça um mêtodo para exibir um objeto (usando seu método toString), e outro método para exibir os elementos de um vetor.
 */

 public static void main(String[] args) {
        String[] strA = {"batata", "cenoura", "abobora", "alface", "tomate"};
        obj<String> o = new obj<>();
        o.exibir(strA);
        System.out.println();
        for(String i : strA ){
            o.exibir(i);
        }

 }
}

class obj<T>{

    public void exibir(T o){
        System.out.println(o.toString());
    }  

    public void exibir(T[] o){
        for(T i : o){
            System.out.println(i.toString());
        }
    }
}
