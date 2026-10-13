public class PengirimanExpress extends Pengiriman {
    private static final double TARIF_EXPRESS = 10000.0;
    private boolean pakaiAsuransi;

    public PengirimanExpress(String nomorResi, double beratKg, double jarakKm, boolean pakaiAsuransi) {
        super(nomorResi, beratKg, jarakKm);
        this.pakaiAsuransi = pakaiAsuransi;
    }

    @Override
    public double hitungBiaya() {
        double biayaDasar = (getBeratKg() * TARIF_EXPRESS) + (getJarakKm() * 4000.0);
        // Fitur Kreatif: Tambahan biaya asuransi jika dipilih
        double biayaAsuransi = pakaiAsuransi ? 15000.0 : 0.0;
        return biayaDasar + biayaAsuransi;
    }

    // Fitur Kreatif: Estimasi waktu tiba kilat
    public String getEstimasiWaktu() {
        if (getJarakKm() <= 20) return "1 Hari Sampai";
        return "2 Hari Sampai";
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("[Tipe: EXPRESS] Resi: " + getNomorResi() + 
                           " | Berat: " + getBeratKg() + " kg | Jarak: " + getJarakKm() + " km" +
                           " | Asuransi: " + (pakaiAsuransi ? "Ya" : "Tidak") +
                           " | Estimasi: " + getEstimasiWaktu() +
                           " | Total Biaya: Rp " + hitungBiaya() + " | Status: " + getStatus());
    }
}