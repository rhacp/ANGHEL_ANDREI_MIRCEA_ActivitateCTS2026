package class_adapter.adapter;

public class EvaluareClientFIrmaA implements IEvaluareClientFirmaA {

    @Override
    public void analizaClientFirmaA(int costTotalEvenimente) {
        System.out.println("Metoda analiza client Firma A");
        double procentDiscount = 0;

        if (costTotalEvenimente > 1000) {
            procentDiscount = 0.1;
        } else if (costTotalEvenimente > 500) {
            procentDiscount = 0.5;
        }

        System.out.println("S-a oferit un discount de " + procentDiscount);
    }
}
