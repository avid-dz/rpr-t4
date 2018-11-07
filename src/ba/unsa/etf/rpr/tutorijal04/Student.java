package ba.unsa.etf.rpr.tutorijal04;

public class Student {

    private String imePrezime;
    private int brojIndeksa;

    public Student(String imePrezime, int brojIndeksa) {
        this.imePrezime = imePrezime;
        this.brojIndeksa = brojIndeksa;
    }

    public String dajImePrezime() {
        return imePrezime;
    }
    public int dajBrojIndeksa() {
        return brojIndeksa;
    }
    public void ispisiPodatke() {
        System.out.println("Student " + imePrezime + " sa brojem indeksa " + (brojIndeksa));
    }
}
