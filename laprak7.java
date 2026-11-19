package laprak_p6;

class ThreadLaprak7 extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 8; i++) {
            System.out.println("Thread berjalan: " + i);
        }
    }
}

public class laprak7 {
    public static void main(String[] args) {

        ThreadLaprak7 thread = new ThreadLaprak7();

        thread.start();
    }
}
