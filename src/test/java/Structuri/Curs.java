package Structuri;

import org.testng.annotations.Test;

public class Curs {

    //Structurile in programare sunt de 2 feluri: alternative si repetitive
    //Structuri Alternative se pot realiza folosind: if then else, switch case
    //Structuri Repetitive se pot realiza folosind: for, while, do while, for each (loop)

    @Test
     public void MetodaTest(){

        //VerificareNumar(15);
        //VerificareNumar(9);
        //VerificareNumar(10);
        //VerificareNumar(-10);
        //VerificareNumarParPozitiv(4);
        //VerificareNumarParPozitiv(5);
        //VerificareNumarParPozitiv(-2);
        //VerificareNumarParPozitiv(-3);
        //VerificareNumarParPozitiv(0);
        ZiuaSaptamana(4);
        ZiuaSaptamana(2);
        ZiuaSaptamana(5);


    }

  //Verificam daca un nr. este mai mare decat 10

  public void VerificareNumar(Integer Numar){

        if (Numar > 10){
            System.out.println("Numarul este mai mare decat 10");

        }
        else {
            System.out.println("Numarul nu este mai mare decat 10");
        }

  }

  //Verificam daca un numar este par si pozitiv

   public void VerificareNumarParPozitiv(Integer Numar){

        if (Numar > 0){
            if (Numar % 2 == 0){
                System.out.println("Numarul "+Numar+" este par si pozitiv");
            }
            else {
            System.out.println("Numarul "+Numar+" este impar si pozitiv");
            }

        }
         if(Numar < 0) {
            if (Numar % 2 == 0){
                System.out.println("Numarul "+Numar+" este par si negativ");
            }
            else {
                System.out.println("Numarul "+Numar+" este impar si negativ");
            }
        }
         if(Numar == 0){
            System.out.println("Numarul "+Numar+" este egal cu 0");
        }



   }

   //Facem o metoda cu switch case

   //Afisam ziua curenta din saptamana

   public void ZiuaSaptamana(Integer Numar){
        switch (Numar){
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            default:
                System.out.println("sfarsit");
        }
   }





}
