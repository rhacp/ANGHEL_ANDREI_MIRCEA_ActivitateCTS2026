package object_adapter.adapter;

import object_adapter.models.Client;

public class Adapter implements IEvaluareClientFirmaB {

    private IEvaluareClientFirmaA evaluareFirmaA;

    public Adapter(IEvaluareClientFirmaA evaluareFirmaA) {
        this.evaluareFirmaA = evaluareFirmaA;
    }

    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Evaluare Firma B prin Object Adapter");

        int total = costTotalEvenimente(client);
        evaluareFirmaA.analizaClientFirmaA(total);
    }

    private int costTotalEvenimente(Client client) {
        System.out.println("Transformare input B -> A");
        int total = 0;

        for (int i = 0; i < client.getNrEvenimente(); i++) {
            total += client.getCostEvenimente()[i];
        }

        return total;
    }
}
