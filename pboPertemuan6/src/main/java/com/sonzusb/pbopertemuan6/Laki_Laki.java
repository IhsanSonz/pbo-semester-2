/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sonzusb.pbopertemuan6;

/**
 *
 * @author ihsan
 */
public class Laki_Laki extends Manusia {
    //constructor
    public Laki_Laki(double TB) {
        super(TB);
    }
    
    //method HtgBBI merupakan method overriding dari superclass-nya
    @Override
    public double HtgBBI() {
        return (super.getTB() - 100) * 0.9;
    }
}
