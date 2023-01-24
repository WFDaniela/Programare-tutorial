package Tema;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tema4 {

    //Clasa Album cu mai multe obiecte (genuri de muzica) 4-5 obiecte

    public String GenMuzical;
    public String NumeAutor;
    public Integer AnulAparitiei;
    public List<String> Piese;
    public Boolean PretAfisat;

    public Tema4(String genMuzical, String numeAutor, Integer anulAparitiei, List<String> piese)
    {
        this.GenMuzical = genMuzical;
        this.NumeAutor = numeAutor;
        this.AnulAparitiei = anulAparitiei;
        this.Piese = piese;
        this.PretAfisat = true;
    }

    public Tema4(String genMuzical, String numeAutor, Integer anulAparitiei, List<String> piese, Boolean pretAfisat)
    {
        this.GenMuzical = genMuzical;
        this.NumeAutor = numeAutor;
        this.AnulAparitiei = anulAparitiei;
        this.Piese = piese;
        this.PretAfisat = pretAfisat;
    }
    public void InfoAlbum()
    {
        System.out.println("Albumul apartine genului muzical " +GenMuzical);
        System.out.println("Numele cantaretului este " +NumeAutor);
        System.out.println("Anul aparitiei albumului este: " +AnulAparitiei);
        System.out.println("Albumul contine urmatoarele piese " );
        for(Integer index = 0; index < Piese.size(); index++)
        {
            System.out.println(Piese.get(index));
        }

        if(PretAfisat)
        {
            System.out.println("Albumul este pentru mine ");
        }
    }
}
