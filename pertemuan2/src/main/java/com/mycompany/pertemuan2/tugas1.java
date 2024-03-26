/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan2;
import java.util.Scanner;

/**
 *
 * @author Abdulloh Mun'am
 */
public class tugas1 {
    
    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 20;
        double nilaiC = 30.5;
        double nilaiD = 40.5;
        boolean isPlus;
        isPlus = true;
        
        System.out.println("nilaiA = " + nilaiA);
        System.out.println("nilaiB = " + nilaiB);
        System.out.println("nilaiC = " + nilaiC);
        System.out.println("nilaiD = " + nilaiD);
        System.out.println("isPlus = " + isPlus);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai baru untuk nilaiA");
        nilaiA = input.nextInt();
        System.out.println("Masukkan nilai baru untuk nilaiB");
        nilaiB = input.nextInt();
        System.out.println("Masukkan nilai baru untuk nilaiC");
        nilaiC = input.nextDouble();
        System.out.println("Masukkan nilai baru untuk nilaiD");
        nilaiD = input.nextDouble();
        System.out.println("Masukkan nilai baru untuk isPlus");
        isPlus = input.nextBoolean();
        
        System.out.println("nilaiA = " + nilaiA);
        System.out.println("nilaiB = " + nilaiB);
        System.out.println("nilaiC = " + nilaiC);
        System.out.println("nilaiD = " + nilaiD);
        System.out.println("isPlus = " + isPlus);
        
        String nama;
        System.out.println("Masukkan nama anda: ");
        nama = input.nextLine();
        nama = input.nextLine();
        System.out.println("nama anda adalah: " +nama);
        
    }
}
