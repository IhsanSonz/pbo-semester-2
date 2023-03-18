/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sonzusb.pbouts;

/**
 *
 * @author mnuri
 */
public class PegawaiHonorer extends Pegawai {
    private final int tarif_kehadiran = 150000;
    private int kehadiran;
    
    public PegawaiHonorer() {
        super();
        this.setInsentif();
    }
    
    private void setInsentif() {
        System.out.print("Silahkan isi kehadiran (1-20): ");
        this.kehadiran = sc.nextInt();
        this.setInsentif(tarif_kehadiran * kehadiran);
    }
}
