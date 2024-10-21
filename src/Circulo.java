public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return (radio * radio) * 3.1416;
    }

    public double perimetro() {
        return (2 * radio) * 3.1416;
    }
}