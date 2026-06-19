public class Vendedor extends Funcionario {
    private int numeroVendas;

    public Vendedor(){
        super(false);
        this.numeroVendas = 0;
    }

    public int getNumeroVendas() {
        return numeroVendas;
    }
    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

    public String realizarVenda(){
        this.numeroVendas++;
        return "Venda realizada com sucesso! Total de vendas: " + numeroVendas;
    }
    public String consultarVendas(){
        return "Total de vendas: " + numeroVendas;
    }
}
