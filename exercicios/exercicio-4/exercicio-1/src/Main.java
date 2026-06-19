/*
1. Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser comercializados em um cinema.
O ingresso deve ter um valor, nome do filme e informar se é dublado ou legendado. A partir desse ingresso devem
ser criados os tipos Meia entrada e ingresso família. Cada ingresso deve ter um método que retorna o seu valor
real ( baseado no valor informado na criação do ingresso) para os de meia entrada o seu valor deve ser de metade
do valor, para os ingressos família deve-se retornar o valor multiplicado pelo número de pessoas e fornecer um
desconto de 5% quando o número de pessoas for maior que 3.
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        Ingresso ingresso1 = new Ingresso();
        ingresso1.setNomeFilme("Eu & Você Na Toscana");
        ingresso1.setTipoFilme("Dublado");
        ingresso1.setValor(38.76);

        Ingresso ingresso2 = new Ingresso();
        ingresso2.setNomeFilme("O Diabo Veste Prada 2");
        ingresso2.setTipoFilme("Legendado");
        ingresso2.setValor(41.00);

        Ingresso ingresso3 = new Ingresso();
        ingresso3.setNomeFilme("O Drama");
        ingresso3.setTipoFilme("Legendado");
        ingresso3.setValor(22.80);

        Ingresso ingresso4 = new Ingresso();
        ingresso4.setNomeFilme("A Saga Crepúsculo: Eclipse (Relançamento)");
        ingresso4.setTipoFilme("Dublado");
        ingresso4.setValor(38.40);

        Ingresso ingresso5 = new Ingresso();
        ingresso5.setNomeFilme("Toy Story 5");
        ingresso5.setTipoFilme("Dublado");
        ingresso5.setValor(61.61);

        System.out.println("=== Escolha o seu filme ===");
        System.out.println("1 - " + ingresso1.getNomeFilme());
        System.out.println("2 - " + ingresso2.getNomeFilme());
        System.out.println("3 - " + ingresso3.getNomeFilme());
        System.out.println("4 - " + ingresso4.getNomeFilme());
        System.out.println("5 - " + ingresso5.getNomeFilme());
        System.out.println("0 - Sair");
        System.out.println("============================");

        var option = scanner.nextInt();

        Ingresso ingressoEscolhido;

        switch (option) {
            case 1 -> ingressoEscolhido = ingresso1;
            case 2 -> ingressoEscolhido = ingresso2;
            case 3 -> ingressoEscolhido = ingresso3;
            case 4 -> ingressoEscolhido = ingresso4;
            case 5 -> ingressoEscolhido = ingresso5;
            case 0 -> {
                System.out.println("Saindo...");
                return;
            }
            default -> {
                System.out.println("Opção inválida");
                return;
            }
        }

        System.out.println("=== Escolha o tipo de ingresso ===");
        System.out.println("1 - Inteira");
        System.out.println("2 - Meia entrada");
        System.out.println("3 - Família");
        System.out.println("0 - Desistir");
        System.out.println("==================================");

        var tipoIngresso = scanner.nextInt();

        Ingresso ingressoFinal;

        switch (tipoIngresso) {
            case 1 -> ingressoFinal = ingressoEscolhido;
            case 2 -> {
                MeiaEntrada meia = new MeiaEntrada();

                meia.setNomeFilme(ingressoEscolhido.getNomeFilme());
                meia.setTipoFilme(ingressoEscolhido.getTipoFilme());
                meia.setValor(ingressoEscolhido.getValor());

                ingressoFinal = meia;
            }
            case 3 -> {
                IngressoFamilia familia = new IngressoFamilia();

                familia.setNomeFilme(ingressoEscolhido.getNomeFilme());
                familia.setTipoFilme(ingressoEscolhido.getTipoFilme());
                familia.setValor(ingressoEscolhido.getValor());

                System.out.println("Informe a quantidade de pessoas:");
                int quantidade = scanner.nextInt();

                familia.setNPessoas(quantidade);

                ingressoFinal = familia;
            }
            case 0 -> {
                System.out.println("Saindo...");
                return;
            }
            default -> {
                System.out.println("Opção inválida");
                return;
            }
        }

        System.out.println("Filme: " + ingressoFinal.getNomeFilme());
        System.out.println("Tipo: " + ingressoFinal.getTipoFilme());
        System.out.println("Valor original: R$ " + ingressoFinal.getValor());
        if (ingressoFinal instanceof MeiaEntrada || ingressoFinal instanceof IngressoFamilia){
            System.out.println("Valor final: R$ " + ingressoFinal.getValorReal());
        }
    }
}