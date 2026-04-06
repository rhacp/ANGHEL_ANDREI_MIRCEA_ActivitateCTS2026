package builder_final_product.builder_corect;

import builder_final_product.models.RezervareFinal;

public interface BuilderAbstractTwo {

    BuilderAbstractTwo setGenMuzical(String genMuzical);

    BuilderAbstractTwo setNrPersoane(int nrPersoane);

    BuilderAbstractTwo setCuloareFataMasa(String culoareFataMasa);

    BuilderAbstractTwo setScaunErgonomic(boolean scaunErgonomic);

    BuilderAbstractTwo setLaGeam(boolean laGeam);

    RezervareFinal build();
}
