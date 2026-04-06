package A3.program;

import A3.factory.*;

public class Program {

    public static void main(String[] args) {
        printarePersonalSpital(new AsistentFactory(), "A");
        printarePersonalSpital(new BrancardierFactory(), "B");
        printarePersonalSpital(new MedicFactory(), "M");
        printarePersonalSpital(new RegistratorFactory(), "R");
        printarePersonalSpital(new SecretarFactory(), "S");

    }

    public static void printarePersonalSpital(AbstractFactory factory, String nume) {
        System.out.println(factory.createPersonalSpital(nume));
    }
}
