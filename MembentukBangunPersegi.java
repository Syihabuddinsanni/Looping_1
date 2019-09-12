package Pekan1;
    
import java.util.Scanner;

    public class MembentukBangunPersegi {
    public static void main(String[] args) {
     
        int sisi;
        
        Scanner hab = new Scanner(System.in);
     System.out.println("Masukan jumlah sisi persegi : ");
     sisi = hab.nextInt();
     
     for (int i = 1; i <= sisi; i++) {
         for (int j = 1; j <= sisi; j++) {
             System.out.print(" * ");
             
             
         }
         System.out.println("");
     }
     
}
    }