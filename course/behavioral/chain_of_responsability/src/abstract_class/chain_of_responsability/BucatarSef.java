package abstract_class.chain_of_responsability;

import abstract_class.models.Comanda;

public class BucatarSef extends AHandler{

    @Override
    public void procesareComanda(Comanda comanda) {
        if (comanda.getGrad() > 20) {
            System.out.println("Bucatarul sef a procesat comanda: " + comanda.getProdus());
        } else {
            System.out.println("NA.");
        }
    }
}
