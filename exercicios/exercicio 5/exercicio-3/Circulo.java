public record Circulo(double raio) implements FormaGeometrica {

    private static final double pi = 3.14;

    @Override
    public double getArea() {
        return pi * (raio * raio);
    }

}
