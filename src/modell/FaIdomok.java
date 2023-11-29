package modell;

import java.util.ArrayList;
import java.util.List;

public class FaIdomok {

    private List<FaIdom> faidomok;

    public FaIdomok() {
        faidomok = new ArrayList<FaIdom>();

        faidomok.add(new Gomb(1));
        faidomok.add(new Hasab(1, 1, 2));
        faidomok.add(new Gomb(2));
        faidomok.add(new Hasab(2, 2, 3));
        faidomok.add(new Gomb(4));
        faidomok.add(new Hasab(4, 4, 6));
        run();
    }

    public void run() {
        for(FaIdom f: faidomok){
            System.out.println(f);
        }
        System.out.println("osszSuly: " + osszSuly());
        System.out.println("osszGombSuly:" + osszGombSuly());
        System.out.println("minV: " + minV().terfogat());
        System.out.println("maxV: " + maxV().terfogat());
    }

    public double osszSuly() {
        double osszSuly = 0;
        for (FaIdom f : faidomok) {
            if (f instanceof FaIdom) {
                osszSuly += ((FaIdom) f).suly();
            }
        }
        return osszSuly;
    }

    public double osszGombSuly() {
        double osszGombSuly = 0;
        for (FaIdom f : faidomok) {
            if (f instanceof Gomb) {
                System.out.println(f);
                osszGombSuly += ((FaIdom) f).suly();
            }
        }
        return osszGombSuly;
    }

    public FaIdom minV() {
        double minErtek = faidomok.get(0).terfogat();
        int minIndex = 0;
        for (int i = 1; i < faidomok.size(); i++) {
            if (faidomok.get(i).terfogat() < minErtek) {
                minErtek = faidomok.get(i).terfogat();
                minIndex = i;
            }
        }

        return faidomok.get(minIndex);
    }

    public FaIdom maxV() {
        double maxErtek = faidomok.get(0).terfogat();
        int maxIndex = 0;
        for (int i = 1; i < faidomok.size(); i++) {
            if (faidomok.get(i).terfogat() > maxErtek) {
                maxErtek = faidomok.get(i).terfogat();
                maxIndex = i;
            }
        }

        return faidomok.get(maxIndex);
    }

}
