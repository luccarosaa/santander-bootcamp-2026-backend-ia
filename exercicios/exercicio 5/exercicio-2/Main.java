/*
2 - Escreva um código que calcule o valor de tributos de produtos,
os produtos disponíveis devem ser dos seguintes tipos: Alimentação,
Saude e bem estar, Vestuário e Cultura. Todos os produtos devem ter um
métoodo para retornar o seu valor de imposto, de acordo com seu tipo:
   - Alimentação 1%;
   - Saude e bem estar 1.5%;
   - Vestuário 2.5%;
   - Cultura 4%.
 */

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int option;
        CalcularTributo calculo = null;
        while (true){
            System.out.println("\n========== Cálculo de Tributo ==========\n");
            System.out.println("Escolha o tipo de produto\n");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Saúde e bem estar");
            System.out.println("3 - Vestuário");
            System.out.println("4 - Cultura");
            System.out.println("0 - Sair");
            System.out.println("\n==========================================");

            option = scanner.nextInt();

            if (option == 1) {
                calculo = calcularAlimentacao();
            } else if (option == 2) {
                calculo = calcularSaude();
            } else if (option == 3) {
                calculo = calcularVestuario();
            } else if (option == 4) {
                calculo = calcularCultura();
            } else if (option == 0) {
                break;
            } else{
                System.out.println("Opção inválida");
            }

            System.out.printf("O resultado do cálculo do tributo é de R$ %.2f%n", calculo.calcularTributo());
        }
    }

    private static CalcularTributo calcularAlimentacao(){
        System.out.println("Informe o valor do alimento:");
        var valor = scanner.nextDouble();
        return new Alimentacao(valor);
    }

    private static CalcularTributo calcularSaude(){
        System.out.println("Informe o valor do produto de Saúde e Bem Estar:");
        var valor = scanner.nextDouble();
        return new SaudeBemEstar(valor);
    }

    private static CalcularTributo calcularVestuario(){
        System.out.println("Informe o valor da Vestimenta:");
        var valor = scanner.nextDouble();
        return new Vestuario(valor);
    }

    private static CalcularTributo calcularCultura(){
        System.out.println("Informe o valor do produto de Cultura:");
        var valor = scanner.nextDouble();
        return new Cultura(valor);
    }


}