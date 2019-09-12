package Pekan1;

import java.util.Scanner;

    public class MembangunSegitigaSiku {
    public static void main(String[] args) {
        
        int tinggi;
        Scanner hab = new Scanner(System.in);
        System.out.println("Masukan jumlah tinggi segitiga : ");
        tinggi = hab.nextInt();
        
        int i = 1;
        int j;
        while(i<=tinggi) {
            j = 1;
            while(j<=i) {
                System.out.print(" * ");
                j++;
            }
        
        System.out.println("");
        i++;
        }
    }
    }
