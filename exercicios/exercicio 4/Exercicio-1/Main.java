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
        System.out.println("============================");

        var filme = scanner.nextInt();
    }
}