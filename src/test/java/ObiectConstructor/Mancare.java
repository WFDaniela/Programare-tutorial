package ObiectConstructor;

import org.testng.annotations.Test;

import java.util.List;

public class Mancare {
    //Constructor = are ca rol sa initializeze variabilele unei clase;
    //Constructorul are mereu acelasi nume cu clasa;
    //Intr-o clasa putem sa avem o multime de constructori (delimitati prin numar/tip parametrii);
    //De cele mai multe ori constructorul este public;
    //Daca intr-o clasa nu am declarat un constructor ==> exista unul by default care nu are parametrii;


    //Obiect = instanta unei clase;
    //Dintr-o clasa putem face o multime de obiecte;
    //Obiectele se diferentiaza prin numele lor;
    //In momentul in care initializam un obiect ==> se apleaza constructorul clasei;


    public String Nume;
    public String Descriere;
    public List<String> Ingrediente;
    public Integer Calorii;
    public Boolean DePost;

    //Declaram un constructor cu parametrii
    public Mancare(String nume, String descriere, List<String> ingrediente, Integer calorii, Boolean dePost) {
        Nume = nume;
        Descriere = descriere;
        Ingrediente = ingrediente;
        Calorii = calorii;
        DePost = dePost;
    }

    public Mancare(String Nume, String Descriere, List<String> Ingrediente, Integer Calorii) {
        this.Nume = Nume;
        this.Descriere = Descriere;
        this.Ingrediente = Ingrediente;
        this.Calorii = Calorii;
        this.DePost = false;
    }

    public void InfoMancare() {
        System.out.println("Numele mancarii este " + Nume);
        System.out.println("Descrierea mancarii: " + Descriere);
        System.out.println("Ingredientele pentru mancare sunt ");

        for (Integer index = 0; index < Ingrediente.size(); index++) {

            System.out.println(Ingrediente.get(index));
        }

        System.out.println("Caloriile pentru mancare sunt " + Calorii);

        if (DePost) {
            System.out.println("Mancarea este de post");
        }
    }
}




