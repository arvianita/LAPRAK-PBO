package tgs2;
public class KonversiSuhu {
    public static void main(String[] args) {
               double c = 10;
        double f = 15;
        double r = 5;
        
        System.out.println("Konversi celcius ke Fahrenhait dan sebaliknya");
        double ctof = c * 9/5 + 32;
        double ftoc = (f-32) * 5/9;
        System.out.println("nilai f dari c = " + ctof);
        System.out.println("nilai c dari f = " + ftoc);
        
        System.out.println("\nKonversi Celcius ke Reamor dan sebaliknya");
        double ctor = c * 4/5;
        double rtoc = r * 5/4;
        System.out.println("Nilai r dari c = " + ctor);
        System.out.println("Nilai c dari r = " + rtoc);
        
        System.out.println("\nKonversi Fahrenheit ke Reamor dan sebaliknya");
        double ftor = (f - 32) * 4/9;
        double rtof = r * 9/4 + 32;
        System.out.println("Nilai r dari f = " + ftor);
        System.out.println("Nilai f dari r = " + rtof);
    }
 
    }

