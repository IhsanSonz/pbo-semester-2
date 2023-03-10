/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sonzusb.pbopertemuan3;

import java.util.Scanner;

/**
 *
 * @author mnuri
 */
public class PboPertemuan3 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String userName = myObj.nextLine();

        System.out.print("Masukkan gaji pokok : ");
        double gajiPokok = myObj.nextDouble();

        System.out.print("Masukkan masa kerja : ");
        double masaKerja = myObj.nextDouble();

        System.out.print("masukkan insentif : ");
        double insentif = myObj.nextDouble();

        double gaji = (gajiPokok * masaKerja) + insentif;
        System.out.println();
        System.out.println("Nama pegawai : " + userName);
        System.out.println("Gaji : " + gaji);
        System.out.println();
    }
}

