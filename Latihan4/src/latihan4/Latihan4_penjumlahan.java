/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Latihan4_penjumlahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai1 = ");
        int nilai1 = input.nextInt();
        
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = input.nextInt();
        
        // Hitung dan Print
        
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
}
}
