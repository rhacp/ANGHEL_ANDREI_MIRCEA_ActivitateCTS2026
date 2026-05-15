package abstract_class.models;

public class Comanda {

    private String produs;

    private int cantitate;

    private int grad;

    public Comanda(String produs, int cantitate, int grad) {
        this.produs = produs;
        this.cantitate = cantitate;
        this.grad = grad;
    }

    public String getProdus() {
        return produs;
    }

    public int getCantitate() {
        return cantitate;
    }

    public int getGrad() {
        return grad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comanda{");
        sb.append("produs='").append(produs).append('\'');
        sb.append(", cantitate=").append(cantitate);
        sb.append(", grad=").append(grad);
        sb.append('}');
        return sb.toString();
    }
}
