package program;

import composite.Structura;
import models.Meniu;
import models.Produs;

public class Program {

    public static void main(String[] args) {
        Structura structuraMeniu = new Structura("Meniu");
        Structura structuraBauturi = new Structura("Bauturi");
        Structura structuraMancare = new Structura("Mancare");
        Meniu meniu = new Meniu(structuraMeniu, "La Mama");

        structuraMeniu.adaugaNod(structuraBauturi);
        structuraMeniu.adaugaNod(structuraMancare);

        Produs produs = new Produs("Pinacolada", 30);
        Produs produsTwo = new Produs("Fanta", 10);
        structuraBauturi.adaugaNod(produs);
        structuraBauturi.adaugaNod(produsTwo);

        Produs produsThree = new Produs("Burger", 60);
        Produs produsFour = new Produs("Pizza Margherita", 40);
        structuraMancare.adaugaNod(produsThree);
        structuraMancare.adaugaNod(produsFour);

        System.out.println(meniu.getNumeRestaurant());
        System.out.println(structuraMeniu.getInfo());
    }
}
