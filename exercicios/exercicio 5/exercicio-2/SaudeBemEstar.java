public record SaudeBemEstar(double valor) implements CalcularTributo {

    @Override
    public double calcularTributo() {
        return valor * 0.015;
    }

}
