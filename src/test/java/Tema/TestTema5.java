package Tema;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestTema5 {

    @Test
    public void MetodeTest(){
        List<String> CaracteristiciDragosteaInVremeaHolerei= Arrays.asList("pagini: 300", "poze: da");
        Tema5 DragosteaInVremeaHolerei = new Tema5("Dragoste in vremea holerei", "G.G Marquez", 2010, "beletristica", CaracteristiciDragosteaInVremeaHolerei);
        DragosteaInVremeaHolerei.VechimeCarte();

        List<String> CaracteristiciDaneza= Arrays.asList("pagini: 374", "poze: nu");
        Tema5 Daneza = new Tema5("Daneza", "David Ebershoff", 2000, "fictiune", CaracteristiciDaneza);
        Daneza.VechimeCarte();

    }
}
