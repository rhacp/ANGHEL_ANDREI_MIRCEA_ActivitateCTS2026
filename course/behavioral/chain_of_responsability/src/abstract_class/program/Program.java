package abstract_class.program;

import abstract_class.chain_of_responsability.AHandler;
import abstract_class.chain_of_responsability.Bucatar;
import abstract_class.chain_of_responsability.BucatarSef;
import abstract_class.chain_of_responsability.Ospatar;
import abstract_class.models.Comanda;

public class Program {

    public static void main(String... args) {
        AHandler ospatar = new Ospatar();
        AHandler bucatar = new Bucatar();
        AHandler bucatarSef = new BucatarSef();

        ospatar.setNextHandler(bucatar);
        bucatar.setNextHandler(bucatarSef);

        Comanda comanda1 = new Comanda("Pizza", 2, 15);
        Comanda comanda2 = new Comanda("Paste", 3, 21);
        Comanda comanda3 = new Comanda("Shake", 1, 4);

        System.out.println("Comanda 1: " + comanda1.toString() + "\n");
        ospatar.procesareComanda(comanda1);

        System.out.println("\n------------------------\n");

        System.out.println("Comanda 2: " + comanda2.toString() + "\n");
        ospatar.procesareComanda(comanda2);

        System.out.println("\n-----------------------\n");

        System.out.println("Comanda 3: " + comanda3.toString() + "\n");
        ospatar.procesareComanda(comanda3);
    }
}
