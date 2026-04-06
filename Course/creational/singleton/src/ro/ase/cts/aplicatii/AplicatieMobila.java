package ro.ase.cts.aplicatii;

public class AplicatieMobila {

    private String nume;

    private float dimensiune;

    private static AplicatieMobila aplicatieMobila = null;

    private AplicatieMobila(String nume, float dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    public static synchronized AplicatieMobila getInstance() {
        if (aplicatieMobila == null) {
            aplicatieMobila = new AplicatieMobila("test", 5);
        }

        return aplicatieMobila;
    }
}
