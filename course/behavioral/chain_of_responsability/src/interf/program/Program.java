package interf.program;

import interf.chain_of_responsability.CreditScoreHandler;
import interf.chain_of_responsability.DebtHandler;
import interf.chain_of_responsability.Handler;
import interf.chain_of_responsability.SalaryHandler;
import interf.models.CreditRequest;

public class Program {

    public static void main(String[] args) {
        Handler salaryHandler = new SalaryHandler();
        Handler debtHandler = new DebtHandler();
        Handler creditHandler = new CreditScoreHandler();

        salaryHandler.setNextHandler(debtHandler);
        debtHandler.setNextHandler(creditHandler);

        CreditRequest request =
                new CreditRequest(
                        "Andrei",
                        5000,
                        false,
                        700
                );

        salaryHandler.handle(request);
    }
}
