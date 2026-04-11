class SumTask extends Thread {
    int start, end;
    static int total = 0;

    public SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println(getName() + " hitung " + start + "-" + end + " = " + sum);

        add(sum);
    }

    public static synchronized void add(int value) {
        total += value;
    }
}

public class SumParalel {
    public static void main(String[] args) throws Exception {
        int n = 1000;
        int jumlahThread = 4;

        int range = n / jumlahThread;

        SumTask t1 = new SumTask(1, range);
        SumTask t2 = new SumTask(range + 1, range * 2);
        SumTask t3 = new SumTask(range * 2 + 1, range * 3);
        SumTask t4 = new SumTask(range * 3 + 1, n);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("total = " + SumTask.total);
    }
}