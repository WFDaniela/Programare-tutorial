package Tema;


import org.testng.annotations.Test;

public class Tema1 {

    //Definesc cateva atribute pentru calculator
    //Metoda unde sa atribuim valori


    public String DeviceName;
    public String Procesor;
    public Float InstalledRAM;
    public String DeviceId;
    public String ProductId;
    public Integer SystemType;
    public Boolean PenAndTouch;


    @Test
    public void CaracteristiciCalculator()
    {

       DeviceName = "LT-B40DCK3";
       Procesor = "11th Gen Intel(R) Core(TM) i7-11850H @ 2.50GHz   2.50 GHz";
       InstalledRAM = 32.0f;
       DeviceId = "C493ECF6-DC18-400E-9F0A-10C8414BC602";
       ProductId = "00330-54126-98708-AAOEM";
       SystemType = 64;
       PenAndTouch = false;


       System.out.println("Numele deviceului este: " + DeviceName);
       System.out.println("Procesor: " + Procesor);
       System.out.println("Memorie RAM: " + InstalledRAM);
       System.out.println("Id-ul calculatorului este: " + DeviceId);
       System.out.println("Id-ul de productie este: " +ProductId);
       System.out.println("Tipul de sistem este: " +SystemType);
       System.out.println("Touch screen: " + PenAndTouch);
       System.out.println("Rezultatul corect este: " + (2+3*4-3)/3f);









    }


}
