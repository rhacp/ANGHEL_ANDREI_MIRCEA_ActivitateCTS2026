package builder;

import models.Pacient;

public interface BuilderAbstract {

    BuilderAbstract setPatRabatabil(boolean patRabatabil);

    BuilderAbstract setMicDejunInclus(boolean micDejunInclus);

    BuilderAbstract setPapuciCamera(boolean papuciCamera);

    BuilderAbstract setHalatInterior(boolean halatInterior);

    Pacient build();
}
