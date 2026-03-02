package builder.builder.builder_two;

import builder.builder.builder_one.BuilderAbstract;
import builder.models.Rezervare;

public class RezervareBuilder2 implements BuilderAbstract {

    //versiunea 2 - cu atributele copiate
    private boolean laGeam;

    private boolean scaunErgonomic;

    private String culoareFataMasa;

    private String genMuzical;

    private int nrPersoane;

    public RezervareBuilder2() {
        this.laGeam = false;
        this.scaunErgonomic = false;
        this.culoareFataMasa = "Alb";
        this.genMuzical = "Jazz";
        this.nrPersoane = 2;
    }

    @Override
    public BuilderAbstract setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
        return this;
    }

    @Override
    public BuilderAbstract setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
        return this;
    }

    @Override
    public BuilderAbstract setCuloareFataMasa(String culoareFataMasa) {
        this.culoareFataMasa = culoareFataMasa;
        return this;
    }

    @Override
    public BuilderAbstract setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    @Override
    public BuilderAbstract setLaGeam(boolean laGeam) {
        this.laGeam = laGeam;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(laGeam, scaunErgonomic, culoareFataMasa, genMuzical, nrPersoane);
    }
}
