package ro.ase.cts.program;

import ro.ase.cts.dispozitive.Dispozitiv;
import ro.ase.cts.factory.FabricaDispozitive;
import ro.ase.cts.factory.TipDispozitiv;

public class Program {

    public static void main(String[] args) {
        FabricaDispozitive fabrica = FabricaDispozitive.getInstance();

        Dispozitiv laptop = fabrica.getDispozitiv(TipDispozitiv.Laptop, 86);
        Dispozitiv smartphone = fabrica.getDispozitiv(TipDispozitiv.Smartphone, 73);
        Dispozitiv smartwatch = fabrica.getDispozitiv(TipDispozitiv.Smartwatch, 29);

        System.out.println(laptop.toString());
        System.out.println(smartphone.toString());
        System.out.println(smartwatch.toString());
    }
}
