package AbstractizareInterfete;

public class Persoana {

    //Abstractizare = conceptul prin care definim comportamentul unei clase
    //Acest concept se poate realiza in JAVA cu interfete sau clase abstracte
    //Interfata = colectie de metode care sunt doar abstracte (nu au body)
    //Recunoastem o interfata dupa cuvantul <Interface>
    //Intr-o interfata nu avem un constructor==> nu putem face un obiect
    //Clasa care implementeaza interfata ==> trebuie sa implementeze toate metodele interfetei
    //O clasa abstracta poate sa implementeze o interfata
    //O clasa poate sa implementeze n interfete
    //O interfata poate sa mosteneasca o alta interfata
    //Toate metodele dintr-o interfata sunt publice

    private String Nume;
    private  String Adresa;
    private Integer Varsta;

    public Persoana(String nume, String adresa, Integer varsta) {
        Nume = nume;
        Adresa = adresa;
        Varsta = varsta;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getAdresa() {
        return Adresa;
    }

    public void setAdresa(String adresa) {
        Adresa = adresa;
    }

    public Integer getVarsta() {
        return Varsta;
    }

    public void setVarsta(Integer varsta) {
        Varsta = varsta;
    }
}
