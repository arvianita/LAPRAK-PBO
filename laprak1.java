package laprak_p6;

public class laprak1 {
    public static void main(String[] args) {
        int[] data1 = new int[5];
        int[] data2 = new int[5];
        int[] data3 = {7, 14, 28, 42, 63};

        System.out.println("Hasil Array ke-1:");
        for (int i = 0; i < data1.length; i++) {
            System.out.print(data1[i] + " ");
        }
        System.out.println("\n\nHasil Array ke-2:");
        for (int i = 0; i < data2.length; i++) {
            System.out.print(data2[i] + " ");
        }
        System.out.println("\n\nHasil Array ke-3:");
        for (int i = 0; i < data3.length; i++) {
            System.out.print(data3[i] + " ");
        }
    }
}
