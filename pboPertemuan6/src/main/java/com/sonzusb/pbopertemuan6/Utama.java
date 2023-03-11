/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sonzusb.pbopertemuan6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ihsan
 */
public class Utama {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        //instance of class
        Manusia[] m = new Manusia[2];
        
        //deklarasi variabel
        int x = 0;
        
        do {
            //input
            System.out.println("User " + (x+1));
            System.out.print("Masukkan tinggi badan anda (cm) = ");
            double t = Double.parseDouble(br.readLine());
            System.out.print("Masukkan jenis kelamin anda (L/P) = ");
            String jk = br.readLine();
            
            if (jk.toUpperCase().equals("L")) {
                m[x] = new Laki_Laki(t);
                System.out.println("Berat badan ideal laki-laki ini adalah "
                        + m[x].HtgBBI());
                System.out.println("");
            } else {
                m[x] = new Perempuan(t);
                System.out.println("Berat badan ideal perempuan ini adalah "
                        + m[x].HtgBBI());
                System.out.println("");
            }
            x++;
        } while (x < 2);
    }
    
}
