package Pekan1;
    
import java.util.Scanner;

    public class MembentukPersegiPanjang {
        public static void main(String[] ars) {
    int panjang, lebar;
    
    Scanner hab = new Scanner(System.in);
    {
    System.out.println("Masukan Nilai Lebar : ");
    panjang = hab.nextInt();
    System.out.println("Masukan Nilai Lebar : ");
    lebar = hab.nextInt();
    
    for (int i = 1; i <= lebar; i++) {
        for (int j = 1; j <= panjang; j++) {
            System.out.print(" * ");
            
        }
        System.out.println("");
    }
    
}
    }
    }
