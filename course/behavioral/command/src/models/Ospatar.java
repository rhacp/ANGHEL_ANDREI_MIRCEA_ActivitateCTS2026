package models;

import command.ICommand;

import java.util.ArrayList;
import java.util.List;

public class Ospatar {

    private List<ICommand> listaComenzi = new ArrayList<>();

    public Ospatar() {}

    public void preiaComanda(ICommand comanda) {
        this.listaComenzi.add(comanda);
    }

    public void transmiteComenzile() {
        for (ICommand comanda : listaComenzi) {
            comanda.prelucreaza();
        }
        this.listaComenzi.clear();
    }
}
