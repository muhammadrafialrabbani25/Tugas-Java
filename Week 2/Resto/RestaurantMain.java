public class RestaurantMain {
    public static void main(String[] args) {

        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Pizza", 250000, 5);
        menu.tambahMenuMakanan("Spaghetti", 80000, 3);
        menu.tambahMenuMakanan("Steak", 60000, 2);
        menu.tambahMenuMakanan("Chicken", 45000, 4);

        System.out.println("DAFTAR MENU MAKANAN:");
        menu.tampilMenuMakanan();

        System.out.println("\nPESANAN:");
        menu.pesanMenu("Pizza", 2);
        menu.pesanMenu("Spaghetti", 5); //kondisi stok tidak cukup
        menu.pesanMenu("Burger", 1);    //kondisi menu tidak ada

        System.out.println("\nDAFTAR MENU MAKANAN SETELAH PESAN:");
        menu.tampilMenuMakanan();
    }
}