package Pekan1;

import java.util.Scanner;

    public class Looping {
        public static void main(String[] args) {
            
            int bil, hasil = 1;
            Scanner hab = new Scanner(System.in);
            System.out.println("Masukan Angka Gayn :v :");
            bil = hab.nextInt();
            for (int i = bil; i > 0; i--) {
                hasil = hasil * i;
            }
            System.out.println("Nilai faktorial dari "+bil+" adalah "+hasil);
            
            
        }
    
}
