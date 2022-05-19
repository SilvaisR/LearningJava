// Here I'll make a code that show the media of a studant

import java.util.Scanner;

public class mediaAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        int nota = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("\nDigite a média do aluno: ");
            nota += scan.nextInt();
            contador ++;
        }
        int media = nota / contador;
        System.out.println("\nA média do aluno foi: " + media + "\n");
    }
}
