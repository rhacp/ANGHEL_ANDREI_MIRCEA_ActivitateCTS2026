package strategy;

import models.MenuOffer;

import java.util.List;

public class StrategyMinCalories implements IProcessable {

    @Override
    public MenuOffer alegereMeniu(List<MenuOffer> listOfMenus) {
        MenuOffer result = listOfMenus.get(0);

        for (MenuOffer currentOffer : listOfMenus) {
            if (currentOffer.getCaloriesNumber() < result.getCaloriesNumber()) {
                result = currentOffer;
            }
        }

        return result;
    }
}
