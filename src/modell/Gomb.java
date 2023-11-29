package modell;

public class Gomb extends FaIdom {

    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    public double terfogat() {

        return 0;
    }

    @Override
    public String toString() {
        return "Gomb{" + "sugar=" + sugar + '}';
    }

}
