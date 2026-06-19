/*
3 - Escreva um código onde seja possível calcular a área de uma figura geométrica,
todas devem ter um métoodo que retorne esse valor, as formas geométricas disponiveis
devem ser as seguintes:
   - Quadrado: possui o valor dos seus lados;
   - Retângulo: possui os valores de base e altura;
   - Circulor: possui o atributo raio.
 */

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int option;
        FormaGeometrica formaGeometrica = null;
        while (true){
            System.out.println("\n================================================\n");
            System.out.println("Escolha a forma geométrica para calcular a área\n");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("4 - Sair do programa");
            System.out.println("\n================================================");

            option = scanner.nextInt();

            if (option == 1) {
                formaGeometrica = criarQuadrado();
            } else if (option == 2) {
                formaGeometrica = criarRetangulo();
            } else if (option == 3) {
                formaGeometrica = criarCirculo();
            } else if (option == 4) {
                break;
            } else{
                System.out.println("Opção inválida");
            }

            System.out.println("O resultado do cálculo da área foi de " + formaGeometrica.getArea());
        }
    }

    private static FormaGeometrica criarQuadrado(){
        System.out.println("Informe o lado do quadrado:");
        var lado = scanner.nextDouble();
        return new Quadrado(lado);
    }

    private static FormaGeometrica criarRetangulo(){
        System.out.println("Informe a base do retangulo:");
        var base = scanner.nextDouble();
        System.out.println("Informe a altura do retangulo:");
        var altura = scanner.nextDouble();
        return new Retangulo(base, altura);
    }

    private static FormaGeometrica criarCirculo(){
        System.out.println("Informe o raio do círculo:");
        var raio = scanner.nextDouble();
        return new Circulo(raio);
    }
}