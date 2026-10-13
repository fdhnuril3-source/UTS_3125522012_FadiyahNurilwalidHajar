public class Kurir {
    private String namaKurir;
    private String nomorTelepon;

    public Kurir(String namaKurir, String nomorTelepon) {
        this.namaKurir = namaKurir;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNamaKurir() { return namaKurir; }
    public String getNomorTelepon() { return nomorTelepon; }

    public void infoKurir() {
        System.out.println("Kurir Bertugas: " + namaKurir + " (Telp: " + nomorTelepon + ")");
    }
}