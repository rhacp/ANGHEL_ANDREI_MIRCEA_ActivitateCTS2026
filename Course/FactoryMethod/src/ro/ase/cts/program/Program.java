package ro.ase.cts.program;

import ro.ase.cts.factory.FabricaAbstracta;
import ro.ase.cts.factory.LaptopFactory;
import ro.ase.cts.factory.SmartphoneFactory;
import ro.ase.cts.factory.SmartwatchFactory;

public class Program {

    private static void printareDispozitiv(FabricaAbstracta fabrica, int nivelBaterie) {
        System.out.println(fabrica.creareDispozitiv(nivelBaterie).toString());
    }

    public static void main(String[] args) {
        printareDispozitiv(new LaptopFactory(), 2);
        printareDispozitiv(new SmartphoneFactory(), 50);
        printareDispozitiv(new SmartwatchFactory(), 100);
    }
}
