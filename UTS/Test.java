package UTS;

public class Test {
    public static void main(String[] args) {
        Bengkel bengkel = new Bengkel("Jaya Motor", 3);
        Mekanik pakSlamet = new Mekanik("Pak Slamet", "Mesin");
        bengkel.setKepala(pakSlamet);

        Mekanik masDodi = new Mekanik("Mas Dodi", "Kelistrikan");

        ServisRingan s1 = new ServisRingan("SRV-01", "N 2211 AA", 50000);
        s1.setMekanikPJ(masDodi);

        ServisBerat s2 = new ServisBerat("SRV-02", "N 3344 BB", 200000, 450000);
        s2.setMekanikPJ(masDodi);

        bengkel.terimaServis(s1);
        bengkel.terimaServis(s2, 3);

        bengkel.tampilInfo();

        Servis servisSelesai = bengkel.selesaikan(1);

        NotaPrinter printer = new NotaPrinter("Epson");
        printer.cetakNota(servisSelesai);
        printer.cetakNota(s2);

        bengkel.tampilInfo();

        Servis s = new ServisBerat("SRV-09", "N 1000 XX", 300000, 250000);
        System.out.println("Hasil hitungBiaya: " + s.hitungBiaya());
    }
}