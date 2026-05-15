package interf.chain_of_responsability;

import interf.models.CreditRequest;

public interface Handler {

    void setNextHandler(Handler nextHandler);

    void handle(CreditRequest request);
}
