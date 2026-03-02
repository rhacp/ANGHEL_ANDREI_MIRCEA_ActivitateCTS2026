package builder.builder.builder_one;

import builder.models.Rezervare;

public class RezervareBuilder implements BuilderAbstract {

    //versiunea 1 - cu instanta
    private Rezervare rezervare = null;

    public RezervareBuilder() {
        this.rezervare = new Rezervare();
    }

    @Override
    public BuilderAbstract setGenMuzical(String genMuzical) {
        rezervare.setGenMuzical(genMuzical);
        return this;
    }

    @Override
    public BuilderAbstract setNrPersoane(int nrPersoane) {
        rezervare.setNrPersoane(nrPersoane);
        return this;
    }

    @Override
    public BuilderAbstract setCuloareFataMasa(String culoareFataMasa) {
        rezervare.setCuloareFataMasa(culoareFataMasa);
        return this;
    }

    @Override
    public BuilderAbstract setScaunErgonomic(boolean scaunErgonomic) {
        rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    @Override
    public BuilderAbstract setLaGeam(boolean laGeam) {
        rezervare.setLaGeam(laGeam);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
