package figuras;

/**
 * Representa un círculo en un plano cartesiano.
 */
public class Circulo {
    // Atributos encapsulados: centro (x, y) y radio
    private double x;
    private double y;
    private double radio;

    // Constructor por defecto: centro en el origen y radio 1
    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.radio = 1;
    }

    // Constructor con coordenada x; y = 0 y radio = 1
    public Circulo(double x) {
        this.x = x;
        this.y = 0;
        this.radio = 1;
    }

    // Constructor con coordenadas x e y; radio = 1
    public Circulo(double x, double y) {
        this.x = x;
        this.y = y;
        this.radio = 1;
    }

    // Constructor completo: coordenadas y radio
    public Circulo(double x, double y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    // Área: π * r^2
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Perímetro: 2 * π * r
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Mueve el círculo solo sobre el eje X
    public void moverX(double unidades) {
        this.x += unidades;
    }

    // Mueve el círculo solo sobre el eje Y
    public void moverY(double unidades) {
        this.y += unidades;
    }

    // Mueve el círculo en ambos ejes
    public void moverXY(double unidadesX, double unidadesY) {
        this.x += unidadesX;
        this.y += unidadesY;
    }

    // Muestra el estado actual del círculo en consola
    public void dibujar() {
        System.out.println("Círculo -> X: " + x + ", Y: " + y + ", Radio: " + radio);
    }

    // Getters y setters para consultar y cambiar x, y y radio
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}