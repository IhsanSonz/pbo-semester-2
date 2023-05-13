/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sonzusb.pbopertemuan7;

/**
 *
 * @author mnuri
 */
public class Kalkulator implements Operasi {
    // deklarasi variabel
    private double bil1, bil2;
    
    // constructor
    Kalkulator() {}
    
    Kalkulator(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    } 
    
    // getter
    /**
     * @return the bil1
     */
    public double getBil1() {
        return bil1;
    }

    /**
     * @return the bil2
     */
    public double getBil2() {
        return bil2;
    }
    
    // implementasi method
    @Override
    public void Penjumlahan() {
        System.out.println(bil1 + bil2);
    }

    @Override
    public void Pengurangan() {
        System.out.println(bil1 - bil2);
    }

    @Override
    public double Perkalian() {
        return bil1 * bil2;
    }

    @Override
    public double Pembagian() {
        return bil1 / bil2;
    }

}
