package strategy;

import models.MenuOffer;

import java.util.List;

public interface IProcessable {

    MenuOffer alegereMeniu (List<MenuOffer> listOfMenus);
}
