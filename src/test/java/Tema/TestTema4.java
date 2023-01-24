package Tema;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class TestTema4 {
    @Test
    public void MetodaTest()
    {
      List<String> pieseAlbumMozart = Arrays.asList("Nunta lui Figaro", "Don Juan", "Flautul magic", "Simfonia nr.40");
      Tema4 albumMozart = new Tema4("clasic", "Mozart", 1985, pieseAlbumMozart);
      albumMozart.InfoAlbum();

      List<String> pieseAlbumPop = Arrays.asList("Earth Song", "Thriller", "Dirty Diana", "You are not alone");
      Tema4 albumPop = new Tema4("pop", "Michael Jackson", 1988, pieseAlbumPop);
      albumPop.InfoAlbum();

      List<String> pieseAlbumRock = Arrays.asList("I want to break free", "Bohemian Rapsody", "Mamma Mia ", "Radio Ga Ga");
      Tema4 albumRock = new Tema4("rock", "Queen", 1982, pieseAlbumRock);
      albumRock.InfoAlbum();
    }
}
