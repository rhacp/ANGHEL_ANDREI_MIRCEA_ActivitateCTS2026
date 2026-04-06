package ro.ase.cts.factory;

import ro.ase.cts.dispozitive.Dispozitiv;
import ro.ase.cts.dispozitive.Smartwatch;

public class SmartwatchFactory implements FabricaAbstracta {

    @Override
    public Dispozitiv creareDispozitiv(int nivelBaterie) {
        return new Smartwatch(nivelBaterie);
    }
}
