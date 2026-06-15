public class IngressoFamilia extends Ingresso {
    private int nPessoas;

    public int getNPessoas() {
        return nPessoas;
    }
    public void setNPessoas(int nPessoas) {
        this.nPessoas = nPessoas;
    }

    @Override
    public double getValorReal() {
        double desconto = 0;

        if (nPessoas > 3){
            desconto = valor * nPessoas * 0.05;
        }

        return valor * nPessoas - desconto;
    }
}