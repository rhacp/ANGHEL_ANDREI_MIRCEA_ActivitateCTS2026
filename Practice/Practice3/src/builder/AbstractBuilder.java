package builder;

import models.PantofFinal;

import java.util.List;
import java.util.Set;

public interface AbstractBuilder {

    AbstractBuilder setMaterialeSecundare(Set<String> materialeSecundare);

    AbstractBuilder setMesaje(List<String> mesaje);

    PantofFinal build();
}
