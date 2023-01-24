package AbstractizareInterfete;

public class Student extends Persoana implements InterfaceStudent {
    public Student(String nume, String adresa, Integer varsta) {
        super(nume, adresa, varsta);
    }

    @Override
    public void Invata() {
        System.out.println("Se pregateste de sesiune");

    }

    @Override
    public void Doarme() {
        System.out.println("La sfarsitul orelor doarme");

    }

    @Override
    public void PrimesteBursa() {
        System.out.println("iese in club");

    }
}
