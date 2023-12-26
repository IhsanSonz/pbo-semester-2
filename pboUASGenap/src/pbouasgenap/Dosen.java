/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbouasgenap;

/**
 *
 * @author mnuri
 */
public class Dosen {
    private String nidn, nama, fakultas;
    private int golongan;
    
    public Dosen(String nidn, String nama, String fakultas, int golongan) {
        this.nidn = nidn;
        this.nama = nama;
        this.fakultas = fakultas;
        this.golongan = golongan;
    }
    
    public void printDataDosen() {
        System.out.println("==================== Data Dosen "+nidn+" ========================");
        System.out.println("NIDN     : " + nidn);
        System.out.println("Nama     : " + nama);
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Golongan : " + IntToRoman.intToRoman(golongan));
        System.out.println("==============================================================");
    }
}
