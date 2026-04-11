class Account {
    int balance = 150;
}

public class TransferFulus {
    public static void main(String[] args) throws InterruptedException {
        Account acc1 = new Account();
        Account acc2 = new Account();

        // Thread 1: Menjumlahkan/ transfer fulus dari acc1 ke acc2
        Thread t1 = new Thread(() -> {
            synchronized (acc1) { 
                //mengunci objek acc1 agar hanya satu thread yang dapat mengakses acc1 pada satu waktu (mutual exclusion)
                //mencegah race condition saat membaca atau memodifikasi balance acc1

                System.out.println("Thread 1 sedang mengunci acc1 dan bersiap melakukan transfer ke acc2");

                try { Thread.sleep(100); } catch (Exception e) {} 
                //memberikan jeda eksekusi untuk mensimulasikan proses nyata dan meningkatkan kemungkinan konflik antar thread
                //harus menggunakan try-catch karena Thread.sleep dapat melempar InterruptedException

                synchronized (acc2) { 
                //setelah berhasil mengunci acc1, thread mencoba mengunci acc2
                //dengan urutan lock yang konsisten (acc1 -> acc2), deadlock dapat dihindari

                    System.out.println("Thread 1 mengunci acc2 dan mentransfer saldo dari acc1 ke acc2");

                    acc2.balance += acc1.balance;
                    //menambahkan seluruh saldo acc1 ke acc2 (simulasi transfer)
                }
            }
        });

        // Thread 2: Menjumlahkan/ transfer fulus dari acc2 ke acc1
        Thread t2 = new Thread(() -> {
            synchronized (acc1) { 
                //mengunci objek acc1 terlebih dahulu (urutan sama seperti thread 1 untuk menghindari deadlock)

                System.out.println("Thread 2 sedang mengunci acc1 dan bersiap melakukan transfer dari acc2");

                try { Thread.sleep(100); } catch (Exception e) {}
                //simulasi delay untuk memperlihatkan potensi masalah pada concurrent execution

                synchronized (acc2) { 
                //mengunci acc2 setelah acc1 untuk menjaga konsistensi urutan penguncian antar thread

                    System.out.println("Thread 2 mengunci acc2 dan mentransfer saldo dari acc2 ke acc1");

                    acc1.balance += acc2.balance;
                    //menambahkan seluruh saldo acc2 ke acc1 (simulasi transfer)
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        //method join digunakan agar thread utama menunggu kedua thread selesai sebelum mencetak hasil akhir

        System.out.println("--- HASIL AKHIR ---");
        System.out.println("Saldo Akhir acc1: " + acc1.balance);
        System.out.println("Saldo Akhir acc2: " + acc2.balance);
    }
}