package ba.unsa.etf.rpr.tutorijal04;

public class Predmet implements Comparable<Predmet> {

    private String nazivPredmeta;
    private int brojECTS;
    private boolean obavezan;

    public Predmet(String nazivPredmeta, int brojECTS, boolean obavezan) {
        this.nazivPredmeta = nazivPredmeta;
        this.brojECTS = brojECTS;
        this.obavezan = obavezan;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }
    public int getBrojECTS() {
        return brojECTS;
    }
    public void setBrojECTS(int brojECTS) {
        this.brojECTS = brojECTS;
    }
    public boolean isObavezan() {
        return obavezan;
    }
    public void setObavezan(boolean obavezan) {
        this.obavezan = obavezan;
    }
    public String ispisi() {
        if (obavezan) {
            return "Obavezni predmet " + getNazivPredmeta() + " sa " + getBrojECTS() + " ECTS";
        }
        return "Izborni predmet " + getNazivPredmeta() + " sa " + getBrojECTS() + " ECTS";
    }

    @Override
    public int compareTo(Predmet o) {
        return ispisi().compareTo(o.ispisi());
    }

    public boolean equals(Predmet predmet) {
        return nazivPredmeta.equals(predmet.nazivPredmeta)
                && brojECTS == predmet.brojECTS
                && obavezan == predmet.obavezan;
    }
}
