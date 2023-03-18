/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sonzusb.pbouts;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mnuri
 */
public class Pegawai {
    private String nama;
    private final int gaji_pokok = 2500000;
    private int insentif;
    protected final Scanner sc = new Scanner(System.in);
    Locale locale = new Locale("id", "ID");      
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    
    public Pegawai() {
        this.setNama();
    }

    private void setNama() {
        System.out.print("Silahkan masukkan nama pegawai: ");
        this.nama = sc.nextLine();
    }

    public void setInsentif(int insentif) {
        this.insentif = insentif;
    }
    
    public void hitungGaji() {
        int total_gaji = gaji_pokok + insentif;
        System.out.println(
                "Total gaji " + this.nama + 
                " adalah sebesar " + 
                currencyFormatter.format(total_gaji)
        );
    }
    
}
