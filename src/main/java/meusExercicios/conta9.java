package meusExercicios;/*
Nesse exercício eu vou escrever o seguinte programa, o usuário digita um número que ele quer que seja contado,
e digita um segundo número que é até onde ele quer a contagem, então o programa vai contar de 0 até o segundo digito do
usuário e vai dizer quantas vezes o primeiro número apareceu ao decorrer da contagem.
 */
import java.util.Scanner;

public class conta9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite aqui o primeiro número: ");
        int opcaoUser1 = scan.nextInt();
        System.out.print("\nDigite aqui o segundo número: ");
        int opcaoUser2 = scan.nextInt();

        int contador;
        for(int i=0; i<=opcaoUser2; i++){
            String num = Integer.toString(i);
            System.out.println();
        }

    }
}
