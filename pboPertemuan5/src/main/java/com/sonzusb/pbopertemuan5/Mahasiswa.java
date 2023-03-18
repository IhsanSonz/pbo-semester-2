/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sonzusb.pbopertemuan5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ihsan
 */
public class Mahasiswa extends Manusia {
    private String nim;
    private int jurusan;
    private Map<Integer, String> listJurusan = new HashMap<Integer, String>() {{
        put(61, "MATEMATIKA");
        put(62, "BIOLOGI");
        put(63, "KIMIA");
        put(64, "FISIKA");
        put(65, "TEKNIK INFORMATIKA");
        put(66, "TEKNIK ARSITEKTUR");
    }};

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * @return the jurusan
     */
    public int getJurusan() {
        return jurusan;
    }

    /**
     * @param jurusan the jurusan to set
     */
    public void setJurusan(int jurusan) {
        this.jurusan = jurusan;
    }
    
    public void pilihJurusan() {
        System.out.println("Silahkan pilih jurusan anda: ");
        for (var dataJurusan : listJurusan.entrySet()) {
            System.out.println("\t\t" + dataJurusan.getKey() + " = " + dataJurusan.getValue());
        }
        while (true) {
            System.out.print("Pilihan anda: ");
            Scanner sc = new Scanner(System.in);
            int inpJurusan = sc.nextInt();
            if (listJurusan.containsKey(inpJurusan)) {
                this.setJurusan(inpJurusan);
                break;
            } else {
                System.out.println("Tidak ada jurusan dengan id tersebut!");
            }
        }
    }
    
    @Override
    public void insertDataDiri() {
        System.out.println("");
        super.insertDataDiri();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        String inpNim = sc.nextLine();
        this.setNim(inpNim);
        
        this.pilihJurusan();
    }
    
    public void printDataDiri() {
        System.out.println("===== DATA MAHASISWA =====");
        System.out.println("NIM: " + this.getNim());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Alamat: " + this.getAlamat());
        System.out.println("Jurusan: " + listJurusan.get(this.getJurusan()));
        System.out.println("==========================");
    }
}
