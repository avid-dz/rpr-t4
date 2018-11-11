package ba.unsa.etf.rpr.tutorijal04;

public class Upis implements Comparable<Upis> {

    private Student student;
    private Predmet predmet;
    private PlanStudija planStudija;

    public Upis(Student student, Predmet predmet, PlanStudija planStudija) {
        this.student = student;
        this.predmet = predmet;
        this.planStudija = planStudija;
    }

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public Predmet getPredmet() {
        return predmet;
    }
    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }
    public PlanStudija getPlanStudija() {
        return planStudija;
    }
    public void setPlanStudija(PlanStudija planStudija) {
        this.planStudija = planStudija;
    }

    @Override
    public int compareTo(Upis o) {
        return getStudent().getImePrezime().compareTo(o.getStudent().getImePrezime());
    }
}
