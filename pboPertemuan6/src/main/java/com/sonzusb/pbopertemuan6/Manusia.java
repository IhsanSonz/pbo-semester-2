/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sonzusb.pbopertemuan6;

/**
 *
 * @author ihsan
 */
abstract class Manusia {
    //deklarasi variabel 
    private double TinggiBadan;
    
    //constructor
    public Manusia(double TB) {
        TinggiBadan = TB;
    }
    
    //getter
    public double getTB() {
        return TinggiBadan;
    }
    
    //Method HtgBBI
    public double HtgBBI() {
        return 0.0;
    }
}
