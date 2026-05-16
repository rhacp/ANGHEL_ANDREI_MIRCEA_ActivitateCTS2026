package class_adapter.program;

import class_adapter.adapter.Adapter;
import class_adapter.adapter.EvaluareClientFirmaB;
import class_adapter.adapter.IEvaluareClientFirmaB;
import class_adapter.models.Client;

public class Program {

    public static void main(String[] args) {
        Client client = new Client("John Doe", 2, new int[]{250, 300});

        IEvaluareClientFirmaB evaluareClientFirmaB = new Adapter();
        IEvaluareClientFirmaB evaluareClientFirmaB1 = new EvaluareClientFirmaB();

        evaluareClientFirmaB.analizaClientFirmaB(client);

        System.out.println("\n--------------------------\n");

        evaluareClientFirmaB1.analizaClientFirmaB(client);
    }
}
