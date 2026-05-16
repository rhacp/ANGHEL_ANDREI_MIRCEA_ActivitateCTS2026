package models;

public class MenuOffer {

    private String name;

    private int caloriesNumber;

    private int carbsNumber;

    public MenuOffer(String name, int caloriesNumber, int carbsNumber) {
        this.name = name;
        this.caloriesNumber = caloriesNumber;
        this.carbsNumber = carbsNumber;
    }

    public String getName() {
        return name;
    }

    public int getCaloriesNumber() {
        return caloriesNumber;
    }

    public int getCarbsNumber() {
        return carbsNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MenuOffer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", caloriesNumber=").append(caloriesNumber);
        sb.append(", carbsNumber=").append(carbsNumber);
        sb.append('}');
        return sb.toString();
    }
}
