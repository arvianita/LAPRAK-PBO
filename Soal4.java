import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak angka : ");
        int banyak = input.nextInt();

        int ganjil = 1;
        int total = 0;
        for (int i = 1; i <= banyak; i++) {
            System.out.print(ganjil + " ");
            total = total + ganjil;
            ganjil = ganjil + 2;   // angka ganjil berikutnya
        }

        System.out.println();
        System.out.println("Total penjumlahan : " + total);
    }
}
