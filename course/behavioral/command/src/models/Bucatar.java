package models;

public class Bucatar {

    String nume;

    public Bucatar(String nume) {
        this.nume = nume;
    }

    public void prepararePizza(String tipPizza, String tipBlat) {
        System.out.println("Bucatarul " + nume + " a pregatit pizza " + tipPizza + " cu blat " + tipBlat);
    }

    public void prepararePaste(String tipPaste) {
        System.out.println("Bucatarul " + nume + " a pregatit paste " + tipPaste);
    }
}
