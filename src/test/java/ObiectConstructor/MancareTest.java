package ObiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MancareTest {
    @Test
    public  void metodaTest(){

        //Declaram un obiect de tipul X;

        List <String> IngredienteSupaPui = Arrays.asList("apa", "morcovi", "pui", "taietei");
        Mancare SupaPui = new Mancare("Supa de pui", "Supa de casa", IngredienteSupaPui, 300);
        SupaPui.InfoMancare();


        List <String> IngredienteSarmale = Arrays.asList("varza", "carne", "sare", "orez");
        Mancare Sarmale = new Mancare("Sarmale", "Traditionale", IngredienteSarmale, 1000);
        Sarmale.InfoMancare();

        List <String> IngredienteSarmalePost = Arrays.asList("varza", "ciuperci", "sare", "orez");
        Mancare SarmalePost = new Mancare("SarmalePost", "TraditionalePost", IngredienteSarmalePost, 400);
        SarmalePost.InfoMancare();







    }


}
