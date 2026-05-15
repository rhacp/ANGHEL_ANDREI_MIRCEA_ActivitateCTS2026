package abstract_class.chain_of_responsability;

import abstract_class.models.Comanda;

public class Ospatar extends AHandler{
    @Override
    public void procesareComanda(Comanda comanda) {
        if (comanda.getGrad() <= 5) {
            System.out.println("Ospatarul a procesast comanda: " + comanda.getProdus());
        } else {
            System.out.println("Ospatar NA.");
            if (this.getNextHandler() != null) {
                this.getNextHandler().procesareComanda(comanda);
            }
        }
    }
}
