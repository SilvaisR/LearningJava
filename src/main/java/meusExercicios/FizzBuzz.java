package meusExercicios;

import java.util.Scanner;
/*
Nesse exercício, eu preciso fazer um programa que conte até 100, e quando o número for divisível por 3 mostrar fizz,
quando for divisível por 5 Buzz, e quando for divisível por 3 e 5 meusExercicios.FizzBuzz, quando não aparecer nenhuma dessas opções
retornar apenas o número.
*/
public class FizzBuzz {
    public static void main(String[] args){
        for(int i=0; i<=100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("meusExercicios.FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
