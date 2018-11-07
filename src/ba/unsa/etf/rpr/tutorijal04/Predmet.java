package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Predmet {

    private String nazivPredmeta;
    private int brojECTS;
    private boolean obavezan;
    private ArrayList<Student> nizStudenata;
    private int brojUpisanihStudenata;

    public Predmet(String nazivPredmeta, int brojECTS, boolean obavezan) {
        this.nazivPredmeta = nazivPredmeta;
        this.brojECTS = brojECTS;
        this.obavezan = obavezan;
        nizStudenata = new ArrayList<>();
        brojUpisanihStudenata = 0;
    }

    public void dodajStudenta(Student student) {

    }
    public boolean daLiJeObavezan() {
        return obavezan;
    }
    public void ispisiStudentaSaPredmeta(Student student) {

    }
    public void ispisiSpisakStudenata() {

    }
    public String dajNazivPredmeta() {
        return nazivPredmeta;
    }
    public int dajBrojECTS() {
        return brojECTS;
    }
    public int dajBrojUpisanihStudenata() {
        return brojUpisanihStudenata;
    }
}
