package ba.unsa.etf.rpr.tutorijal04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fakultet f = new Fakultet();
        int opcija;
        Scanner scan = new Scanner(System.in);
        String uneseniNazivPredmeta = "";
        int uneseniBrojECTS;
        String unesenoImeStudenta = "";
        String unesenoPrezimeStudenta = "";
        String unesenaObaveznost = "";
        int uneseniBrojIndexa;
        while (true) {
            System.out.println("Izaberite opciju (0 za kraj): ");
            System.out.println("1 - Dodavanje predmeta na fakultet");
            System.out.println("2 - Upis studenta na fakultet");
            System.out.println("3 - Upis studenta na predmet po odredjenom planu studija");
            System.out.println("4 - Ispis spiska studenata na odredjenom predmetu");
            opcija = scan.nextInt();
            if (opcija == 0) break;
            switch (opcija) {
                case 1:
                    System.out.print("Unesite naziv predmeta: ");
                    uneseniNazivPredmeta = scan.next();
                    System.out.print("Unesite broj ECTS: ");
                    uneseniBrojECTS = scan.nextInt();
                    System.out.print("Da li je predmet obavezan (unesite O) ili izborni (unesite I)?");
                    unesenaObaveznost = scan.next();
                    if (unesenaObaveznost.equals("O")) {
                        f.dodajPredmetNaFakultet(new Predmet(uneseniNazivPredmeta, uneseniBrojECTS, true));
                    }
                    else {
                        f.dodajPredmetNaFakultet(new Predmet(uneseniNazivPredmeta, uneseniBrojECTS, false));
                    }
                    System.out.println("Predmet uspjesno dodan na fakultet.");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Unesite ime studenta: ");
                    unesenoImeStudenta = scan.next();
                    System.out.print("Unesite prezime studenta: ");
                    unesenoPrezimeStudenta = scan.next();
                    System.out.print("Unesite broj indexa studenta: ");
                    uneseniBrojIndexa = scan.nextInt();
                    f.dodajStudentaNaFakultet(new Student((unesenoImeStudenta + " " + unesenoPrezimeStudenta),
                            uneseniBrojIndexa));
                    System.out.println("Student uspjesno upisan na fakultet.");
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Unesite naziv plana studija: ");
                    String uneseniNazivPlanaStudija = scan.next();
                    System.out.print("Unesite ime studenta: ");
                    unesenoImeStudenta = scan.next();
                    System.out.print("Unesite prezime studenta: ");
                    unesenoPrezimeStudenta = scan.next();
                    System.out.print("Unesite broj indexa studenta: ");
                    uneseniBrojIndexa = scan.nextInt();
                    System.out.print("Unesite naziv predmeta: ");
                    uneseniNazivPredmeta = scan.next();
                    System.out.print("Unesite broj ECTS: ");
                    uneseniBrojECTS = scan.nextInt();
                    System.out.print("Da li je predmet obavezan (unesite O) ili izborni (unesite I)?");
                    unesenaObaveznost = scan.next();
                    Student s = new Student((unesenoImeStudenta + " " + unesenoPrezimeStudenta), uneseniBrojIndexa);
                    Predmet pr = null;
                    PlanStudija ps = new PlanStudija(uneseniNazivPlanaStudija);
                    if (unesenaObaveznost.equals("O")) {
                        pr = new Predmet(uneseniNazivPredmeta, uneseniBrojECTS, true);
                    }
                    else {
                        pr = new Predmet(uneseniNazivPredmeta, uneseniBrojECTS, false);
                    }
                    f.upisi(s, pr, ps);
                    System.out.println("Upisivanje uspjesno.");
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Unesite naziv predmeta: ");
                    uneseniNazivPredmeta = scan.next();
                    System.out.print("Unesite broj ECTS: ");
                    uneseniBrojECTS = scan.nextInt();
                    System.out.print("Da li je predmet obavezan (unesite O) ili izborni (unesite I)?");
                    unesenaObaveznost = scan.next();
                    Predmet p = null;
                    if (unesenaObaveznost.equals("O")) {
                        p = new Predmet(uneseniNazivPredmeta, uneseniBrojECTS, true);
                    }
                    else {
                        p = new Predmet(uneseniNazivPredmeta, uneseniBrojECTS, false);
                    }
                    f.ispisiSpisakStudenataNaPredmetu(p);
                    System.out.println();
                    break;
            }
        }
    }
}
