package A4.models;

public class Reteta implements Cloneable {

    private int cantitateNurofen;

    private int cantitateParasinus;

    private int cantitateStrepsils;

    public Reteta(int cantitateNurofen, int cantitateParasinus, int cantitateStrepsils) {
        if (cantitateNurofen > 0) {
            this.cantitateNurofen = cantitateNurofen;
        } else {
            this.cantitateNurofen = -1;
        }

        if (cantitateParasinus > 0) {
            this.cantitateParasinus = cantitateParasinus;
        } else {
            this.cantitateParasinus = -1;
        }

        if (cantitateStrepsils > 0) {
            this.cantitateStrepsils = cantitateStrepsils;
        } else {
            this.cantitateStrepsils = -1;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("cantitateNurofen=").append(cantitateNurofen);
        sb.append(", cantitateParasinus=").append(cantitateParasinus);
        sb.append(", cantitateStrepsils=").append(cantitateStrepsils);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Reteta clone() {
        try {
            return (Reteta) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clonarea nu a putut fi realizata.", e);
        }
    }
}
