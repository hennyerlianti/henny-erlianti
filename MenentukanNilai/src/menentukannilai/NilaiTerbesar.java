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
public class NilaiTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai1, nilai2, nilai3;
        System.out.print("Masukkan nilai pertama = ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua = ");
        nilai2 = input.nextInt();
        System.out.print("Masukkan nilai ketiga = ");
        nilai3 = input.nextInt();
        if(nilai1 > nilai2 && nilai1 > nilai3){
           System.out.println("Nilai 1 yang terbesar");
        }if(nilai2 > nilai1 && nilai2 > nilai3){
           System.out.println("Nilai 2 yang terbesar");
        }if(nilai3 > nilai2 && nilai3 > nilai1){
           System.out.println("Nilai 3 yang terbesar");
        }else{
            System.out.println("Semua nilai sama besarnya");
        }
            
    
    }     
    }     
    
        
