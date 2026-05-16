package flyweight;

import models.Bon;

public class MesajPrintare implements Iprintare {

    private String mesaj;

    public MesajPrintare(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public void printareBon(Bon bon) {
        System.out.println("S-a printat bonul cu totalul " + bon.getCostTotal() + " folosind mesajul " + mesaj);
    }
}
