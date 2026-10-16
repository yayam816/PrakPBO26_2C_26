package UTS;

public class Servis {
    protected String kode;
    protected String platNomor;
    protected int biayaJasa;
    private Mekanik mekanikPJ;

    public Servis(String kode, String platNomor, int biayaJasa) {
        this.kode = kode;
        this.platNomor = platNomor;
        this.biayaJasa = biayaJasa;
    }

    public void setMekanikPJ(Mekanik mekanikPJ) {
        this.mekanikPJ = mekanikPJ;
    }

    public Mekanik getMekanikPJ() {
        return mekanikPJ;
    }

    public int hitungBiaya() {
        return biayaJasa;
    }

    public String getJenis() {
        return "Servis";
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getKode() {
        return kode;
    }
}