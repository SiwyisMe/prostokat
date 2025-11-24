/**
 * Klasa testująca dla klasy Prostokat.
 */
public class ProstokatTest {

    public static void main(String[] args) {
        // 1. Utworzenie dwóch obiektów:
        // jeden korzystając z konstruktora bezparametrowego
        Prostokat p1 = new Prostokat();

        // drugi korzystając z konstruktora z parametrami (np. 3.5 i 4.2)
        Prostokat p2 = new Prostokat(3.5, 4.2);

        // 2. Wyświetlenie pola i obwodu dla każdego prostokąta.

        System.out.println("--- Prostokąt 1 (domyślny) ---");
        System.out.println("Szerokość: " + p1.getSzerokosc());
        System.out.println("Wysokość: " + p1.getWysokosc());
        System.out.println("Pole: " + p1.obliczPole());
        System.out.println("Obwód: " + p1.obliczObwod());

        System.out.println("\n--- Prostokąt 2 (parametryzowany) ---");
        System.out.println("Szerokość: " + p2.getSzerokosc());
        System.out.println("Wysokość: " + p2.getWysokosc());
        System.out.println("Pole: " + p2.obliczPole());
        System.out.println("Obwód: " + p2.obliczObwod());
    }
}
