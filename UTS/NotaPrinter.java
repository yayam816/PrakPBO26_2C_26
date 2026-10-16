package UTS;

public class NotaPrinter {
    private String model;

    public NotaPrinter(String model) {
        this.model = model;
    }

    public void cetakNota(Servis s) {
        if (s == null) {
            return;
        }
        String namaPJ = (s.getMekanikPJ() != null) ? s.getMekanikPJ().getNama() : "Tanpa PJ";
        System.out.println("Nota [" + s.getJenis() + "] " + s.getKode() + " " + s.getPlatNomor() 
            + " | PJ: " + namaPJ + " | Total: " + s.hitungBiaya());
    }
}