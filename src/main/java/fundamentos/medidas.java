// 1- Pacote
package fundamentos;

// 2 - Bibliotecas

import java.util.Scanner;
import java.util.Random;

// 3 - Classes
public class medidas {
    // 3.1 - Atributos

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o cálculo desejado: ");
        System.out.println("(1) - Area do quadrado");
        System.out.println("(2) - Area do retângulo");
        System.out.println("(3) - Area do triângulo");
        System.out.println("(4) - Area do circulo");
        System.out.println("(5) - Contagem progressiva");
        System.out.println("(6) - Contagem Regressiva");
        System.out.println("(7) - Contagem Fibonacci");
        System.out.println("(8) - Adivinhar número");
        System.out.print("Digite aqui sua opção: ");
        int opcao = scan.nextInt();
        System.out.println();

        switch (opcao) {
            case 1:
                System.out.println("Digite O valor do lado de um dos lados do quadrado para que possamos fazer a conta.");
                System.out.print("Opção: ");
                double lado = scan.nextDouble();
                double resultado1 = calculaAreaQuadrado(lado);
                System.out.println("\nO resultado do cálculo da área é: " + resultado1);
                break;

            case 2:
                System.out.println("Digite os valores para que possamos calcular o retângulo.");
                System.out.print("Opção 1: ");
                double lado1 = scan.nextDouble();
                System.out.print("\nOpção 2: ");
                double lado2 = scan.nextDouble();
                double resultado2 = calcularAreaRetangulo(lado1, lado2);
                System.out.println("\nO resultado do cálculo da área do retângulo é de: " + resultado2);
                break;

            case 3:
                System.out.println("Digite o valor da base e da altura para que possamos calcular o triangulo.");
                System.out.print("Base: ");
                double base = scan.nextDouble();
                System.out.print("\nAltura: ");
                double altura = scan.nextDouble();
                double resultado3 = calcularAreaTriangulo(base, altura);
                System.out.println("\nO resultado do cálculo da área do triângulo é de: " + resultado3);
                break;

            case 4:
                System.out.println("Digite o raio do circulo para que possamos calcular sua área.");
                System.out.print("Raio: ");
                double raio = scan.nextDouble();
                double resultado4 = calcularAreaCirculo(raio);
                System.out.println("\nO resultado do cálculo da área do círculo é de: " + resultado4);
                break;

            case 5:
                System.out.println("Digite um valor que é até onde iremos contar.");
                System.out.print("Valor: ");
                int valor = scan.nextInt();
                System.out.println();
                contagemProgressiva(valor);
                break;

            case 6:
                System.out.println("Digite um valor que é de onde iremos começar a contagem.");
                System.out.print("Valor: ");
                int num = scan.nextInt();
                System.out.println();
                contagemRegressiva(num);
                break;

            case 7:
                System.out.println("Digite um número de vezes que você quer ver a contagem fibonacci.");
                System.out.print("Valor: ");
                int valor1 = scan.nextInt();
                System.out.println();
                contagemFibonacci(valor1);
                break;

            case 8:
                System.out.println("Eu vou pensar em um número de 1 à 10 e você vai tentando até adivinhar.");
                adivinharNumero();
                break;

            default:
                System.out.println("Você digitou uma opção inválida.");
                break;

        }
    }

    public static double calculaAreaQuadrado(double valor) {
        return valor * valor;
    }

    public static double calcularAreaRetangulo(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public static void contagemProgressiva(int valor) {
        for (int i = 1; i <= valor; i++) {
            System.out.println(i + "");
        }
    }

    public static void contagemRegressiva(int valor) {
        for (int i = valor; i >= 0; i--) {
            System.out.println(i + " ");
        }
    }

    public static void contagemFibonacci(int contador){
        int init = 1;
        int fib = 2;
        int soma;
        System.out.print("1 ");
        for(int i = 1; i <= contador; i++){
            System.out.print(fib + " ");
            soma = init + fib;
            init = fib;
            fib = soma;
        }
    }

    public static void adivinharNumero(){
        Random gerador = new Random();
        Scanner scan = new Scanner(System.in);
        int opcaoUser;
        int opcaoMaquina = gerador.nextInt(11);
        do {
            System.out.print("Opção: ");
            opcaoUser = scan.nextInt();
        } while(opcaoMaquina != opcaoUser);
        System.out.println("Acertou miseravi!!!");
    }

}
