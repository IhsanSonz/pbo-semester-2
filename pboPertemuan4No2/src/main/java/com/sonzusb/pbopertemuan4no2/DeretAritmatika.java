/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sonzusb.pbopertemuan4no2;

import java.util.ArrayList;

/**
 *
 * @author mnuri
 */
public class DeretAritmatika {
    int nilaiAwal, beda, jumlahDeret;
    
    public DeretAritmatika(int nilaiAwal, int beda, int jumlahDeret) {
        this.nilaiAwal = nilaiAwal;
        this.beda = beda;
        this.jumlahDeret = jumlahDeret;
    }
    
    public void generateDeret() {
        var deretAngka = new ArrayList<Integer>();
        
        for (int i = 0; i < this.jumlahDeret; i++) {
            Integer angka = this.nilaiAwal + (beda * i);
            deretAngka.add(angka);
        }
        
        System.out.println("Deret: " + deretAngka.toString());
    }
}
