package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Semestar {

    private static int minECTS = 30;

    private int redniBrojSemestra;
    private ArrayList<Predmet> nizObaveznihPredmeta;
    private ArrayList<Predmet> nizIzbornihPredmeta;
    private int ukupnoECTS;

    public Semestar(int redniBrojSemestra) {
        this.redniBrojSemestra = redniBrojSemestra;
        nizObaveznihPredmeta = new ArrayList<>();
        nizIzbornihPredmeta = new ArrayList<>();
        ukupnoECTS = 0;
    }

    public void DodajPredmet(Predmet predmet) {

    }
    public void izbaciPredmetIzSemestra(Predmet predmet) {

    }
    public int dajUkupniBrojECTS() {
        return ukupnoECTS;
    }
    public int dajRedniBroj() {
        return redniBrojSemestra;
    }
    public int dajBrojObaveznih() {
        return nizObaveznihPredmeta.size();
    }
    public int dajBrojIzbornih() {
        return nizIzbornihPredmeta.size();
    }
}
