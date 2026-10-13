
package tgs2;
public class JarakBumi {
     public static void main(String[] args) {
        double bulan = 384400;
        double matahari = 152100000;
        double cahaya = 300000;
        double wt_bulan = bulan / cahaya;
        double wt_matahari = matahari / cahaya;
        
        System.out.println("Waktu tempuh bumi - bulan = " + wt_bulan + " detik");
        System.out.println("Waktu tempuh bumi - matahari = " + wt_matahari + " detik");
    }
}
