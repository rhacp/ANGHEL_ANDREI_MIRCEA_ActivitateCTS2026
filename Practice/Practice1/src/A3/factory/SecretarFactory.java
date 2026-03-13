package A3.factory;

import A3.models.PersonalSpital;
import A3.models.Secretar;

public class SecretarFactory implements PersonalNonMedicalFactory {

    @Override
    public PersonalSpital createPersonalSpital(String nume) {
        return new Secretar(nume);
    }
}
