package A1.program;

import A2.factory.FabricaPersonalSpital;
import A2.factory.PersonalSpitalEnum;
import A1.models.Pacient;
import A2.models.PersonalSpital;

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
    }
}
