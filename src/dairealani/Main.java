
import java.util.Scanner;
/**
 * @author Furkan Aydemir, deerborg
 * @since 2024
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double r,a,alan,pi,cevre,secAlan;
        pi = 3.14;
        
        // kullanicidan yari cap ve merkez acisi olcusu degerleri saklanir
        System.out.println("Yari capi giriniz: ");
        r = scanner.nextDouble();
        System.out.println("Merkez acisi olcusunu giriniz: ");
        a = scanner.nextDouble();
        
        // alinan degerler cıktıda istenen degerlere ulasmak icin asagidaki formule islenir
        alan = pi * r * r;
        cevre = 2 * pi * r;
        secAlan = (pi * (r*r) * a) / 360;
        
        System.out.println("Dairenin cevresi: " + cevre);
        System.out.println("Dairenin alani : " + alan);
        System.out.println("Daire diliminin alani: " + secAlan); 
    }
 
}
