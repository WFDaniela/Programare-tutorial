package Tema;

import org.testng.annotations.Test;

public class Tema2 {

    public String Mesaj;
    public Integer Varsta;
    public String Nume;
    public String Prenume;
    public String Data;
    public String Ora;
    public String Ziua;
    public String Calcul;
    public Float Primul;
    public Float AlDoilea;
    public Float AlTreilea;
    public Float AlPatrulea;
    public Float AlCincelea;
    public Float Rezultat;
    public Double Element1;
    public Double Element2;
    public Double Element3;
    public Integer Numar1;
    public Integer Numar2;
    public String Mesaj1;
    public Character CaracterAdaugat;
    public Character CaracterAdaugat1;
    public String MesajIncheiere;
    public Character CaracterAdaugat2;

    public String Valoare1;
    public String Valoare2;
    public String Valoare3;

    @Test
    public void CerinteTema(){

        Mesaj = "Hello world";
        Varsta = 30;
        Nume = "Solomon";
        Prenume = "Daniela";
        Data = "12/20/2022  ";
        Ora = "18:30PM  ";
        Ziua = "Marti";
        Primul = 3.0f;
        AlDoilea = 4.0f;
        AlTreilea = 2.0f;
        AlPatrulea = 3.0f;
        AlCincelea = 3.0f;
        Rezultat = (AlTreilea  + Primul * AlDoilea - AlPatrulea)/AlCincelea;
        Element1 = 1.52;
        Element2 = 1.47;
        Element3 = 1.35;
        Numar1 = 20;
        Numar2 = 2;
        Mesaj1 = "//Stiu ca am calculat bine";
        CaracterAdaugat = 'M';
        CaracterAdaugat1 = 'H';
        MesajIncheiere = "//Poti pleca acasa dupa ce iti verific munca!";
        CaracterAdaugat2 = 'Z';

        System.out.println("Mesaj: " + Mesaj + " " +MesajIncheiere);
        System.out.println("Varsta mea este: " + Varsta + " " +MesajIncheiere);
        System.out.println("Numele meu este: " + Nume + " " +" " +MesajIncheiere);
        System.out.println("Prenumele meu este: " + Prenume + " " +MesajIncheiere);
        System.out.println("Data de astazi este: " + Data +"" + Ora +"" + Ziua + " " +MesajIncheiere);
        System.out.println("Rezultatul corect este: " + Rezultat + " " +MesajIncheiere);
        System.out.println("Suma celor trei numere de tip double este: " + (Element1 + Element2 + Element3 ) + " "   + Mesaj1 + " " +MesajIncheiere);
        System.out.println("Produsul celor doua numere de tip integer este: " + (Numar1 * Numar2) + " "   +Mesaj1 + " " +MesajIncheiere);
        System.out.println("Salut" + CaracterAdaugat + " " +MesajIncheiere);
        System.out.println( CaracterAdaugat1 + "Hello" + " " +MesajIncheiere);
        System.out.println("Ana" + CaracterAdaugat2 + " are" + CaracterAdaugat2 + " mere" + CaracterAdaugat2 + " ,pere" + CaracterAdaugat2 + " ,prune" + CaracterAdaugat2);
        System.out.println("Rezultatul corect este: " + (2+(3*4)-3)/3f);

        VerificareSuma(3,6,8);
        VerificareSuma(1,2,7);
    }

    public void VerificareSuma(Integer a, Integer b, Integer c){
        Integer Suma = a+b;

        if ((a+b)>c){
            System.out.println("Suma primelor doua numere este mai mare decat al treilea numar: " + Suma );
        }
        else {
            System.out.println("Suma primelor doua numere este mai mica decat al treilea numar: " +Suma);
        }



        }
}
