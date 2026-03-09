package models;

import builder.BuilderAbstract;

public class Pacient {

    private boolean patRabatabil;

    private boolean micDejunInclus;

    private boolean papuciCamera;

    private boolean halatInterior;

    private Pacient(boolean patRabatabil, boolean micDejunInclus, boolean papuciCamera, boolean halatInterior) {
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
    }

    public static class Builder implements BuilderAbstract {

        private boolean patRabatabil;

        private boolean micDejunInclus;

        private boolean papuciCamera;

        private boolean halatInterior;

        @Override
        public BuilderAbstract setPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
            return this;
        }

        @Override
        public BuilderAbstract setMicDejunInclus(boolean micDejunInclus) {
            this.micDejunInclus = micDejunInclus;
            return this;
        }

        @Override
        public BuilderAbstract setPapuciCamera(boolean papuciCamera) {
            this.papuciCamera = papuciCamera;
            return this;
        }

        @Override
        public BuilderAbstract setHalatInterior(boolean halatInterior) {
            this.halatInterior = halatInterior;
            return this;
        }

        @Override
        public Pacient build() {
            return new Pacient(patRabatabil,  micDejunInclus, papuciCamera, halatInterior);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejunInclus=").append(micDejunInclus);
        sb.append(", papuciCamera=").append(papuciCamera);
        sb.append(", halatInterior=").append(halatInterior);
        sb.append('}');
        return sb.toString();
    }
}
