package ro.ase.cts.factory;

import ro.ase.cts.dispozitive.Dispozitiv;
import ro.ase.cts.dispozitive.Laptop;

public class LaptopFactory implements FabricaAbstracta {

    @Override
    public Dispozitiv creareDispozitiv(int nivelBaterie) {
        return new Laptop(nivelBaterie);
    }
}
