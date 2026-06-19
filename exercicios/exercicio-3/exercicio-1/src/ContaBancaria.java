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


public class ContaBancaria {
    private float saldo = 0;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    private boolean chequeEspecial = false;

    public boolean getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(boolean chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    private double valorChequeEspecial;

    public ContaBancaria(float valorInicial){
        saldo = valorInicial;
        if (valorInicial <= 500){
            valorChequeEspecial = 50;
        } else {
            valorChequeEspecial = valorInicial * 0.5;
        }
    }

    public void consultarChequeEspecial() {
        var consulta = valorChequeEspecial;

        if (saldo < 0){
            consulta = valorChequeEspecial + saldo;
        }

        System.out.println("Seu cheque especial disponível: R$ " + consulta);
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo atual é de: R$ " + getSaldo());
    }

    public void verificarChequeEspecial() {
        if (saldo < 0){
            chequeEspecial = true;
            System.out.println("A conta está em cheque especial");
            return;
        }

        System.out.println("A conta não está em cheque especial");
        chequeEspecial = false;
    }

    public void pagarBoleto() {
        System.out.println("Informe o valor do boleto:");
        var boleto = Main.scanner.nextFloat();
        var pagamento = getSaldo() - boleto;

        if (pagamento < -(valorChequeEspecial)){
            System.out.println("Erro: saldo insuficiente para o valor do boleto");
        } else {
            setSaldo(pagamento);
            verificarChequeEspecial();
        }
    }

    public void depositarDinheiro(){
        System.out.println("Informe o valor a ser depositado:");
        var deposito = Main.scanner.nextFloat();
        deposito += saldo;

        if (chequeEspecial && deposito > -(saldo)){
            var taxa = -(saldo) * 0.2;
            System.out.println("Foi cobrada uma taxa de 20%, pois sua conta estava em Cheque Espacial.");
            System.out.println("Valor cobrado: R$ " + taxa);
            deposito -= taxa;
        }

        setSaldo(deposito);

        if (saldo >= 0) {
            chequeEspecial = false;
        }
    }

    public void sacarDinheiro(){
        System.out.println("Informe o valor a ser sacado:");
        var sacado = Main.scanner.nextFloat();
        var saldo = getSaldo();
        saldo -= sacado;

        if (saldo < (-valorChequeEspecial)){
            System.out.println("Erro: saldo insuficiente para o valor do saque");
        } else {
            setSaldo(saldo);
            verificarChequeEspecial();
        }
    }

}
