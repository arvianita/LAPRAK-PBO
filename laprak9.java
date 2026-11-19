package laprak_p6;

public class laprak9 {
    public static void main(String[] args) {

        int[] age = {21, 17, 9, 33, 14};

        System.out.println("Menggunakan For:");

        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        System.out.println("\nMenggunakan While:");

        int i = 0;

        while (i < age.length) {
            System.out.println(age[i]);
            i++;
        }
    }
}
