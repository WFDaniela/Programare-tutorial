package AbstractizareInterfete;

public class AngajatStudent extends Persoana implements InterfaceAngajat, InterfaceStudent {


    public AngajatStudent(String nume, String adresa, Integer varsta) {
        super(nume, adresa, varsta);
    }

    @Override
    public void Munceste() {
        System.out.println("Angajatul student invata si munceste");

    }

    @Override
    public void PrimesteSalar() {
        System.out.println("Angajatul student invata si primeste salar");

    }

    @Override
    public void MergeAcasa() {
        System.out.println("Angajatul student merge acasa");

    }

    @Override
    public void Invata() {
        System.out.println("Angajatul student invata ");
    }

    @Override
    public void Doarme() {
        System.out.println("Angajatul student invata si doarme");

    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Angajatul student invata si primeste bani");

    }
}
