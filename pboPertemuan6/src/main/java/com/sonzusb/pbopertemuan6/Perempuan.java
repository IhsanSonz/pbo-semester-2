/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sonzusb.pbopertemuan6;

/**
 *
 * @author ihsan
 */
final class Perempuan extends Manusia {
    //constructor
    public Perempuan(double TB) {
        super(TB);
    }
    
    //method double HtgBBI merupakan method overriding dari superclass-nya
    public double HtgBBI() {
        return (super.getTB() - 100) * 0.8;
    }
}
