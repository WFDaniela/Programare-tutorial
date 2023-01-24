package AbstractizareClasaAbstracta;

public abstract class Persoana {
    //O clasa abstracta poate sau nu sa contina metode abstracte
    //Clasa care mosteneste clasa abstracta==> implementeaza toate metodele abstracte
    //Putem mosteni o singura clasa abstracta
    //O clasa abstracta poate implementa o interfata
    //Intr-o clasa abstracta poti avea un constructor==> nu putem face un obiect
    //Intr-o clsa abstracta putem avea metode public, private, protected
    //Metodele abstracte trebuie sa contina cuvantul abstract

    //Definim metode abstracte
    public abstract void Munceste();
    public abstract void PrimesteSalar();
    public abstract void MergeLaCurs();
    public abstract void PrimesteBursa();

    //definim metode simple
    public void Curs(){
        System.out.println("metoda simpla");
    }



}
