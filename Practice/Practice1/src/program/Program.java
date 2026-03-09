package program;

import factory.FabricaPersonalSpital;
import factory.PersonalSpitalEnum;
import models.Pacient;
import models.PersonalSpital;

public class Program {

    public static void main(String[] args) {
        Pacient pacientOne = new Pacient.Builder().setHalatInterior(true)
                .setPapuciCamera(true).build();

        Pacient pacientTwo = new Pacient.Builder().setHalatInterior(true)
                .setPapuciCamera(true)
                .setPatRabatabil(true)
                .setMicDejunInclus(true)
                .build();

        System.out.println(pacientOne.toString());
        System.out.println(pacientTwo.toString());

        System.out.println("\n----------------------------------\n");

        PersonalSpital medic = FabricaPersonalSpital.getInstance().getPersonalSpital(PersonalSpitalEnum.Medic, "M");
        PersonalSpital bancardier = FabricaPersonalSpital.getInstance().getPersonalSpital(PersonalSpitalEnum.Brancardier, "B");
        PersonalSpital asistent = FabricaPersonalSpital.getInstance().getPersonalSpital(PersonalSpitalEnum.Asistent, "A");

        System.out.println(medic);
        System.out.println(bancardier);
        System.out.println(asistent);
    }
}
