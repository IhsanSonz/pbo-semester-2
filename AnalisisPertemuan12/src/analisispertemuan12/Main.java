/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisispertemuan12;

import java.time.LocalDate;

/**
 *
 * @author mnuri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // contoh objek data pegawai
        Pegawai p1 = new Pegawai("P01", "Rosihan Ari", 2, LocalDate.of(1979, 9, 1));
        p1.printPegawai();
        
        // contoh objek data pegawai dosen
        Dosen p2 = new Dosen("P02", "Dwi Amalia Fitriani", 1, LocalDate.of(1979, 9, 17), "8888");
        p2.printPegawai();
        
        // contoh objek data pegawai nondosen
        NonDosen p3 = new NonDosen("P03", "Faza Fauzan K", 1, LocalDate.of(2008, 1, 25));
        p3.printPegawai();
    }

}
