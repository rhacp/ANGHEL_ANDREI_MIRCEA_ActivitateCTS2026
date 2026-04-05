package builder.program;

import builder.builder.builder_one.BuilderAbstract;
import builder.builder.builder_one.RezervareBuilder;
import builder.builder.builder_two.RezervareBuilder2;
import builder.models.Rezervare;

public class Program {

    public static void main(String[] args) {
        Rezervare rezervareOne = new Rezervare(true, true, "Rosu cu Alb", "Romantic", 2);
        Rezervare rezervareTwo = new Rezervare(true, true, "Rosu cu Alb", "Romantic", 2);

        Rezervare rezervareThree = new Rezervare();
        rezervareThree.setLaGeam(true);
        rezervareThree.setNrPersoane(4);

        Rezervare rezervareFour = new Rezervare();
        rezervareFour.setLaGeam(true);
        rezervareFour.setNrPersoane(6);

        System.out.println(rezervareFour.toString());

        System.out.println("\n----------------------------------------------\n");

        BuilderAbstract builder = new RezervareBuilder();
        Rezervare rezervareFive = builder
                .setNrPersoane(4)
                .setCuloareFataMasa("Verde")
                .build();

        Rezervare rezervareSix = new RezervareBuilder()
                .setNrPersoane(1)
                .build();

        System.out.println(rezervareFive.toString());
        System.out.println("\n----------------------------------------------\n");

        BuilderAbstract builderTwo = new RezervareBuilder2();
        Rezervare rezervareSeven = builderTwo.setScaunErgonomic(true).setNrPersoane(3).build();
        Rezervare rezervareEight = builderTwo.setNrPersoane(5).build();

        System.out.println(rezervareSeven.toString());
        System.out.println(rezervareEight.toString());

        rezervareSeven.setNrPersoane(10);
        System.out.println(rezervareSeven.toString());
        System.out.println("\n----------------------------------------------\n");


    }
}