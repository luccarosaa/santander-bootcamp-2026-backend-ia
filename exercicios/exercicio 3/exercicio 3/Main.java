/*
    Escreva um código onde temos o controle de banho de um petshop, a maquina de banhos dos pets deve ter as seguintes operações:
        Dar banho no pet;
        Abastecer com água;
        Abastecer com shampoo;
        verificar nivel de água;
        verificar nivel de shampoo;
        verificar se tem pet no banho;
        colocar pet na maquina;
        retirar pet da máquina;
        limpar maquina.

Siga as seguintes regras para implementação

    A maquina de banho deve permitir somente 1 pet por vez;
    Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
    A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
    Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina para permitir a entrada de outro pet;
    A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
    O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;
 */

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var option = -1;

        do {
            System.out.println("=== Escolha uma das opções ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer máquina com água");
            System.out.println("3 - Abastecer máquina com shampoo");
            System.out.println("4 - Varificar água da máquina");
            System.out.println("5 - Varificar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                default -> System.out.println("Opção inválida");
                case 0 -> System.exit(0);
            }

        } while (true);

    }

    private static void setWater(){
        System.out.println("Tentando colocar água na máquina");
        petMachine.addWater();
    }

    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na máquina");
        petMachine.addShampoo();
    }

    private static void checkIfHasPetInMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void verifyShampoo(){
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está no momento com " + amount + " litro(s) de shampoo");
    }

    public static void verifyWater(){
        var amount = petMachine.getWater();
        System.out.println("A máquina está no momento com " + amount + " litro(s) de água");
    }

    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
    }

}
