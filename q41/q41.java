package q41;

import java.util.*;
public class q41 {
    /*41.	Utiliza!ldo a Collection de Java, faça exemplos de uso das classes abaixo e explicite suas diferenças: 
     * a)	List: Arraylist, Vector, linkedList
    */
    public static void main(String[] args) {
        //ArrayList
        List<String> lista_feira = new ArrayList<>();
        lista_feira.add("Cenoura");
        lista_feira.add("Batata");
        lista_feira.add("Tomate");

        //Vector
        List<String> vetor_carros = new Vector<>();
        vetor_carros.add("Chevette");
        vetor_carros.add("Fusca");
        vetor_carros.add("Opala");
        
        //LinkedList
        List<String> lista_de_compras = new LinkedList<>();
        lista_de_compras.add("Leite");
        lista_de_compras.add("ovos");
        lista_de_compras.add("pão");

        /*Embora a implementação seja muito parecida, as 3 estruturas são feitas para diversos problemas diferentes.
        O ArrayList é implementado usando um array, o Vector é semelhante ao ArrayList, mas é sincronizado
         e o LinkedList é uma lista duplamente encadeada. O ArrayList e o Vector são adequados para aplicações
         que exigem recuperação rápida de elementos, enquanto o LinkedList é recomendado para operações de 
         inserção e remoção frequentes em posições intermediárias da lista. Além disso, o Vector é thread-safe,
          o que o torna apropriado para aplicativos que exigem acesso concorrente aos elementos da lista.
         */



         //B) Set: HashSet, llinkedhashSet, TreeSet

         //HashSet
         Set<String> hashSet_Fruteira = new HashSet<>();
         
         hashSet_Fruteira.add("Pera");
         hashSet_Fruteira.add("Pêssego");
         hashSet_Fruteira.add("Banana");
         hashSet_Fruteira.add("maçã");
         System.out.println(hashSet_Fruteira);


        //LinkedHashSet
        Set<String> alunos = new LinkedHashSet<>();
        alunos.add("Pedro");
        alunos.add("João");
        alunos.add("Maria");
        alunos.add("Melissa");
        System.out.println(alunos);

        //TreeSet
        Set<Integer> inteiros = new TreeSet<>();
        inteiros.add(0);
        inteiros.add(2);
        inteiros.add(8);
        inteiros.add(9);
        System.out.println(inteiros);
        /*
         As implementações HashSet, LinkedHashSet e TreeSet da interface Set no Java têm diferenças
          em como armazenam e recuperam os elementos. O HashSet é implementado usando uma tabela hash, 
          o LinkedHashSet usa uma lista vinculada para manter a ordem de inserção, enquanto o TreeSet 
          usa uma árvore balanceada para armazenar os elementos. Além disso, o HashSet e o LinkedHashSet
          permitem elementos nulos, enquanto o TreeSet não permite. O HashSet é a implementação mais rápida
          para a recuperação de elementos, enquanto o LinkedHashSet é adequado para aplicações que exigem a
          manutenção da ordem de inserção. O TreeSet é adequado para aplicações que exigem uma ordem crescente 
          de elementos, mas não é tão rápido quanto o HashSet e o LinkedHashSet para recuperar elementos.
         */

         


        //c) Queue: Priority-Queue, linkedList
    
    
        //PriorityQueue
            PriorityQueue<Integer> queue_Inteiros = new PriorityQueue<Integer>();
            queue_Inteiros.add(17);
            queue_Inteiros.add(22);
            queue_Inteiros.add(13);
            System.out.println(queue_Inteiros.poll()); 
             // Retorna o primeiro elemento da fila e o remove da fila no caso o 13 que é o menor valor
        
        //LinkedList
            Queue<String> queue_Nomes = new LinkedList<>();
            queue_Nomes.add("João");
            queue_Nomes.add("Maria");
            queue_Nomes.add("Pedro");
            System.out.println(queue_Nomes.poll()); 
            // Retorna o primeiro elemento da fila e o remove da fila no caso o João

        /*A principal diferença de implementação entre PriorityQueue e LinkedList como uma Queue
         é a maneira como os elementos são organizados. Em uma PriorityQueue, os elementos são armazenados
          em ordem natural (ou definida pelo comparador fornecido) e as operações de adição/remoção são
          realizadas com base nessa ordem, garantindo que o próximo elemento a ser removido seja sempre
          o que tem a mais alta prioridade. Já em uma LinkedList, os elementos são simplesmente adicionados 
          no final da lista e a remoção é feita a partir do início da lista.
        Portanto, PriorityQueue é mais adequado quando a ordem dos elementos é importante para o uso da fila,
         enquanto LinkedList é uma opção mais geral para uma fila simples onde a ordem dos elementos não importa.
        */

        //d)	Deque: LinkedList
            Deque<String> deque_Nomes = new LinkedList<>();
            deque_Nomes.add("João");
            deque_Nomes.addFirst("Ana");
            deque_Nomes.addLast("Paula");
            deque_Nomes.addFirst("Joacir");
            deque_Nomes.addLast("Mario");
            String first = deque_Nomes.removeFirst();
            String last = deque_Nomes.removeLast();
            System.out.println(first);
            System.out.println(last);
        /*Uma LinkedList usada como uma Deque é uma estrutura de dados que permite inserções e remoções em ambas
         as extremidades da lista, podendo adicionar elementos no início ou no final da lista com os métodos 
         addFirst() e addLast() e remover elementos com removeFirst() e removeLast(). Essa implementação é útil 
         quando precisamos de uma estrutura de dados que nos permita adicionar ou remover elementos no início ou no
          final da lista com alta eficiência. */
        
        //e) Map: HashMap, LinkedHashMap, TreeMap
        


        //HashMap
        Map<Integer, String> hashMap_Carros = new HashMap<>();
        hashMap_Carros.put(1, "Uno com escada");
        hashMap_Carros.put(2, "Celta");
        hashMap_Carros.put(3, "Gol");
        System.out.println(hashMap_Carros.get(1)); 
        
        //LinkedHashMap
        Map<Integer, String> lHM_dinossauros = new LinkedHashMap<>();
        lHM_dinossauros.put(1, "triceratops");
        lHM_dinossauros.put(2, "mastodonte");
        lHM_dinossauros.put(3, "tiranossauro");
        System.out.println(lHM_dinossauros.get(2));
        
        //TreeMap
        Map<Integer, String> treeMap_motos = new TreeMap<>();
        treeMap_motos.put(3, "biz 125");
        treeMap_motos.put(2, "fazer 250");
        treeMap_motos.put(1, "traxx 110i");
        System.out.println(treeMap_motos.get(3));
        
        /*As três implementações de Map em Java, HashMap, LinkedHashMap e TreeMap, têm diferenças significativas
         em sua estrutura e uso. O HashMap é a implementação mais rápida, mas não garante a ordem de inserção dos 
         elementos. O LinkedHashMap mantém a ordem de inserção e ainda é razoavelmente rápido. O TreeMap mantém os 
         elementos em ordem natural ou definida pelo programador e é o mais lento das três implementações. Em termos
         de uso, o HashMap é mais adequado para operações em que a ordem dos elementos não é importante, enquanto o 
         LinkedHashMap é útil para manter a ordem de inserção e o TreeMap é melhor para operações em que a ordenação 
         é necessária. Exemplos de código em Java para cada implementação podem ser encontrados na documentação oficial do Java. 
         */
    }
}


