public class Gerente extends Funcionario {
    public Gerente() {
        super(true);
    }

    public String gerarRelatorioFinanceiro() {
        return "Relatório financeiro gerado com sucesso!";
    }

    public String consultarVendas() {
        return "Consultando vendas... Total de vendas: 150";
    }
}
