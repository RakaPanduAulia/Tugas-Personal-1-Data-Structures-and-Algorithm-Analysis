class Barang {
    String nama;
    int jumlahStok;
    double harga;

    public Barang(String nama, int jumlahStok, double harga) {
        this.nama = nama;
        this.jumlahStok = jumlahStok;
        this.harga = harga;
    }

    public void tampilkanBarang() {
        System.out.println("Nama: " + nama + ", Jumlah Stok: " + jumlahStok + ", Harga: " + harga);
    }
}

public class InventarisToko {
    public static void main(String[] args) {
        Barang[] inventaris = new Barang[10];

        inventaris[0] = new Barang("Pensil", 50, 200);
        inventaris[1] = new Barang("Buku", 30, 15000);
        inventaris[2] = new Barang("Penghapus", 20, 500);

        System.out.println("Inventaris Toko:");
        for (int i = 0; i < inventaris.length; i++) {
            if (inventaris[i] != null) {
                System.out.print((i + 1) + ". ");
                inventaris[i].tampilkanBarang();
            }
        }
    }
}
