package strategy;

import models.MenuOffer;

import java.util.List;

public class StrategyMinCarbs implements IProcessable {

    @Override
    public MenuOffer alegereMeniu(List<MenuOffer> listOfMenus) {
        MenuOffer result = listOfMenus.get(0);

        for (MenuOffer currentOffer : listOfMenus) {
            if (currentOffer.getCarbsNumber() < result.getCarbsNumber()) {
                result = currentOffer;
            }
        }

        return result;
    }
}
