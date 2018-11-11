package ba.unsa.etf.rpr.tutorijal04;

public class Student implements Comparable<Student> {

    private String imePrezime;
    private int brojIndeksa;

    public Student(String imePrezime, int brojIndeksa) {
        this.imePrezime = imePrezime;
        this.brojIndeksa = brojIndeksa;
    }

    public String getImePrezime() {
        return imePrezime;
    }
    public int getBrojIndeksa() {
        return brojIndeksa;
    }
    public String ispisi() {
        return "Student " + getImePrezime() + " sa brojem indeksa " + getBrojIndeksa();
    }

    @Override
    public int compareTo(Student o) {
        return ispisi().compareTo(o.ispisi());
    }
}
