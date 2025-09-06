import java.util.Scanner;

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

public class InventarisToko2 {
    static Barang[] inventaris = new Barang[10];

    public static void tampilkanInventaris() {
        System.out.println("\nInventaris Toko:");
        for (int i = 0; i < inventaris.length; i++) {
            if (inventaris[i] != null) {
                System.out.print((i + 1) + ". ");
                inventaris[i].tampilkanBarang();
            }
        }
    }

    public static void updateStok(String nama, int jumlahBaru) {
        for (int i = 0; i < inventaris.length; i++) {
            if (inventaris[i] != null && inventaris[i].nama.equalsIgnoreCase(nama)) {
                inventaris[i].jumlahStok = jumlahBaru;
                System.out.println("\nStok berhasil diupdate!");
                return;
            }
        }
        System.out.println("Barang dengan nama " + nama + " tidak ditemukan.");
    }

    public static void cariBarang(String nama) {
        for (Barang b : inventaris) {
            if (b != null && b.nama.equalsIgnoreCase(nama)) {
                System.out.println("\nHasil pencarian:");
                b.tampilkanBarang();
                return;
            }
        }
        System.out.println("Barang dengan nama " + nama + " tidak ditemukan.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inventaris[0] = new Barang("Pensil", 50, 200);
        inventaris[1] = new Barang("Buku", 30, 15000);
        inventaris[2] = new Barang("Penghapus", 20, 500);

        tampilkanInventaris();

        System.out.print("\nMasukkan nama barang yang ingin diupdate: ");
        String namaUpdate = sc.nextLine();
        System.out.print("Masukkan jumlah stok baru: ");
        int stokBaru = sc.nextInt();
        updateStok(namaUpdate, stokBaru);

        tampilkanInventaris();

        sc.nextLine();
        System.out.print("\nMasukkan nama barang yang dicari: ");
        String namaCari = sc.nextLine();
        cariBarang(namaCari);

        sc.close();
    }
}
