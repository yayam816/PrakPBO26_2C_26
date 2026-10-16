package UTS;

public class ServisRingan extends Servis {
    public ServisRingan(String kode, String platNomor, int biayaJasa) {
        super(kode, platNomor, biayaJasa);
    }

    @Override
    public int hitungBiaya() {
        return biayaJasa + 60000;
    }

    @Override
    public String getJenis() {
        return "Ringan";
    }
}