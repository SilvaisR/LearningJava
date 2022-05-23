/*
Neste exerício eu preciso criar um programa que simule um caixa eletrônico, primeiro mostrando quando a pessoa tem de
saldo, em seguida perguntando se ela quer sacar, ou depositar, em seguida executar a tarefa depedendo da escolha da
pessoa.
 */
import java.util.Scanner;

public class caixaEletronico {
    Scanner scan = new Scanner(System.in);
    static double saldoEmContaInicial = 600;
    public static void main(String[] args){
        double saldo = saldoEmContaInicial;

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
