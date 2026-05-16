package object_adapter.program;


import object_adapter.adapter.*;
import object_adapter.models.Client;

public class Program {

    public static void main(String[] args) {
        Client client = new Client("John Doe", 2, new int[]{250, 300});

        IEvaluareClientFirmaA evaluareClientFirmaA = new EvaluareClientFirmaA();
        IEvaluareClientFirmaB evaluareClientFirmaB = new Adapter(evaluareClientFirmaA);
        IEvaluareClientFirmaB evaluareClientFirmaB1 = new EvaluareClientFirmaB();

        evaluareClientFirmaB.analizaClientFirmaB(client);

        System.out.println("\n--------------------------\n");

        evaluareClientFirmaB1.analizaClientFirmaB(client);
    }
}
