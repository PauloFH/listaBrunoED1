package q35;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class q35 {
    /*35. Evolua a questão anterior. Permita que o programa salve o resultado em um arquivo de texto CSV. Permita que o programa abra o arquivo de
texto CSV e exiba o conteúdo na tela. */
   public static void main(String[] args) throws IOException {
    q34 testep = new q34();
    List<palavra> palavras = new ArrayList<palavra>();
    File dir = new File("D:\\Projects\\Java\\listabruno\\q35");
    boolean stsDir = dir.mkdir();
    File file = new File(dir, "q35.csv");
    boolean stsFile = file.createNewFile();
    
    int geral = 1;
    while(geral !=  0){
        System.out.println("1 - Salvar em arquivo");
        System.out.println("2 - Ler arquivo");
        System.out.println("0 - Sair");
        Scanner in = new Scanner(System.in);
        geral = in.nextInt();
        switch(geral){
            case 1:
                palavras = testep.teste();
                try {
                    FileWriter writer = new FileWriter(file, false);
                    PrintWriter out = new PrintWriter(writer);
            
                    for(palavra palavra : palavras){
                        out.println(palavra.palavra + "," + palavra.qtd);
                    }
                        out.flush();
                        out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 2:
            if (stsFile) {
                System.out.println("Arquivo Não existe!");
            } else {
                System.out.println("Arquivo já existe");
                testep.ler();
            }
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
   }
}

class q34 {
    public List<palavra> teste() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();
        List<palavra> palavras = new ArrayList<palavra>();
        String[] palavrasFrase = frase.split(" ");
        for(int i = 0; i < palavrasFrase.length; i++){
            String p = palavrasFrase
            [i].toLowerCase();
            boolean tem = false;
            for(palavra palavra : palavras){
            if(palavra.palavra.equals(p)){
            palavra.qtd++;
            tem = true;
            break;
            }
            }
            if(!tem){
            palavra nova = new palavra();
            nova.palavra = p;
            nova.qtd = 1;
            palavras.add(nova);
            }
            }
            return palavras;
            }
            
            public void ler() throws IOException {
                BufferedReader in = new BufferedReader(new FileReader("D:\\Projects\\Java\\listabruno\\q35\\q35.csv"));
                String line;
                while((line = in.readLine()) != null){
                    System.out.println(line);
                }
                in.close();
            }
            }
            
            class palavra {
            public String palavra;
            public int qtd;
            }
            
            
            
            
            