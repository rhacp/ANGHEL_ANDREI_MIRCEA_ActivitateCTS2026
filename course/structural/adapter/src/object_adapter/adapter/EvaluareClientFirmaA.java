package object_adapter.adapter;

public class EvaluareClientFirmaA implements IEvaluareClientFirmaA{

    @Override
    public void analizaClientFirmaA(int costTotalEvenimente) {

        System.out.println("Analiza realizata de Firma A");

        double discount = 0;

        if (costTotalEvenimente > 1000) {
            discount = 0.1;
        } else if (costTotalEvenimente > 500) {
            discount = 0.05;
        }

        System.out.println("Discount: " + discount);
    }
}
