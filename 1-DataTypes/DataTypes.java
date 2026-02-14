import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Berapa data?");
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.println("Masukkan data ke " + i + ":");
            String input = sc.next();

            try {
                long n = Long.parseLong(input);

                System.out.println(n + " can be fitted in:");

                if (n >= -128 && n <= 127)
                    System.out.println("* byte");
                if (n >= -32768 && n <= 32767)
                    System.out.println("* short");
                if (n >= -2147483648 && n <= 2147483647)
                    System.out.println("* int");
                System.out.println("* long");

            } catch (NumberFormatException e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
