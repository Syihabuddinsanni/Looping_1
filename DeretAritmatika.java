package Pekan1;

import java.util.Scanner;

    public class DeretAritmatika {
    public static void main(String[] args) {
        int a, b, jumlah;
        Scanner hab = new Scanner(System.in);
        System.out.println("Masukan Nilai suku awal : ");
        a = hab.nextInt();
        
        System.out.println("Masukan Nilai beda tiap suku : ");
        b = hab.nextInt();
        
        System.out.println("Masukan jumlah suku : ");
        jumlah = hab.nextInt();
        
        System.out.println("Berikut tampilan deret aritmatika!!!!!! ");
        int i = 1;
        do {
            System.out.print(a + " ");
            a+=b;
            i++;
        }while(i<jumlah);
        }
}
    