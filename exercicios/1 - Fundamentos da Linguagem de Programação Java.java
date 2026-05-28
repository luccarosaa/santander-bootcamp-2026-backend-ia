import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        /*
        1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima a tela a seguinte mensagem:
        "Olá, 'Fulano' você tem 'X' anos"*/

        var baseYear = OffsetDateTime.now().getYear();
        System.out.println("Informe o seu nome:");
        var name = scanner.next();
        System.out.println("Informe o seu ano de nascimento");
        var year = scanner.nextInt();
        var age = baseYear - year;
        System.out.printf("Olá, %s! Você tem %s anos \n", name, age);

        /*
        2. Escreva um código que receba o tamanho do lado de um quadrado, calcule a sua área e exiba na tela
        - fórmula: área=lado X lado*/

        System.out.println("Para calcular a área do quadrado, informe o tamanho do lado dele:");
        var lado = scanner.nextInt();
        var area = lado * lado;
        System.out.printf("O valor da área do quadrado é: %s", area);

        /*
        3. Escreva um código que receba a base e a altura de um retângulo, calcule a área e exiba na tela
        - fóruma: área=base X altura*/

        System.out.println("Informe a base do retângulo:");
        var base = scanner.nextInt();
        System.out.println("Informe a altura do retângulo:");
        var altura = scanner.nextInt();
        var area = base * altura;
        System.out.printf("A área do retângulo é: %s", area);

        /*
        4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
         */

        // Primeira pessoa
        System.out.printf("Digite o nome da primeira pessoa: ");
        var nome1 = scanner.next();
        System.out.printf("Digite a idade de %s: ", nome1);
        var idade1 = scanner.nextInt();
        // Segunda pessoa
        System.out.printf("\nDigite o nome da segunda pessoa: ");
        var nome2 = scanner.next();
        System.out.printf("Digite a idade de %s: ", nome2);
        var idade2 = scanner.nextInt();
        // Conta
        var diferenca = Math.abs(idade1 - idade2);
        System.out.printf("\nA diferença de idade entre %s e %s é de %d anos", nome1, nome2, diferenca);
    }

}
