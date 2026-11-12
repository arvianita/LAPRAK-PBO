import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan : ");
        int jumlah = input.nextInt();

        int total = 0;
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            int angka = input.nextInt();
            total = total + angka;
        }

        double rataRata = (double) total / jumlah;

        System.out.println("Total jumlah : " + total);
        System.out.println("Rata-rata    : " + rataRata);
    }
}
