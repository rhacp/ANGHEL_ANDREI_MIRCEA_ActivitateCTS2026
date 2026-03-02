package prototype.models;

import prototype.prototype.Prototype;

//public class Rezervare implements Prototype {
public class Rezervare implements Cloneable {

    private String nume;

    private String nrTelefon;

    private int nrPersoane;

    public Rezervare(String nume, String nrTelefon, int nrPersoane) {
        if (nume.length() > 3) {
            this.nume = nume;
        } else {
            this.nume = "Nan";
        }

        if (nrTelefon.length() == 10) {
            this.nrTelefon = nrTelefon;
        } else {
            this.nrTelefon = "0000000000";
        }

        if (nrPersoane > 0) {
            this.nrPersoane = nrPersoane;
        }
    }

    private Rezervare() {
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
    }

//    @Override
//    public Rezervare copiaza() {
//        Rezervare rezervare = new Rezervare();
//        rezervare.nume = this.nume;
//        rezervare.nrTelefon = this.nrTelefon;
//        rezervare.nrPersoane = this.nrPersoane;
//        return rezervare;
//    }

    public Rezervare copiaza() throws CloneNotSupportedException {
        return (Rezervare) super.clone();
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
