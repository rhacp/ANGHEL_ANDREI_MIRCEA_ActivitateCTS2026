package ro.ase.cts.dispozitive;

public class Laptop extends Dispozitiv {

    public Laptop(int nivelBaterie) {
        super(nivelBaterie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Laptop{");
        sb.append("nivelBaterie=").append(super.nivelBaterie);
        sb.append('}');
        return sb.toString();
    }
}
