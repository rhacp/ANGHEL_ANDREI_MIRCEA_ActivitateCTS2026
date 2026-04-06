package A2.program;

import A2.factory.FabricaPersonalSpital;
import A2.factory.PersonalSpitalEnum;
import A2.models.PersonalSpital;

public class Program {

    public static void main(String[] args) {
        PersonalSpital medic = FabricaPersonalSpital.getInstance().getPersonalSpital(PersonalSpitalEnum.Medic, "M");
        PersonalSpital bancardier = FabricaPersonalSpital.getInstance().getPersonalSpital(PersonalSpitalEnum.Brancardier, "B");
        PersonalSpital asistent = FabricaPersonalSpital.getInstance().getPersonalSpital(PersonalSpitalEnum.Asistent, "A");

        System.out.println(medic);
        System.out.println(bancardier);
        System.out.println(asistent);
    }
}
