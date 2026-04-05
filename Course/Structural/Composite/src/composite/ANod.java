package composite;

public abstract class ANod {

    public abstract String getDenumire();

    public abstract int getPret();

    public String getInfo() {
        return " [" + this.getDenumire() + ", " + this.getPret() + "]";
    }

    public void adaugaNod(ANod elemStructura) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void eliminaNod(ANod elemStructura) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ANod getNod(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
