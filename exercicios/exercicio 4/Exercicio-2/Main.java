/*
Crie uma hierarquia de classes que definam os tipos de usuários de um sistema, use os seguintes requisitos:
    * Classe Gerente que terá os atributos: Nome, Email, Senha e um atributo que informa se ele é administrador,
    esse último deve ser sempre verdadeiro;
    * Classe Vendedor que terá os seguintes atributos: Nome, Email, Senha, Quantidade de vendas e um atributo que
    informa se ele é administrador, esse útimo deve ser sempre falso;
    * Classe Atendente que terá os seguintes atributos: Nome, Email, Senha, Valor em caixa e um atributo que informa
    se ele é administrador, esse ultimo deve ser sempre falso.

Cada classe deve ter seus respectivos getters e setters ( para atributos que façam sentido ter) e as classes
devem ter os seguintes métodos
    * A classe Gerente deve ter os métodos Gerar relatório financeiro, Consultar vendas, Realizar login, Realizar
    logff, alterar dados, alterar senha;
    * A classe Vendedor deve ter os métodos Realizar venda ( incrementar o número de vendas quando acionado),
    Consultar vendas, Realizar login, Realizar logoff, alterar dados, alterar senha;
    * A classe Atendente deve ter os métodos Receber pagamentos (onde o métoodo recebe um valor que deve ser
    incrementado no valor em caixa), Fechar o caixa, Realizar Login, Realizar logoff, alterar dados e alterar
    senha;
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("=== Escolha o tipo de funcionário ===");
        System.out.println("1 - Gerente");
        System.out.println("2 - Vendedor");
        System.out.println("3 - Atendente");
        System.out.println("=====================================");

        int tipo = scanner.nextInt();
        scanner.nextLine();

        Funcionario funcionario;

        switch (tipo) {
            case 1 -> funcionario = new Gerente();
            case 2 -> funcionario = new Vendedor();
            case 3 -> funcionario = new Atendente();
            default -> {
                System.out.println("Opção inválida");
                return;
            }
        }

        System.out.println("Digite o nome:");
        funcionario.setNome(scanner.nextLine());

        System.out.println("Digite o e-mail:");
        funcionario.setEmail(scanner.nextLine());

        System.out.println("Digite a senha:");
        funcionario.setSenha(scanner.nextLine());

        int opcao;

        do {
            System.out.println("\n=========== Menu ===========");
            System.out.println("1 - Login");
            System.out.println("2 - Alterar dados");
            System.out.println("3 - Alterar senha");
            System.out.println("4 - Ver se é administrador");

            if (funcionario instanceof Gerente) {
                System.out.println("5 - Gerar relatório financeiro");
                System.out.println("6 - Consultar vendas");
            }

            if (funcionario instanceof Vendedor) {
                System.out.println("5 - Realizar venda");
                System.out.println("6 - Consultar vendas");
            }

            if (funcionario instanceof Atendente) {
                System.out.println("5 - Receber pagamento");
                System.out.println("6 - Fechar caixa");
            }

            System.out.println("0 - Logoff");
            System.out.println("============================");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> System.out.println(funcionario.login());
                case 2 -> {
                    System.out.println("Novo nome:");
                    String novoNome = scanner.nextLine();

                    System.out.println("Novo e-mail:");
                    String novoEmail = scanner.nextLine();

                    System.out.println(funcionario.alterarDados(novoNome, novoEmail));
                }
                case 3 -> {
                    System.out.println("Nova senha:");
                    String novaSenha = scanner.nextLine();

                    System.out.println(funcionario.alterarSenha(novaSenha));
                }
                case 4 -> System.out.println("Administrador: " + funcionario.isAdm());
                case 5 -> {
                    if (funcionario instanceof Gerente gerente) {
                        System.out.println(gerente.gerarRelatorioFinanceiro());
                    } else if (funcionario instanceof Vendedor vendedor) {
                        System.out.println(vendedor.realizarVenda());
                    } else if (funcionario instanceof Atendente atendente) {
                        System.out.println("Informe o valor do pagamento:");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.println(atendente.receberPagamento(valor));
                    }
                }
                case 6 -> {
                    if (funcionario instanceof Gerente gerente) {
                        System.out.println(gerente.consultarVendas());
                    } else if (funcionario instanceof Vendedor vendedor) {
                        System.out.println(vendedor.consultarVendas());
                    } else if (funcionario instanceof Atendente atendente) {
                        System.out.println(atendente.fecharCaixa());
                    }
                }
                case 0 -> System.out.println(funcionario.logoff());
                default -> System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        scanner.close();
    }
}