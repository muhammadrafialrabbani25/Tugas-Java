import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Berapa data?");
        int t = sc.nextInt();

        for(int i = 1; i<=t;i++){
            System.out.println("Masukkan data ke " + i +":");
            int n = sc.nextInt();           
            if (n>=-128 && n<=127){
                System.out.println(n + " dapat disimpan dalam: ");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if (n>=-32768 && n<=32767){
                System.out.println(n + " dapat disimpan dalam: ");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if (n>=-2147483648 && n<=2147483647){
                System.out.println(n + " dapat disimpan dalam: ");
                System.out.println("* int");
                System.out.println("* long");
            }
            else {
                System.out.println(n + " dapat disimpan dalam: ");
                System.out.println("* long");
            }            
        }


        


 

    }
}