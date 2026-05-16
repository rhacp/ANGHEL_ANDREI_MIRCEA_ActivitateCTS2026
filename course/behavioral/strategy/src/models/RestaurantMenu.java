package models;

import strategy.IProcessable;

import java.util.ArrayList;
import java.util.List;

public class RestaurantMenu {

    private List<MenuOffer> menusList = new ArrayList<>();

    private IProcessable chosenStrategy;

    public void addMenuOffer(MenuOffer menuOffer){
        menusList.add(menuOffer);
    }

    public void setStrategy(IProcessable chosenStrategy){
        this.chosenStrategy = chosenStrategy;
    }

    public MenuOffer chosenMenuOffer(){
        if (chosenStrategy != null){
            return chosenStrategy.alegereMeniu(menusList);
        } else {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
