public class Rectáangulo extends Figura {
    private double base;
    private double altura;

    public void Rectáangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return base*altura;
    }

    public double perimetro() {
        return (2*base)+(2*altura);
    }
}

