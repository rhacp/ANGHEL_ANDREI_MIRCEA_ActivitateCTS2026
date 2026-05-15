package abstract_class.chain_of_responsability;

import abstract_class.models.Comanda;

public abstract class AHandler {

    private AHandler nextHandler;

    public AHandler getNextHandler() {
        return this.nextHandler;
    }

    public void setNextHandler(AHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void procesareComanda(Comanda comanda);
}
