class Resto {
    private int chickenStock = 100;

    public synchronized void serveCustomer(String cashierName) {
        // hanya satu thread yang bisa masuk method ini dalam satu waktu (menghindari race condition)

        if (chickenStock > 0) {
            try { Thread.sleep(10); } catch (InterruptedException e) {}
            // simulasi delay

            chickenStock--; 
            System.out.println(cashierName + " berhasil menjual 1 ayam. sisa stok: " + chickenStock);
        } else {
            System.out.println(cashierName + " gagal: stok habis!");
        }
    }

    public int getRemainingStock() {
        return chickenStock;
    }
}

public class RestoSimulasi {
    public static void main(String[] args) throws InterruptedException {
        Resto ayamJuicyLuicyGallagher = new Resto();

        Runnable task = () -> {
            for (int i = 0; i < 40; i++) {
                ayamJuicyLuicyGallagher.serveCustomer(Thread.currentThread().getName());
            }
        };

        Thread kasir1 = new Thread(task, "Kasir-A");
        Thread kasir2 = new Thread(task, "Kasir-B");
        Thread kasir3 = new Thread(task, "Kasir-C");

        kasir1.start();
        kasir2.start();
        kasir3.start();

        kasir1.join();
        kasir2.join();
        kasir3.join();

        System.out.println("--- HASIL AKHIR STOK: " + ayamJuicyLuicyGallagher.getRemainingStock() + " ---");
    }
}