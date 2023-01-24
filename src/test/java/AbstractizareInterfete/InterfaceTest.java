package AbstractizareInterfete;

import org.testng.annotations.Test;

public class InterfaceTest {
    @Test
    public void MetodaTest(){

        Angajat Angajat1 = new Angajat("Ionut", "Adresa Test", 40);
        Angajat1.Munceste();

        Student Student1 = new Student("Dana", "Adresa", 20);
        Student1.Invata();

        AngajatStudent AngajatStudent = new AngajatStudent("Maria", "Adresa test", 35);
        AngajatStudent.Munceste();
        AngajatStudent.PrimesteSalar();


    }
}
