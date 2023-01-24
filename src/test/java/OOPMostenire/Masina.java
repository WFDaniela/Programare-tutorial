package OOPMostenire;

public class Masina {
    //OOP = Object Oriented Programming
    //4 concepte = mostenire, abstractizare, incapsulare, polimorfism
    //Mostenire= conceptul prin care o clasa mosteneste o alta clasa (bunic<-nepoti)
    //Clasa care mosteneste se numeste clasa copil
    //Clasa care este mostenita se numeste clasa parinte
    //Mostenirea se face cu cuvantul 'extends'
    //In Java o clasa poate sa mosteneasca o singura clasa
    //In momentul in care o clasa mosteneste o alta clasa==> trebuie sa apelam prima data constructorul din parinte
    //In momentul in care o clasa mosteneste o alta clasa==>putem accesa orice variabila/metode din clasa parinte


    //Aplicam conceptul de incapsulare a datelor
    //Incapsularea datelor = conceptul prin care tinem departe de exterior valorile variabilelor pe care nu vrem sa le modificam
    //Private = acces control care restrictioneaza vizibilitatea variabilei la nivel de clasa unde este declarata
    //Ca sa accesam/modificam valorile unor variabile private ne folosim de conceptul GET si SET

    //Polimorfismul = conceptul prin care o metoda poate avea mai multe forme
    //Polimorfismul poate fi dinamic si static
    //Dinamic(override) si static (overload)
    //Polimorfism dinamic = Intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea mai multe implementari
    //Polimorfismul dinamic se aplica mereu cu mostenirea
    //Polimorfismul static = o metoda se poate diferentia prin numarul sau tipul parametriilor

    private   String Brand;
    private String Model;
    private String Transmisie;
    private Integer Pret;

    public Masina(String brand, String model, String transmisie, Integer pret) {
        Brand = brand;
        Model = model;
        Transmisie = transmisie;
        Pret = pret;
    }



    //GET SET


    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public String getTransmisie() {
        return Transmisie;
    }

    public Integer getPret() {
        return Pret;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setTransmisie(String transmisie) {
        Transmisie = transmisie;
    }

    public void InfoMasina(){
        System.out.println("Brandul masinii este: " +Brand);
        System.out.println("Modelul masinii este: " +Model);
        System.out.println("Transmisia masinii este: " +Transmisie);
        System.out.println("Pretul masinii este:" +Pret);
    }

    //Polimorfism dinamic
    public void ConducMasina(){
        System.out.println("Masina se poate conduce ");
    }
}
