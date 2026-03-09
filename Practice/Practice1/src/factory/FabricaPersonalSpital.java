package factory;

import models.Asistent;
import models.Brancardier;
import models.Medic;
import models.PersonalSpital;

public class FabricaPersonalSpital {

    private static FabricaPersonalSpital instance = null;

    public static synchronized FabricaPersonalSpital getInstance() {
        if (instance == null) {
            instance = new FabricaPersonalSpital();
        }

        return instance;
    }

    public PersonalSpital getPersonalSpital(PersonalSpitalEnum tip, String nume) {
        return switch(tip) {
            case Brancardier -> new Brancardier(nume);
            case Asistent -> new Asistent(nume);
            case Medic -> new Medic(nume);
        };
    }
}
