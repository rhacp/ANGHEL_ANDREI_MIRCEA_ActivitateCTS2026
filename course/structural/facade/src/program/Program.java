package program;

import facade.Facade;
import models.Bucatar;
import models.GestiuneBucatari;

public class Program {

    public static void main(String[] args) {
        Bucatar bucatar1 = new Bucatar("John Doe");
        Bucatar bucatar2 = new Bucatar("Jane Doe");

        GestiuneBucatari gestiuneBucatari = new GestiuneBucatari();
        gestiuneBucatari.addBucatar(bucatar1);
        gestiuneBucatari.addBucatar(bucatar2);

        Facade facade = new Facade(gestiuneBucatari);
        System.out.println("Do we have 2 free cooks?");
        System.out.println(facade.verificaDisponibilitateBucatari(2,"Data"));
    }
}
