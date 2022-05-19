// Aqui eu vou criar um jogo onde a maquina escolhe um número e pede para o usuário tentar adivinhar.
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

public class jogo {

    public static void main(String[] args){

        PrintStream show = System.out;
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int opcao, escolhaComputador, escolhaUsuario = 0;
        show.println("Olá! vamos jogar?");
        show.println("Vamos lá. Digite (1) para jogar ou (2) para não jogar.");
        show.print("Opcao:");
        opcao = scan.nextInt();

        if (opcao == 2){
            show.println("\nFica pra próxima, falou!!!\n");
        }else if(opcao == 1){
            show.println("Opa, bora jogar então!");
            show.println("Vamos ver se você adivinha o número que eu estou pensando.");
            show.println("Vamos lá, escolha um número de 0 à 10.");
            escolhaComputador = gerador.nextInt(11);
            do {
                show.print("Opção: ");
                escolhaUsuario = scan.nextInt();

                if(escolhaUsuario == escolhaComputador){
                   show.println("\nUau! Você acertou. Parabéns!!");
                }
                else{
                    show.println("Não acertou. Tenta de novo aí.");
                }
            } while(escolhaUsuario != escolhaComputador);


        }


    }

}
