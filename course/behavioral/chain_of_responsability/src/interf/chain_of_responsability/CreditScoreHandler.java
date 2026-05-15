package interf.chain_of_responsability;

import interf.models.CreditRequest;

public class CreditScoreHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(CreditRequest request) {

        if (request.getCreditScore() < 600) {
            System.out.println("Rejected: credit score too low.");
        } else {
            System.out.println("Loan approved.");
        }
    }
}
