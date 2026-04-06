package builder_final_product.models;

import builder_final_product.builder_corect.BuilderAbstractTwo;

public class RezervareFinal {

    private boolean laGeam;

    private boolean scaunErgonomic;

    private String culoareFataMasa;

    private String genMuzical;

    private int nrPersoane;

    private RezervareFinal(boolean laGeam, boolean scaunErgonomic, String culoareFataMasa, String genMuzical, int nrPersoane) {
        this.laGeam = laGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.culoareFataMasa = culoareFataMasa;
        this.genMuzical = genMuzical;
        this.nrPersoane = nrPersoane;
    }

    public static class Builder implements BuilderAbstractTwo {

        private boolean laGeam;

        private boolean scaunErgonomic;

        private String culoareFataMasa;

        private String genMuzical;

        private int nrPersoane;

        @Override
        public BuilderAbstractTwo setGenMuzical(String genMuzical) {
            this.genMuzical = genMuzical;
            return this;
        }

        @Override
        public BuilderAbstractTwo setNrPersoane(int nrPersoane) {
            this.nrPersoane = nrPersoane;
            return this;
        }

        @Override
        public BuilderAbstractTwo setCuloareFataMasa(String culoareFataMasa) {
            this.culoareFataMasa = culoareFataMasa;
            return this;
        }

        @Override
        public BuilderAbstractTwo setScaunErgonomic(boolean scaunErgonomic) {
            this.scaunErgonomic = scaunErgonomic;
            return this;
        }

        @Override
        public BuilderAbstractTwo setLaGeam(boolean laGeam) {
            this.laGeam = laGeam;
            return this;
        }

        @Override
        public RezervareFinal build() {
            return new RezervareFinal(laGeam, scaunErgonomic, culoareFataMasa, genMuzical, nrPersoane);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("laGeam=").append(laGeam);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", culoareFataMasa='").append(culoareFataMasa).append('\'');
        sb.append(", genMuzical='").append(genMuzical).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
    }
}
