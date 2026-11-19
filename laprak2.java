package laprak_p6;

public class laprak2 {
    public static void main(String[] args) {
        String[] mobil = {"Toyota", "Honda", "Mitsubishi", "Daihatsu", "Wuling"};
        mobil[2] = "Nissan";

        System.out.println("Array Setelah Diubah:");

        for (int i = 0; i < mobil.length; i++) {
            System.out.println("Indeks " + i + " : " + mobil[i]);
        }
    }
}
