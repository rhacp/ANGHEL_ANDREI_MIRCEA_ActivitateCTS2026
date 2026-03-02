package ro.ase.cts.aplicatii;

public class AplicatieMobilaSecond {

    private String nume;

    private float dimensiune;

    private static AplicatieMobilaSecond aplicatieMobilaSecond = new AplicatieMobilaSecond("test", 5);

    private AplicatieMobilaSecond(String nume, float dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    public static AplicatieMobilaSecond getInstance() {
        return aplicatieMobilaSecond;
    }
}
