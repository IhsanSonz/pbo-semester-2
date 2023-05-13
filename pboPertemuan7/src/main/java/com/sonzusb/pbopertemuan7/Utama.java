/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.sonzusb.pbopertemuan7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author mnuri
 */
public class Utama {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        // instance of class
        Kalkulator k;
        // k = new Kalkulator(); // never used

        // input
        System.out.print("Masukkan bilangan pertama: ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Masukkan bilangan kedua: ");
        double b = Double.parseDouble(br.readLine());

        k = new Kalkulator(a, b);

        System.out.println();

        // output
        System.out.print("Hasil Penjumlahan = ");
        k.Penjumlahan();

        System.out.print("Hasil Pengurangan = ");
        k.Pengurangan();

        System.out.println("Hasil Perkalian = " + k.Perkalian());

        System.out.println("Hasil Pembagian = " + k.Pembagian());
    }
}
