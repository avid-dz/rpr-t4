package ba.unsa.etf.rpr.tutorijal04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultetTest {

    @Test
    void dodajPredmetNaFakultet() {
        Fakultet f = new Fakultet();
        assertDoesNotThrow(
                () -> {
                    f.dodajPredmetNaFakultet(new Predmet("DM", 5, true));
                    f.dodajPredmetNaFakultet(new Predmet("DM", 5, false));
                }
        );
    }

    @Test
    void dodajStudentaNaFakultet() {
        Fakultet f = new Fakultet();
        assertDoesNotThrow(
                () -> {
                    f.dodajStudentaNaFakultet(new Student("Meho Mehovic", 19197));
                    f.dodajStudentaNaFakultet(new Student("Meho Mehovic", 19999));
                }
        );
    }

    @Test
    void upisi() {
        Fakultet f = new Fakultet();
        Student s = new Student("Amir Amirovic", 19192);
        Predmet p1 = new Predmet("Fizika", 6, true);
        Predmet p2 = new Predmet("MLTI", 7, true);
        PlanStudija planStudija = new PlanStudija("PS1");
        assertDoesNotThrow(
                () -> {
                    f.upisi(s, p1, planStudija);
                    f.upisi(s, p2, planStudija);
                }
        );
    }
}