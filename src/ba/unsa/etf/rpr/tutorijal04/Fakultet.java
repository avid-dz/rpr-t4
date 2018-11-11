package ba.unsa.etf.rpr.tutorijal04;

import java.util.Set;
import java.util.TreeSet;

public class Fakultet {

    private Set<Predmet> skupSvihPredmeta;
    private Set<Student> skupSvihStudenata;
    private Set<Upis> upisani;

    public Fakultet() {
        skupSvihPredmeta = new TreeSet<>();
        skupSvihStudenata = new TreeSet<>();
        upisani = new TreeSet<>();
    }

    public void dodajPredmetNaFakultet(Predmet predmet) {
        skupSvihPredmeta.add(predmet);
    }
    public void dodajStudentaNaFakultet(Student student) {
        skupSvihStudenata.add(student);
    }
    public void upisi(Student student, Predmet predmet, PlanStudija planStudija) {
        upisani.add(new Upis(student, predmet, planStudija));
        skupSvihPredmeta.add(predmet);
        skupSvihStudenata.add(student);
    }
    public void ispisiSpisakStudenataNaPredmetu(Predmet predmet) {
        for (Upis upis : upisani) {
            if (upis.getPredmet().equals(predmet)) {
                System.out.println(upis.getStudent().ispisi());
            }
        }
    }
    public void ispisiSpisakPredmetaNaFakultetu() {
        for (Upis upis : upisani) {
            System.out.println(upis.getPredmet().ispisi());
        }
    }
    public void ispisiSpisakStudenataNaFakultetu() {
        for (Upis upis : upisani) {
            System.out.println(upis.getStudent().ispisi());
        }
    }
}
