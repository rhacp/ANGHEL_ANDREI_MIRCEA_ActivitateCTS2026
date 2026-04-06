package program;

import deorator.APizza;
import deorator.DecoratorCrown;
import deorator.DecoratorPicant;
import model.PizzaVegetariana;

public class Program {

    public static void main(String[] args) {
        APizza pizza = new PizzaVegetariana("aluat, mozarella", 30);
        System.out.println(pizza.getComponente());
        System.out.println(pizza.getPret());

        System.out.println("\n-----------------------------\n");

        APizza pizzaDecorata = new DecoratorCrown(pizza);
        System.out.println(pizzaDecorata.getComponente());
        System.out.println(pizzaDecorata.getPret());

        System.out.println("\n-----------------------------\n");

        APizza pizzaDecorataMultiplu =
                new DecoratorPicant(
                        new DecoratorCrown(
                                new PizzaVegetariana(
                                        "aluat, feta",
                                        40
                                )
                        ),
                        3
                );
        System.out.println(pizzaDecorataMultiplu.getComponente());
        System.out.println(pizzaDecorataMultiplu.getPret());
    }
}
