public class Soal5 {
    public static void main(String[] args) {
        int tinggi = 5;

        // ===== Half Triangle =====
        System.out.println("Half Triangle");
        for (int i = 1; i <= tinggi; i++) {
            // cetak spasi
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            // cetak bintang
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // ===== Full Triangle =====
        System.out.println("Full Triangle");
        // bagian atas
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // bagian bawah
        for (int i = tinggi - 1; i >= 1; i--) {
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
