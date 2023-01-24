package Tema;

import java.util.List;

public class Tema5 {
    public String Titlu;
    public String NumeAutor;
    public Integer AnPublicare;
    public String Categorie;
    public List<String> Caracteristici;


    public Tema5(String titlu, String numeAutor, Integer anPublicare, String categorie, List<String> caracteristici) {
        Titlu = titlu;
        NumeAutor = numeAutor;
        AnPublicare = anPublicare;
        Categorie = categorie;
        Caracteristici = caracteristici;
    }

    public void VechimeCarte() {
        if(AnPublicare>=2021){
            System.out.println("Carte publicata recent: ");
        }
       if (AnPublicare<2021 && AnPublicare>=2010){
           System.out.println("Cartea se gaseste la biblioteca ");
       }
       if (AnPublicare<2010){
           System.out.println("Cartea se gaseste la anticariat ");
       }

    }
}
