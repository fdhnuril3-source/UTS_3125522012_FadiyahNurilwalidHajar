public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM PENGIRIMAN BARANG (LOGISTIK PBO) ===");

        // Inisialisasi Objek Kurir (Relasi)
        Kurir kurir1 = new Kurir("Ahmad Fauzi", "081234567890");
        Kurir kurir2 = new Kurir("Siti Rahma", "089876543210");

        kurir1.infoKurir();
        kurir2.infoKurir();
        System.out.println("--------------------------------------------------------------------------------");

        // Skenario Pengujian Polymorphism (Minimal 3 Objek)
        Pengiriman p1 = new PengirimanReguler("REG-001", 3.5, 15.0);
        Pengiriman p2 = new PengirimanExpress("EXP-002", 2.0, 30.0, true);
        PengirimanReguler p3 = new PengirimanReguler("REG-003", 5.0, 8.0);

        // Memanggil method polymorphism
        p1.tampilkanDetail();
        p2.tampilkanDetail();
        p3.tampilkanDetail();

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Pengujian Validasi Business Rule (Mencoba input berat negatif):");
        try {
            Pengiriman pError = new PengirimanReguler("ERR-999", -1.0, 10.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Validasi Berhasil Menangkap Error: " + e.getMessage());
        }
    }
}