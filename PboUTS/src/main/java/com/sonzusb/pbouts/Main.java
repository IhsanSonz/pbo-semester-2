/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sonzusb.pbouts;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mnuri
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pegawai> listPegawai = new ArrayList();
        
        while (true) {
            System.out.println("Silahkan pilih tipe pegawai ");
            System.out.println("\t1. Pegawai Tetap");
            System.out.println("\t2. Pegawai Honorer");
            System.out.print("Masukkan pilihan anda: ");
            int type = sc.nextInt();
            
            switch (type) {
                case 1 ->  {
                    PegawaiTetap pegawai = new PegawaiTetap();
                    listPegawai.add(pegawai);
                }
                case 2 ->  {
                    PegawaiHonorer pegawai = new PegawaiHonorer();
                    listPegawai.add(pegawai);
                }
                default ->  {
                    System.out.println("Silahkan masukkan tipe pegawai dengan benar!");
                    System.out.println("");
                }
            }
            
            System.out.print("Apakah akan lanjut (y/N): ");
            String next = sc.next();
            System.out.println("");
            if (!next.equals("y")) break;
        }
        
        System.out.println("Rekap gaji pegawai: ");
        listPegawai.forEach((pegawai) -> {
            pegawai.hitungGaji();
        });
    }
}
