package VariabilaMetoda;

import org.testng.annotations.Test;

import java.awt.font.NumericShaper;

public class Student {

    //asta e un comentariu
    //clasa = sablon care contine variabile si metode
    //Intr-un fisier Java putem avea mai multe clase diferentiate prin numele lor (nu e un lucru bun sa ai mai multe clase intr-un fisier)
    //O clasa trebuie sa aiba un nume
    //O clasa se recunoaste dupa cuvantul class
    //Tot timpul o clasa trebuie sa fie publica
    //Variabila = atributul unei clase
    //Variabilele sunt de 2 feluri: global si local
    //Variabila globala = este vizibila peste tot in program
    //Variabila locala = este vizibila doar in locul unde o declari




    public String Nume;
    public String Prenume;
    public String Adresa;
    public Integer Varsta;
    public Double Inaltime;
    public Float Greutate;
    public Character Gen;
    public Boolean EsteAngajat;



    //Metoda = actiune la nivel de clasa
    // Metodele sunt de doua feluri: void si return


    @Test
    public void PrezentareStudent()
    {
        Nume = "Solomon";
        Prenume = "Daniela";
        Adresa = "Sibiu Viena nr.2";
        Varsta = 41;
        Inaltime = 1.68;
        Greutate = 70.0f;
        Gen = 'M';
        EsteAngajat = true;

         //Print afiseaza pe tastatura si ramane pe acelasi rand
        //Println afiseaza si sare la randul urmator
        //Daca vrem sa legam doua siruri de caractere folosim conceptul de concatenare (+)

        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenumele studentului este: " + Prenume);
        System.out.println("Adresa este: " + Adresa);
        System.out.println("Varsta este: " + Varsta);
        System.out.println("Inaltimea este: " + Inaltime);
        System.out.println("Greutatea este: " + Greutate);
        System.out.println("Varsta este: " + Varsta);
        System.out.println("Genul este: " + Gen);
        System.out.println("Studentul este angajat?: " + EsteAngajat);

    }
    @Test
    public void AdaugareNume()
    {

        //Declaram o variabila locala

        String Prenume2 = "Maria ";
        Nume = "Solomon ";
        Prenume = "Daniela";

        System.out.println("Numele complet este: " + Nume +" " + Prenume +" " + Prenume2);
        System.out.println("Bonus de Craciun este: " + String.format("%.3f",getBonus()));
    }

//Facem o metoda cu return

    public Double getBonus()
    {
      Double Bonus = 1.000;
      return Bonus;


    }









}
