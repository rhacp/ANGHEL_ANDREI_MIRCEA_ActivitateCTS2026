package flyweight;

import java.util.HashMap;
import java.util.Map;

public class MesajPrintareFactory {

    private static Map<String, Iprintare> colectieMesaje = new HashMap<>();

    public static Iprintare getMesaj(String mesaj) {
        Iprintare object = colectieMesaje.get(mesaj);

        if (object == null) {
            object = new MesajPrintare(mesaj);
            colectieMesaje.put(mesaj, object);
            System.out.println("Creare obiect nou.");
        } else {
            System.out.println("Reutilizare obiect existent.");
        }

        return object;
    }
}
