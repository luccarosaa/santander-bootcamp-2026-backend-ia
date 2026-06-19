public class Atendente extends Funcionario {
    private double valorCaixa;

    public Atendente(){
        super(false);
        this.valorCaixa = 0.0;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }
    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

    public String receberPagamento(double valor){
        this.valorCaixa += valor;
        return "Pagamento recebido: R$ " + String.format("%.2f", valor) +
                " | Total em caixa: R$ " + String.format("%.2f", this.valorCaixa);
    }
    public String fecharCaixa(){
        String resultado = "Fechando o caixa... Total em caixa: R$ " +
                String.format("%.2f", this.valorCaixa);
        this.valorCaixa = 0.0;
        return resultado;
    }
}
