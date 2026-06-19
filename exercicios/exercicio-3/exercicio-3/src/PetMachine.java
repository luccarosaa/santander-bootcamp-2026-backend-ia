public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet para iniciar o banho");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade de água está no máximo");
            return;
        }

        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo está no máximo");
            return;
        }

        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet){
        if (!this.clean){
            System.out.println("A máquina está suja, para colocar o pet é necessário limpá-la");
            return;
        }

        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento");
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");
    }

    public void removePet(){
        this.clean = this.pet.isClean();

        System.out.println("O pet " + this.pet.getName() + " foi tirado da máquina");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi limpa");
    }

}





/*
Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
    * Consultar saldo
    * Consultar cheque especial
    * Depositar dinheiro;
    * Sacar dinheiro;
    * Pagar um boleto.
    * Verificar se a conta está usando cheque especial.

Siga as seguintes regras para implementar:
    * A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
    * O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor
    depositado na conta em sua criação;
    * Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
    * Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
    * Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do
    valor usado do cheque especial.
 */
























