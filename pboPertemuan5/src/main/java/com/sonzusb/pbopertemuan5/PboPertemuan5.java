/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sonzusb.pbopertemuan5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ihsan
 */
public class PboPertemuan5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama Universitas: ");
        String namaUni = sc.nextLine();
        
        Universitas uni = new Universitas();
        uni.setNama(namaUni);
        
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
        
        while (true) {
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.insertDataDiri();
            listMahasiswa.add(mahasiswa);
            
            System.out.print("Apakah akan lanjut (y/N): ");
            String next = sc.next();
            if (!next.equals("y")) break;
        }
        
        System.out.println("");
        System.out.println("Nama Universitas: " +uni.getNama());
        listMahasiswa.forEach((mahasiswa) -> {
            mahasiswa.printDataDiri();
        });
    }
}
