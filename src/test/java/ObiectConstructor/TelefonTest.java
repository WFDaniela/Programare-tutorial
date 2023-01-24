package ObiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TelefonTest {

    @Test
    public  void MetodaTest(){
        //Facem primul obiect de tip telefon
        List<String>CaracteristiciSamsung = Arrays.asList("ecran: 2px", "RAM: 2GB", "procesor:exinos");
        Telefon Samsung = new Telefon("Samsung", "Galaxy S22", 2021, "Android", CaracteristiciSamsung);
        Samsung.VechimeTelefon();
        Samsung.DiscountTelefon(15.0);

        List<String>CaracteristiciIphone = Arrays.asList("ecran: 2px", "RAM: 2GB", "procesor:A16");
        Telefon Iphone = new Telefon("Iphone", "Iphone7", 2016, "IOS", CaracteristiciIphone);
        Iphone.VechimeTelefon();
        Iphone.PretTelefon();

        List<String>CaracteristiciHuawei = Arrays.asList("ecran: 4px", "RAM: 8GB", "procesor:A16", "spatiu stocare: 128gb");
        Telefon Huawei = new Telefon("Huawei", "p20", 2010, "Android", CaracteristiciHuawei, 2055.5);
        Huawei.PretTelefon();
        Huawei.VechimeTelefon();
        Huawei.DiscountTelefon(10.0);



    }


}
