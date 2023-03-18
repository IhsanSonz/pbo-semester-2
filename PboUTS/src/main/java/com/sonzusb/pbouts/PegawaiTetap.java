/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sonzusb.pbouts;

/**
 *
 * @author mnuri
 */
public class PegawaiTetap extends Pegawai {
    private final int tarif_beban_kerja = 800000;
    private int beban_kerja;
    
    public PegawaiTetap() {
        super();
        this.setInsentif();
    }
    
    private void setInsentif() {
        System.out.print("Silahkan isi beban kerja (1-5): ");
        this.beban_kerja = sc.nextInt();
        this.setInsentif(tarif_beban_kerja * beban_kerja);
    }
}
