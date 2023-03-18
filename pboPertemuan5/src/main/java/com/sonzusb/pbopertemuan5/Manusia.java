/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sonzusb.pbopertemuan5;

import java.util.Scanner;

/**
 *
 * @author ihsan
 */
public class Manusia {
    private String nama, alamat;

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void insertDataDiri() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String inpNama = sc.nextLine();
        this.setNama(inpNama);
        System.out.print("Masukkan alamat : ");
        String inpAlamat = sc.nextLine();
        this.setAlamat(inpAlamat);
    }
}
