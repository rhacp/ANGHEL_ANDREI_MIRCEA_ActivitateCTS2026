package interf.chain_of_responsability;

import interf.models.CreditRequest;

public class DebtHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(CreditRequest request) {

        if (request.hasDebts()) {
            System.out.println("Rejected: client has debts.");
        } else {
            System.out.println("Debt verification passed.");

            if (nextHandler != null) {
                nextHandler.handle(request);
            }
        }
    }
}
