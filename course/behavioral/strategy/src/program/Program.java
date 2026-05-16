package program;

import models.MenuOffer;
import models.RestaurantMenu;
import strategy.IProcessable;
import strategy.StrategyMinCalories;
import strategy.StrategyMinCarbs;

public class Program {

    public static void main(String[] args) {
        MenuOffer menuOffer1 = new MenuOffer("Oriental", 500, 200);
        MenuOffer menuOffer2 = new MenuOffer("Turkish", 150, 300);
        MenuOffer menuOffer3 = new MenuOffer("Indian", 200, 400);
        MenuOffer menuOffer4 = new MenuOffer("Italian", 300, 500);

        IProcessable strategyMinCalories = new StrategyMinCalories();
        IProcessable strategyMinCarbs = new StrategyMinCarbs();

        RestaurantMenu restaurantMenu = new RestaurantMenu();
        restaurantMenu.addMenuOffer(menuOffer1);
        restaurantMenu.addMenuOffer(menuOffer2);
        restaurantMenu.addMenuOffer(menuOffer3);
        restaurantMenu.addMenuOffer(menuOffer4);

        restaurantMenu.setStrategy(strategyMinCalories);
        System.out.println("Min calories: \n" + restaurantMenu.chosenMenuOffer().toString());

        System.out.println("\n-------------------------------------\n");

        restaurantMenu.setStrategy(strategyMinCarbs);
        System.out.println("Min carbs: \n" + restaurantMenu.chosenMenuOffer().toString());
    }
}
