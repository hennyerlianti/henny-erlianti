/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan4;

/**
 *
 * @author acer
 */
import javax.swing.JOptionPane;

public class JoptionPane {
    public static void main(String[] args) {
        // Input Nama
        String nama = JOptionPane.showInputDialog("Masukkan nama anda!");
        int umur = 
        Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur anda!"));
        //Print
        System.out.println("Hai "+ nama + umur + " tahun."); 
    }
    
} 
