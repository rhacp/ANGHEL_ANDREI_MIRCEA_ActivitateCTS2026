package abstract_class.chain_of_responsability;

import abstract_class.models.Comanda;

public class Bucatar extends AHandler{

    @Override
    public void procesareComanda(Comanda comanda) {
        if (comanda.getGrad() > 5 && comanda.getGrad() <= 20) {
            System.out.println("Bucatarul a procesat comand " + comanda.getProdus());
        } else if (comanda.getGrad() <= 5) {
            System.out.println("Bucatar NA.");
        } else {
            System.out.println("Bucatar NA.");
            if (this.getNextHandler() != null) {
                this.getNextHandler().procesareComanda(comanda);
            }
        }
    }
}
