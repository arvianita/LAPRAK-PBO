
package tgs2;
public class SegitigaPhytagoras {
    public static void main(String[] args) {
         double a = 6;
        double b = 8;

        // Rumus Pythagoras: c = sqrt(a^2 + b^2)
        double c = Math.sqrt((a * a) + (b * b));

        // Keliling = a + b + c
        double keliling = a + b + c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c (Pythagoras) = " + c);
        System.out.println("Keliling Segitiga = " + keliling);
    }
}
    
