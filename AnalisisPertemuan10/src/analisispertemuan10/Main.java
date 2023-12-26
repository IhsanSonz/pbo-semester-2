/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisispertemuan10;

import java.util.Scanner;

/**
 *
 * @author mnuri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Aritmatika aritmatika = new Aritmatika();

            while (true) {
                System.out.print("Bilangan 1: ");
                aritmatika.setBilangan1(sc.nextInt());
                System.out.print("Bilangan 2: ");
                aritmatika.setBilangan2(sc.nextInt());
                System.out.print("Bilangan 3: ");
                aritmatika.setBilangan3(sc.nextInt());
                
                System.out.println("Rata-rata 3 bilangan: " + aritmatika.hitungRataRata());
                
                System.out.print("Apakah akan lanjut (Y/n): ");
                String next = sc.next();
                if (!next.equals("y")) break;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
