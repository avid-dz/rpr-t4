package ba.unsa.etf.rpr.tutorijal04;

public class Predmet {

    private String nazivPredmeta;
    private int brojECTS;
    private boolean obavezan;

    public Predmet(String nazivPredmeta, int brojECTS, boolean obavezan) {
        this.nazivPredmeta = nazivPredmeta;
        this.brojECTS = brojECTS;
        this.obavezan = obavezan;
    }

    public String dajNazivPredmeta() {
        return nazivPredmeta;
    }
    public int dajBrojECTS() {
        return brojECTS;
    }
    public boolean daLiJeObavezan() {
        return obavezan;
    }
    public void ispisiSpisakStudenata() {

    }
}
