package A2.factory;

import A2.models.Asistent;
import A2.models.Brancardier;
import A2.models.Medic;
import A2.models.PersonalSpital;

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
