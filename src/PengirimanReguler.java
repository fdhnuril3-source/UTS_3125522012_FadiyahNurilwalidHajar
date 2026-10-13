public class PengirimanReguler extends Pengiriman {
    private static final double TARIF_PER_KG = 5000.0;
    private static final double TARIF_PER_KM = 2000.0;

    public PengirimanReguler(String nomorResi, double beratKg, double jarakKm) {
        super(nomorResi, beratKg, jarakKm);
    }

    @Override
    public double hitungBiaya() {
        // Logika bisnis reguler
        return (getBeratKg() * TARIF_PER_KG) + (getJarakKm() * TARIF_PER_KM);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("[Tipe: REGULER] Resi: " + getNomorResi() + 
                           " | Berat: " + getBeratKg() + " kg | Jarak: " + getJarakKm() + " km" +
                           " | Total Biaya: Rp " + hitungBiaya() + " | Status: " + getStatus());
    }
}