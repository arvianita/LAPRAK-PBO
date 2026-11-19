package laprak_p6;

import java.util.Scanner;

class ThreadLaprak8 extends Thread {

    int nomor;

    ThreadLaprak8(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        System.out.println("Thread anak ke-" + nomor + " sedang berjalan.");
    }
}

public class laprak8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah thread: ");
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah thread harus lebih dari 0!");
            input.close();
            return;
        }

        ThreadLaprak8[] thread = new ThreadLaprak8[jumlah];

        for (int i = 0; i < jumlah; i++) {

            thread[i] = new ThreadLaprak8(i + 1);

            thread[i].start();
        }

        input.close();
    }
}
