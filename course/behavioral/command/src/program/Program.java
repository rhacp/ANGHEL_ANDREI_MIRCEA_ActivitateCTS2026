package program;

import command.ComandaPaste;
import command.ComandaPizza;
import command.ICommand;
import models.Bucatar;
import models.Ospatar;

public class Program {

    public static void main(String[] args) {
        Bucatar bucatar = new Bucatar("John Doe");

        ICommand comandaPizza = new ComandaPizza("Pizza Prosciutto", "subtire", bucatar);
        ICommand comandaPaste = new ComandaPaste("Carbonara", bucatar);

        Ospatar ospatar = new Ospatar();
        ospatar.preiaComanda(comandaPizza);
        ospatar.preiaComanda(comandaPaste);

        ospatar.transmiteComenzile();
    }
}
