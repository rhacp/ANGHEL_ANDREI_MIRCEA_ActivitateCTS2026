package builder.builder.builder_one;

import builder.models.Rezervare;

public interface BuilderAbstract {

    BuilderAbstract setGenMuzical(String genMuzical);

    BuilderAbstract setNrPersoane(int nrPersoane);

    BuilderAbstract setCuloareFataMasa(String culoareFataMasa);

    BuilderAbstract setScaunErgonomic(boolean scaunErgonomic);

    BuilderAbstract setLaGeam(boolean laGeam);

    Rezervare build();
}
