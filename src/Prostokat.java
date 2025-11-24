public class Prostokat {

    // 1. Pola prywatne
    private double szerokosc;
    private double wysokosc;

    // 2. Konstruktory

    /**
     * Konstruktor przyjmujący wartości szerokości i wysokości.
     * Wykorzystuje settery do walidacji danych wejściowych.
     *
     * @param szerokosc Szerokość prostokąta.
     * @param wysokosc Wysokość prostokąta.
     */
    public Prostokat(double szerokosc, double wysokosc) {
        setSzerokosc(szerokosc);
        setWysokosc(wysokosc);
    }

    /**
     * Konstruktor bezparametrowy, ustawiający domyślne boki na 1.0.
     */
    public Prostokat() {
        this(1.0, 1.0);
    }

    // 3. Metody publiczne

    /**
     * Oblicza pole prostokąta.
     *
     * @return Pole prostokąta.
     */
    public double obliczPole() {
        return this.szerokosc * this.wysokosc;
    }

    /**
     * Oblicza obwód prostokąta.
     *
     * @return Obwód prostokąta.
     */
    public double obliczObwod() {
        return 2 * (this.szerokosc + this.wysokosc);
    }

    // Gettery i settery z walidacją

    /**
     * Zwraca aktualną szerokość prostokąta.
     *
     * @return Aktualna szerokość.
     */
    public double getSzerokosc() {
        return szerokosc;
    }

    /**
     * Ustawia nową szerokość prostokąta. Wartość musi być większa od 0.
     * Jeśli wartość jest nieprawidłowa, wyświetla komunikat błędu.
     *
     * @param szerokosc Nowa szerokość.
     */
    public void setSzerokosc(double szerokosc) {
        if (szerokosc > 0) {
            this.szerokosc = szerokosc;
        } else {
            System.out.println("Błąd walidacji: Szerokość musi być > 0.");
        }
    }

    /**
     * Zwraca aktualną wysokość prostokąta.
     *
     * @return Aktualna wysokość.
     */
    public double getWysokosc() {
        return wysokosc;
    }

    /**
     * Ustawia nową wysokość prostokąta. Wartość musi być większa od 0.
     * Jeśli wartość jest nieprawidłowa, wyświetla komunikat błędu.
     *
     * @param wysokosc Nowa wysokość.
     */
    public void setWysokosc(double wysokosc) {
        if (wysokosc > 0) {
            this.wysokosc = wysokosc;
        } else {
            System.out.println("Błąd walidacji: Wysokość musi być > 0.");
        }
    }
}
