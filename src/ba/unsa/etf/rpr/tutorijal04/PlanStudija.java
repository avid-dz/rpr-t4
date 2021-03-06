package ba.unsa.etf.rpr.tutorijal04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PlanStudija {

    private String naziv;
    private Map<Integer, Set<Predmet>> mapaStudija;

    public PlanStudija(String naziv) {
        this.naziv = naziv;
        mapaStudija = new HashMap<>();
    }

    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public void dodajSemestar(Integer redniBroj) {
        mapaStudija.put(redniBroj, new TreeSet<>());
    }
    public void dodajPredmetUSemestar(Integer redniBroj, Predmet predmet) {
        mapaStudija.get(redniBroj).add(predmet);
    }
}
