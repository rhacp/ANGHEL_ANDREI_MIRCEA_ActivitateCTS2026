package command;

import models.Bucatar;

public class ComandaPaste implements ICommand {

    private String tipPaste;

    private Bucatar bucatar;

    public ComandaPaste(String tipPaste, Bucatar bucatar) {
        this.tipPaste = tipPaste;
        this.bucatar = bucatar;
    }

    @Override
    public void prelucreaza() {
        bucatar.prepararePaste(tipPaste);
    }
}
