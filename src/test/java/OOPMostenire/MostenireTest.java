package OOPMostenire;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MostenireTest {

    @Test
    public void MetodaTest(){
        //facem un obiect Dacia
        System.out.println("====obiecteDacia====");
        List<String> DotariExterioareLogan= Arrays.asList("geamuri electrice", "aer conditionat");
        Dacia Logan = new Dacia("Dacia", "Logan", "manuala", 10000, "alb metalizat", DotariExterioareLogan);
        Logan.InfoDacia();
        Logan.CalculPretFinal();
        Logan.ConducMasina();

        List<String> DotariExterioareSandero= Arrays.asList("incalzire scaune", "volan incalzit");
        Dacia Sandero = new Dacia("Dacia", "Sandero", "automata", 15000, "magenta", DotariExterioareSandero);
        Sandero.InfoDacia();

        List<String> DotariExterioareDokker= Arrays.asList("scaune incalzite", "volan incalzit");
        Dacia Dokker = new Dacia("Dacia", "Dokker", "automata", 20000, "rosu", DotariExterioareDokker);
        Dokker.InfoDacia();


        System.out.println("====obiecteAudi====");
        List<String> DotariExterioareA3= Arrays.asList("geamuri electrice", "aer conditionat");
        List<String> DotariInterioareA3= Arrays.asList("geamuri electrice", "aer conditionat");
        Audi A3 = new Audi("Audi", "A3", "manuala", 14000, DotariExterioareA3, DotariInterioareA3);
        A3.InfoAudi();
        A3.ConducMasina();

        List<String> DotariExterioareQ7= Arrays.asList("geamuri electrice", "aer conditionat");
        List<String> DotariInterioareQ7= Arrays.asList("geamuri electrice", "aer conditionat");
        Audi Q7 = new Audi("Audi", "Q7", "automata", 25000, DotariExterioareQ7, DotariInterioareQ7);
        Q7.InfoAudi();

        System.out.println("===obiecteBMW===");
        BMV Seria2 = new BMV("BMW", "Seria2", "manuala", 90000,  false);
        Seria2.InfoBMW();
        Seria2.AfisareMasini("masina");
        Seria2.AfisareMasini(123);
    }
}
