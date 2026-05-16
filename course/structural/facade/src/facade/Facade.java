package facade;

import models.GestiuneBucatari;

public class Facade {

    private GestiuneBucatari gestiuneBucatari;

    public Facade(GestiuneBucatari gestiuneBucatari) {
        this.gestiuneBucatari = gestiuneBucatari;
    }

    public boolean verificaDisponibilitateBucatari(int nrBucatari, String data) {
        int crt = 0;

        for (int i = 0; i < gestiuneBucatari.getNrBucatari(); i++) {
            if (gestiuneBucatari.getBucatar(i).verificaDisponibilitate(data)) {
                crt++;
            }
        }

        if (crt >= nrBucatari) {
            return true;
        }

        return false;
    }
}
