//Repositorio github:https://github.com/lopezperezjuancarlos/EJE010_JCLP
import figuras.Circulo;

public class Main {
    public static void main(String[] args) {
        // Tres instancias con distintos constructores, coordenadas y radios
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(3.0, 4.0);
        Circulo c3 = new Circulo(-2.5, 5.0, 4.5);

        System.out.println("=== ESTADO INICIAL ===");
        c1.dibujar();
        c2.dibujar();
        c3.dibujar();

        // Área y perímetro de cada círculo
        System.out.println("\n=== ÁREA Y PERÍMETRO ===");
        mostrar("Círculo 1", c1);
        mostrar("Círculo 2", c2);
        mostrar("Círculo 3", c3);

        // Pruebas de movimiento en X, en Y y en ambos ejes
        c1.moverX(5.0);
        c2.moverY(-2.0);
        c3.moverXY(2.5, -5.0);

        System.out.println("\n=== TRAS EL MOVIMIENTO ===");
        c1.dibujar();
        c2.dibujar();
        c3.dibujar();
    }

    // Imprime área y perímetro con 4 decimales
    private static void mostrar(String nombre, Circulo c) {
        System.out.printf("%s -> Área: %.4f | Perímetro: %.4f%n",
                nombre, c.calcularArea(), c.calcularPerimetro());
    }
}