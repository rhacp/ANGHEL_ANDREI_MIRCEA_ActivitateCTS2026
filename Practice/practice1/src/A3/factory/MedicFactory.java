package A3.factory;

import A3.models.Medic;
import A3.models.PersonalSpital;

public class MedicFactory implements PersonalMedicalFactory {

    @Override
    public PersonalSpital createPersonalSpital(String nume) {
        return new Medic(nume);
    }
}
