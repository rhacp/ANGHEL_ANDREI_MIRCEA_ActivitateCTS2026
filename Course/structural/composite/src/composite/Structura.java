package composite;

import java.util.ArrayList;
import java.util.List;

public class Structura extends ANod{

    private List<ANod> structura = new ArrayList<>();

    private String numeStructura;

    public Structura(String numeStructura) {
        this.numeStructura = numeStructura;
    }

    @Override
    public String getDenumire() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getPret() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getInfo() {
        String info = "";
        info += this.numeStructura + "\n";

        for (ANod n : structura) {
            info += " " + n.getInfo() + "\n";
        }
        return info;
    }

    @Override
    public void adaugaNod(ANod elemStructura) {
        structura.add(elemStructura);
    }

    @Override
    public void eliminaNod(ANod elemStructura) {
        structura.remove(elemStructura);
    }

    @Override
    public ANod getNod(int i) {
        return structura.get(i);
    }
}
