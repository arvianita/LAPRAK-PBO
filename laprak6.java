package laprak_p6;

import java.util.Scanner;

public class laprak6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah bilangan harus lebih dari 0!");
            return;
        }

        double[] angka = new double[n];
        double jumlah = 0;

        for (int i = 0; i < n; i++) {

            boolean benar = false;

            while (!benar) {
                try {
                    System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");

                    angka[i] = Double.parseDouble(input.next());

                    jumlah += angka[i];
                    benar = true;

                } catch (NumberFormatException e) {
                    System.out.println("Error! Input harus berupa angka.");
                }
            }
        }

        double rataRata = jumlah / n;

        System.out.println("\nJumlah bilangan: " + jumlah);
        System.out.println("Nilai rata-rata: " + rataRata);

        input.close();
    }
}
