package A3.factory;

import A3.models.PersonalSpital;

public interface AbstractFactory {

    PersonalSpital createPersonalSpital(String nume);
}
