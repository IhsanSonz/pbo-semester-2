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
public class Dosen extends Pegawai {
    // attribute tambahan untuk dosen
    String nidn;
    
    // constructor
    public Dosen(String id, String nama, int gol, LocalDate tglLahir, String nidn) {
        super(id, nama, gol, tglLahir);
        this.nidn = nidn;
    }
    
    // method menghitung tunjangan pegawai dosen
    public long hitungTunjPegawai() {
        long tunjPegawai = 1500000;
        return tunjPegawai;
    }
    
    // method menghitung tunjangan fungsional dosen
    public long hitungTunjFungsional() {
        long tunjFungsional;
        if (this.hitungUsia() < 40) {
            tunjFungsional = 1700000;
        } else {
            tunjFungsional = 2000000;
        }
        return tunjFungsional;
    }
    
    // method menghitung total gaji
    public long hitungTotalGaji() {
        long total = this.hitungGapok() + this.hitungTunjPegawai() + this.hitungTunjFungsional();
        return total;
    }
    
    // method mencetak data pegawai, rincian gaji, total gaji
    @Override
    public void printPegawai() {
        System.out.println("ID Pegawai      : " + this.idPegawai);
        System.out.println("Nama Pegawai    : " + this.nama);
        System.out.println("Golongan        : " + this.gol);
        System.out.println("Tanggal Lahir   : " + this.tglLahir);
        System.out.println("NIDN            : " + this.nidn);
        System.out.println("Usia            : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok      : Rp " + this.hitungGapok());
        System.out.println("Tunj Pegawai    : Rp " + this.hitungTunjPegawai());
        System.out.println("Tunj Fungsi     : Rp " + this.hitungTunjFungsional());
        System.out.println("Total Gaji      : Rp " + this.hitungTotalGaji());
    }
}
