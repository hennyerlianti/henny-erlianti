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
public class Latihan4_Biodata2 {
    public static void main(String[] args) {
        String nama, jurusan;
        int nim;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        nama=input.nextLine();
        System.out.print("Masukkan NIM Anda : ");
        nim=input.nextInt();
        System.out.print("Masukkan Jurusan Anda : ");
        jurusan=input.next();
        
        System.out.println("---Biodata---");
        System.out.println("Nama    : "+nama);
        System.out.println("NIM     : "+nim);
        System.out.println("Jurusan : "+jurusan);
    }
}
