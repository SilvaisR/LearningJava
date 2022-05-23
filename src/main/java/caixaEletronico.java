/*
Neste exerício eu preciso criar um programa que simule um caixa eletrônico, primeiro mostrando quando a pessoa tem de
saldo, em seguida perguntando se ela quer sacar, ou depositar, em seguida executar a tarefa depedendo da escolha da
pessoa.
 */
import java.util.Scanner;

public class caixaEletronico {
    static double saldoEmContaInicial = 600;
    public static void main(String[] args){
        System.out.println("demo: " + saldoEmContaInicial);
        Scanner scan = new Scanner(System.in);
        double saldo = saldoEmContaInicial;
        System.out.println("Você vai digitar o número de acordo com a sua opção\n" +
                "1 - Depositar\n" +
                "2 - Sacar\n");
        System.out.print("Opção: ");
        int opcaoUsuario = scan.nextInt();
        System.out.println();
        if(opcaoUsuario == 1){
            System.out.print("Digite o valor que deseja depositar: ");
            double valorDepositado = scan.nextDouble();
            saldo = depositar(valorDepositado);
            System.out.println("Seu saldo atual é: " + saldo);
            System.out.println("demo: " + saldoEmContaInicial);
        }else if(opcaoUsuario == 2){
            System.out.print("Digite o valor que deseja sacar: ");
            double valorSacado = scan.nextDouble();
            saldo = sacar(valorSacado);
            System.out.println("Seu saldo atual é: " + saldo);
            System.out.println("demo: " + saldoEmContaInicial);
        }
    }

    public static double depositar(double valor){
        saldoEmContaInicial += valor;
        return saldoEmContaInicial;
    }

    public static double sacar(double valor){
        saldoEmContaInicial -= valor;
        return valor;
    }

    // função de empréstimo

    // função de pagar boleto

    // função de solicitar cartão de crédito



}
