package prototype.program;

import prototype.models.Rezervare;
import prototype.prototype.Prototype;

public class Program {

    public static void main(String[] args) {
//        Prototype rezervare = new Rezervare("JohnDoe", "0723111111", 3);
//        Prototype rezervareTwo = rezervare.copiaza();
//        ((Rezervare)rezervareTwo).setNrPersoane(20);

        Rezervare rezervare = new Rezervare("JohnDoe", "0723111111", 3);
        Rezervare rezervareTwo = null;
        try {
            rezervareTwo = rezervare.copiaza();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        rezervareTwo.setNrPersoane(20);

        System.out.println(rezervare.toString());
        System.out.println(rezervareTwo.toString());
    }
}
