package modell;

public class Gomb extends FaIdom {

    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double terfogat() {

        return 4 * (sugar * 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Gomb{" + "sugar=" + sugar + '}';
    }

}
