public class Triangulo extends Figura{
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base) {
        this.base = base;
    }

    public double area() {
        return (base*altura)/2;
    }

    public double perimetro() {
        return lado1+lado2+lado3;}
    }



