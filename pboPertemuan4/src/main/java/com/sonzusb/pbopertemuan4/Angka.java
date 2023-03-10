/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sonzusb.pbopertemuan4;

/**
 *
 * @author mnuri
 */
public class Angka {
    int num;
    
    public Angka(int num) {
        this.num = num;
    }
    
    public String getDetail() {
        String jenis, status;
        
        if (this.num == 0) {
            return "Nilai sama dengan Nol";
        }
        
        if (this.num > 0) {
            jenis = "Positif";
        } else {
            jenis = "Negatif";
        }
        
        if (this.num % 2 == 0) {
            status = "Genap";
        } else {
            status = "Ganjil";
        }
        
        return jenis + " " + status;
    }
}
