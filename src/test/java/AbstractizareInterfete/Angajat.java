package AbstractizareInterfete;

public class Angajat extends Persoana implements InterfaceAngajat {


    public Angajat(String nume, String adresa, Integer varsta) {
        super(nume, adresa, varsta);
    }

    @Override
    public void Munceste() {
        System.out.println("Angajatul trebuie sa lucreze 8h/zi");

    }

    @Override
    public void PrimesteSalar() {
        System.out.println("Angajatul este platit la sfarsitul lunii");

    }

    @Override
    public void MergeAcasa() {
        System.out.println("La sfarsitul programului pleaca acasa");
    }
}
