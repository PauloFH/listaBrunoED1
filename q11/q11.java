package q11;

import java.util.Scanner;

class Conta{
    private double saldo;
    public Conta(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void transferir(Conta conta, double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            conta.saldo += valor;
            System.out.println("Transferência realizada com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
public class q11 {
    //Construa um programa que simule uma transferência bancária, entre duas contas. Primeiro, inicialize cada conta com RS 100. Depois., permita
    //que o usuário defina quanto deve transferir, da conta1 para a conta2, porem a transferência só deve ser realizada caso haja saldo suficiente.
    

    public static void main(String[] args) {

        Conta conta1 =  new Conta(100);
        Conta conta2 =  new Conta(100);
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor a ser transferido da conta1 para a conta2");
        double valor = in.nextDouble();
        conta1.transferir(conta2, valor);
        System.out.println("Saldo da conta1: " + conta1.getSaldo());
        System.out.println("Saldo da conta2: " + conta2.getSaldo());
        in.close();
    }


}
