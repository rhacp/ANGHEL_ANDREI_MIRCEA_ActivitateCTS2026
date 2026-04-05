package builder.models;

public class Rezervare {

    private boolean laGeam;

    private boolean scaunErgonomic;

    private String culoareFataMasa;

    private String genMuzical;

    private int nrPersoane;

    public Rezervare(boolean laGeam, boolean scaunErgonomic, String culoareFataMasa, String genMuzical, int nrPersoane) {
        this.laGeam = laGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.culoareFataMasa = culoareFataMasa;
        this.genMuzical = genMuzical;
        this.nrPersoane = nrPersoane;
    }

    public Rezervare() {
        this.laGeam = false;
        this.scaunErgonomic = false;
        this.culoareFataMasa = "Alb";
        this.genMuzical = "Jazz";
        this.nrPersoane = 2;
    }

    public void setLaGeam(boolean laGeam) {
        this.laGeam = laGeam;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setCuloareFataMasa(String culoareFataMasa) {
        this.culoareFataMasa = culoareFataMasa;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
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
