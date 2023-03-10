/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sonzusb.pbopertemuan4no2;

import java.util.Scanner;

/**
 *
 * @author mnuri
 */
public class PboPertemuan4No2 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        while (true) {
            System.out.print("\nMasukkan nilai awal: ");
            int nilaiAwal = myObj.nextInt();
            System.out.print("Masukkan beda angka: ");
            int beda = myObj.nextInt();
            System.out.print("Masukkan jumlah deret angka: ");
            int jumlahDeret = myObj.nextInt();
            
            DeretAritmatika angka = new DeretAritmatika(nilaiAwal, beda, jumlahDeret);
            angka.generateDeret();
            
            System.out.print("Apakah akan lanjut (y/N): ");
            String next = myObj.next();
            if (!next.equals("y")) break;
        }
    }
}
