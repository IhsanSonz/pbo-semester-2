/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisispertemuan12;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author mnuri
 */
public class Pegawai {
    // attribute
    String idPegawai;
    String nama;
    int gol;
    LocalDate tglLahir;
    
    // constructor
    public Pegawai(String id, String nama, int gol, LocalDate tglLahir) {
        this.idPegawai = id;
        this.nama = nama;
        this.gol = gol;
        this.tglLahir = tglLahir;
    }
    
    // method menghitung usia pegawai
    public int hitungUsia() {
        // mendapatkan tanggal hari ini
        LocalDate today = LocalDate.now();
        // hitung selisih tgl lahir dan tgl hari ini
        Period selisih = Period.between(tglLahir, today);
        return selisih.getYears();
    }
    
    // method hitung gaji pokok berdasarkan golongan dan usia
    public long hitungGapok() {
        long gapok = 0;
        if (this.gol == 1) {
            if (this.hitungUsia() < 40) {
                gapok = 3500000;
            } else {
                gapok = 4500000;
            }
        } else if (this.gol == 2) {
            if (this.hitungUsia() < 40) {
                gapok = 5000000;
            } else {
                gapok = 6000000;
            }
        }
        return gapok;
    }
    
    // method mencetak data pegawai dan gaji pokoknya
    public void printPegawai() {
        System.out.println("ID Pegawai      : " + this.idPegawai);
        System.out.println("Nama Pegawai    : " + this.nama);
        System.out.println("Golongan        : " + this.gol);
        System.out.println("Tanggal Lahir   : " + this.tglLahir);
        System.out.println("Gaji Pokok      : Rp " + this.hitungGapok());
    }
}
