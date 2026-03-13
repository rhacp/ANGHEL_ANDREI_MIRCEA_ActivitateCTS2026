package models;

public enum TipPantof {

    BALERINI("Balerini"),
    TENISI("Tenisi"),
    GHETE("Ghete"),
    STILETTO("Stiletto");

    private String label;

    TipPantof(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
