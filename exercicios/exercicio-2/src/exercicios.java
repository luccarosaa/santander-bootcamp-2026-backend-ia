import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        /*
        Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
        */
        System.out.println("Digite um número:");
        var num = scanner.nextInt();
        for (var i = 1; i <= 10; i++) {
            var tabuada = num * i;
            System.out.printf("%d x %d = %d\n", num, i, tabuada);
        } 

        /*
        Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu
        IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

        - Se for menor ou igual a 18,5 "Abaixo do peso";
        - Se for entre 18,6 e 24,9 "Peso ideal";
        - Se for entre 25,0 e 29,9 "Levemente acima do peso";
        - Se for entre 30,0 e 34,9 "Obesidade Grau I";
        - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
        - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
        */
        System.out.println("Digite a sua altura em metros:");
        var altura = scanner.nextFloat();
        System.out.println("Digite o seu peso:");
        var peso = scanner.nextFloat();

        var imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("\nIMC: " + imc);
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("\nIMC: " + imc);
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("\nIMC: " + imc);
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("\nIMC: " + imc);
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("\nIMC: " + imc);
            System.out.println("Obesidadde Grau II (Severa)");
        } else {
            System.out.println("\nIMC: " + imc);
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        /*
        Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe
        entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a
        seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;
        */
        System.out.println("Digite um número:");
        var n1 = scanner.nextInt();
        System.out.println("Digite um número maior que o primeiro:");
        var n2 = scanner.nextInt();
        while (n2 <= n1) {
            System.out.printf("O segundo número precisa ser maior que %d\n", n1);
            System.out.printf("\nPor favor, digite um número maior que %d:\n", n1);
            n2 = scanner.nextInt();
        }

        System.out.println("Por favor, escolha entre PAR ou ÍMPAR: (p/i)");
        var escolha = scanner.next();
        while (!(escolha.equalsIgnoreCase("p") || escolha.equalsIgnoreCase("i"))) {
            System.out.println("Escolha entre PAR ou ÍMPAR: (p/i)\n");
            escolha = scanner.next();
        }

        for (var i = n2; i >= n1; i--) {
            if (i %2 == 0 && escolha.equalsIgnoreCase("p")) {
                System.out.println(i);
            } else if (i %2 != 0 && escolha.equalsIgnoreCase("i")) {
                System.out.println(i);
            }
        }

        /*
        Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a
        execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente
        de 0 na divisão, números menores que o primeiro número devem ser ignorados
         */
        System.out.println("Informe um número:");
        var number = scanner.nextInt();
        while (true) {
            System.out.println("Informe o número para verificação:");
            var toVerify = scanner.nextInt();
            if(toVerify < number){
                System.out.printf("Informe um número maior que %s\n", number);
                continue;
            }

            var result = toVerify % number;
            System.out.printf("%s %% %s = %s\n", toVerify, number, result);

            if (result != 0) break;
        }
    }

}
