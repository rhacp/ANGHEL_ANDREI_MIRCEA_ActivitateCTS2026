package A3.factory;

import A3.models.Brancardier;
import A3.models.PersonalSpital;

public class BrancardierFactory implements PersonalMedicalFactory {

    @Override
    public PersonalSpital createPersonalSpital(String nume) {
        return new Brancardier(nume);
    }
}
