/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sonzusb.pbopertemuan4;

import java.util.Scanner;

/**
 *
 * @author mnuri
 */
public class PboPertemuan4 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        while (true) {
            System.out.print("\nMasukkan nomor yang akan dicek: ");
            int num = myObj.nextInt();
            Angka angka = new Angka(num);
            System.out.println("Detail angka " + num + ": " + angka.getDetail());
            
            System.out.print("Apakah akan lanjut (y/N): ");
            String next = myObj.next();
            if (!next.equals("y")) break;
        }
    }
}
