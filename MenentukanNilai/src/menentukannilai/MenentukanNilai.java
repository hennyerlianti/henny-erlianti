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
public class MenentukanNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai1, nilai2, besar;
        System.out.print("Masukkan nilai pertama = ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua = ");
        nilai2 = input.nextInt();
        if(nilai1 > nilai2)
            besar = nilai1;
        else
            besar = nilai2;
            System.out.println("Nilai Terbesar adalah " +besar);
        }
    }
