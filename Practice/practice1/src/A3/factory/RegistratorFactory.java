package A3.factory;

import A3.models.PersonalSpital;
import A3.models.Registrator;

public class RegistratorFactory implements PersonalNonMedicalFactory {

    @Override
    public PersonalSpital createPersonalSpital(String nume) {
        return new Registrator(nume);
    }
}
