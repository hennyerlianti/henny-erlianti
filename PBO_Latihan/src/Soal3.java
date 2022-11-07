/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author acer
 */
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
       String nama;
       int nim;
       int semester;
       String kelas;
       Scanner inputan = new Scanner(System.in).useDelimiter("\n");
       System.out.print("Masukkan Nama     : ");
       nama = inputan.next();
       System.out.print("Masukkan NIM      : ");
       nim = inputan.nextInt();
       System.out.print("Masukkan Semester : ");
       semester = inputan.nextInt();
       System.out.print("Masukkan Kelas    : ");
       kelas = inputan.next();
       
       System.out.println("----Hasil----");
       System.out.println("Nama     : "+nama);
       System.out.println("NIM      : "+nim);
       System.out.println("Semester : "+semester);
       System.out.println("Kelas    : "+kelas);
    }
    
}
