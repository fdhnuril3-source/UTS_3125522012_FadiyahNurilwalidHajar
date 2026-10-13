public abstract class Pengiriman implements DapatDihitung {
    private String nomorResi;
    private double beratKg;
    private double jarakKm;
    private String status;

    public Pengiriman(String nomorResi, double beratKg, double jarakKm) {
        setNomorResi(nomorResi);
        setBeratKg(beratKg);
        setJarakKm(jarakKm);
        this.status = "Diproses";
    }

    // Enkapsulasi & Validasi (Business Rule)
    public void setNomorResi(String nomorResi) {
        if (nomorResi == null || nomorResi.trim().isEmpty()) {
            throw new IllegalArgumentException("Nomor resi tidak boleh kosong!");
        }
        this.nomorResi = nomorResi;
    }

    public void setBeratKg(double beratKg) {
        if (beratKg <= 0) {
            throw new IllegalArgumentException("Berat barang harus lebih besar dari 0 kg!");
        }
        this.beratKg = beratKg;
    }

    public void setJarakKm(double jarakKm) {
        if (jarakKm < 0) {
            throw new IllegalArgumentException("Jarak tidak boleh bernilai negatif!");
        }
        this.jarakKm = jarakKm;
    }

    public String getNomorResi() { return nomorResi; }
    public double getBeratKg() { return beratKg; }
    public double getJarakKm() { return jarakKm; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }

    // Abstract method untuk polymorphism behavior
    public abstract void tampilkanDetail();
}