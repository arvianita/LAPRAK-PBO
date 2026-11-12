public class Soal7 {
    public static void main(String[] args) {
        // i++ : nilai dipakai dulu, baru ditambah 1
        int i = 0;
        System.out.println("Menggunakan i++");
        while (i < 5) {
            System.out.println(i++);   // hasil: 0 1 2 3 4
        }

        // ++j : ditambah 1 dulu, baru nilainya dipakai
        int j = 0;
        System.out.println("Menggunakan ++j");
        while (j < 5) {
            System.out.println(++j);   // hasil: 1 2 3 4 5
        }
    }
}
