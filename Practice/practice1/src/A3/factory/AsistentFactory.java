package A3.factory;

import A3.models.Asistent;
import A3.models.PersonalSpital;

public class AsistentFactory implements PersonalMedicalFactory {

    @Override
    public PersonalSpital createPersonalSpital(String nume) {
        return new Asistent(nume);
    }
}
