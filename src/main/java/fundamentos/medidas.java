// 1- Pacote
package fundamentos;

// 2 - Bibliotecas

import java.util.Scanner;

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
}
