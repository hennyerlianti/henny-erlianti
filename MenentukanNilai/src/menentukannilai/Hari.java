/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menentukannilai;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Hari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noHari ;
        System.out.println("Masukan no hari : ");
        noHari=input.nextInt();
                switch(noHari) {
         case 1:
             System.out.println("Senin");
             break;
         case 2:
             System.out.println("Selasa");
             break;
         case 3:
             System.out.println("Rabu");
             break;
         case 4:
             System.out.println("Kamis");
             break;
         case 5:
             System.out.println("Jum'at");
             break;
         case 6:
             System.out.println("Sabtu");
             break;
         case 7:
             System.out.println("Minggu");
             break;
         default :
             System.out.println("Tidak ada hari ke- "+noHari);
     } 
    }
    
}
