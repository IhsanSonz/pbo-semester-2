/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisispertemuan12;

import java.time.LocalDate;

/**
 *
 * @author mnuri
 */
public class NonDosen extends Pegawai {
    //constructor
    public NonDosen(String id, String nama, int gol, LocalDate tglLahir) {
        super(id, nama, gol, tglLahir);
    }
    
    // method menghitung tunjangan pegawai dosen
    public long hitungTunjPegawai() {
        long tunjPegawai = 1000000;
        return tunjPegawai;
    }
    
    // method menghitung total gaji
    public long hitungTotalGaji() {
        long total = this.hitungGapok() + this.hitungTunjPegawai();
        return total;
    }
    
    // method mencetak data pegawai, rincian gaji, total gaji
    @Override
    public void printPegawai() {
        System.out.println("ID Pegawai      : " + this.idPegawai);
        System.out.println("Nama Pegawai    : " + this.nama);
        System.out.println("Golongan        : " + this.gol);
        System.out.println("Tanggal Lahir   : " + this.tglLahir);
        System.out.println("Usia            : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok      : Rp " + this.hitungGapok());
        System.out.println("Tunj Pegawai    : Rp " + this.hitungTunjPegawai());
        System.out.println("Total Gaji      : Rp " + this.hitungTotalGaji());
    }
}
