package models;

public class Client {

    private String name;

    private int varsta;

    public Client(String name, int varsta) {
        this.name = name;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Proxy{");
        sb.append("name='").append(name).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public int getVarsta() {
        return varsta;
    }
}
