public class Restaurant {

    //semua attribute dibuat private (encapsulation, biar aman)
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private int id = 0; //buat nyimpen index menu berikutnya

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    //getter (Mengembalikan nilai dari atribut)
    public String getNamaMakanan(int index) {
        return nama_makanan[index];
    }

    public double getHargaMakanan(int index) {
        return harga_makanan[index];
    }

    public int getStok(int index) {
        return stok[index];
    }

    //setter (Mengubah nilai dari atribut)
    public void setStok(int index, int stokBaru) {
        if (stokBaru >= 0) {
            stok[index] = stokBaru;
        } else {
            System.out.println("Stok tidak boleh negatif.");
        }
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {

        //validasi kapasitas
        if (id >= nama_makanan.length) {
            System.out.println("Menu sudah penuh.");
            return;
        }

        //validasi stok
        if (stok < 0) {
            System.out.println("Stok tidak boleh negatif.");
            return;
        }

        nama_makanan[id] = nama;
        harga_makanan[id] = harga;
        this.stok[id] = stok;

        id++; //index penunjuk menu makanan otomatis naik
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (getStok(i) > 0) {
                System.out.println(
                    getNamaMakanan(i) + " [" + getStok(i) + "] \tRp. " + getHargaMakanan(i)
                );
            }
        }
    }

    //fitur pemesanan
    public void pesanMenu(String nama, int jumlah) {

        boolean ditemukan = false;

        for (int i = 0; i < id; i++) {

            if (getNamaMakanan(i).equals(nama)) {
                ditemukan = true;

                if (getStok(i) >= jumlah) {
                    setStok(i, getStok(i) - jumlah);
                    System.out.println("Pesanan berhasil. Sisa stok: " + getStok(i));
                } else {
                    System.out.println("Stok tidak mencukupi. Sisa stok: " + getStok(i));
                }

                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Menu tidak ditemukan.");
        }
    }
}