public record Retangulo(double base, double altura) implements FormaGeometrica {

    @Override
    public double getArea() {
        return base * altura;
    }

}
