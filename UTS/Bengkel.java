package UTS;

public class Bengkel {
    private String nama;
    private BayServis[] daftarBay;
    private Mekanik kepala;

    public Bengkel(String nama, int jumlahBay) {
        this.nama = nama;
        if (jumlahBay > 0) {
            this.daftarBay = new BayServis[jumlahBay];
            for (int i = 0; i < jumlahBay; i++) {
                this.daftarBay[i] = new BayServis(i + 1);
            }
        } else {
            this.daftarBay = new BayServis[0];
        }
    }

    public void setKepala(Mekanik kepala) {
        this.kepala = kepala;
    }

    public void terimaServis(Servis s) {
        if (s == null || daftarBay == null) {
            return;
        }
        for (BayServis bay : daftarBay) {
            if (bay != null && bay.isKosong()) {
                bay.terima(s);
                break;
            }
        }
    }

    public void terimaServis(Servis s, int nomorBay) {
        if (s == null || daftarBay == null) {
            return;
        }
        int index = nomorBay - 1;
        if (index >= 0 && index < daftarBay.length && daftarBay[index] != null) {
            if (daftarBay[index].isKosong()) {
                daftarBay[index].terima(s);
            }
        }
    }

    public Servis selesaikan(int nomorBay) {
        if (daftarBay == null) {
            return null;
        }
        int index = nomorBay - 1;
        if (index >= 0 && index < daftarBay.length && daftarBay[index] != null) {
            return daftarBay[index].selesaikan();
        }
        return null;
    }

    public void tampilInfo() {
        String namaKepala = (kepala != null) ? kepala.getNama() : "Belum Ada";
        System.out.println("Bengkel " + nama + " (kepala: " + namaKepala + ")");
        if (daftarBay != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < daftarBay.length; i++) {
                if (i > 0) {
                    sb.append(" | ");
                }
                sb.append("Bay ").append(daftarBay[i].getNomor()).append(": ");
                if (daftarBay[i].isKosong()) {
                    sb.append("kosong");
                } else {
                    sb.append(daftarBay[i].getServis().getPlatNomor());
                }
            }
            System.out.println(sb.toString());
        }
    }
}