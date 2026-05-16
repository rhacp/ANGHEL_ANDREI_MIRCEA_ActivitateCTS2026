package program;

import flyweight.Iprintare;
import flyweight.MesajPrintareFactory;
import models.Bon;

public class Program {

    public static void main(String[] args) {
        Bon bon1 = new Bon(1, 10.1f);
        Bon bon2 = new Bon(2, 20.2f);

        Iprintare mesaj1 = MesajPrintareFactory.getMesaj("Va multumim!");
        mesaj1.printareBon(bon1);

        System.out.println("\n----------------------\n");

        Iprintare mesaj2 = MesajPrintareFactory.getMesaj("Va multumim!");
        mesaj2.printareBon(bon2);
    }
}
