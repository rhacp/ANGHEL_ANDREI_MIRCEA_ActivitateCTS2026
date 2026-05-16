package class_adapter.adapter;

import class_adapter.models.Client;

public class Adapter extends EvaluareClientFIrmaA implements IEvaluareClientFirmaB {

    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Pare ca evaluarea este facuta de firma B, dar se realizeaza de ....");
        this.analizaClientFirmaA(costTotalEvenimente(client));
    }

    private int costTotalEvenimente(Client client) {
        System.out.println("Transformare input din B in A");
        int total = 0;
        for (int i = 0; i < client.getNrEvenimente(); i++) {
            total += client.getCostEvenimente()[i];
        }

        return total;
    }
}
