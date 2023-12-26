/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mnuri
 */
public class Action {
    private Connection conn;
    Scanner sc = new Scanner(System.in);
    Pengguna pengguna = null;

    public Action(Connection conn) {
        this.conn = conn;
    }
    
    public Pengguna setPengguna() {
        try {
            String q;
            ResultSet rs;
            while (true) {
                System.out.print("Pengguna: ");
                q = sc.nextLine();
                if (!q.isEmpty()) {
                    Statement stmt = conn.createStatement();
                    rs = stmt.executeQuery("SELECT * FROM hak_akses WHERE nama LIKE '%"+q+"%'");
                    if (rs.next() != false) {
                        this.pengguna = new Pengguna(
                            rs.getString("id_pengguna"), 
                            rs.getString("nama"), 
                            rs.getInt("level")
                        );
                    }
                    System.out.println("Pengguna tidak ditemukan, silahkan coba lagi...");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    public void getQuestion() {
        try {
            int level = pengguna.getLevel();
            System.out.println("1. Kerjakan Soal");
            if (level == 1) {
                System.out.println("2. Lihat Progress Teman-Teman");
                System.out.println("3. Lihat Hasil Sendiri");
            } else if (level == 2) {
                System.out.println("2. Lihat Pengerjaan Soal");
            }

            System.out.print("Pilihan: ");
            int q = sc.nextInt();
            if (level == 2 && q > 1) q += 2;
            switch(q) {
                case 1 -> kerjakanSoal();
                case 2 -> lihatProgressTeman();
                case 3 -> lihatHasilSendiri();
                case 4 -> lihatPengerjaanSoal();
                default -> System.out.println("invalid input");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void kerjakanSoal() {
        int score = 0;
        Random r = new Random();
        int low;
        int high;
        for (int i = 0; i < 10; i++) {
            low = 10;
            high = 100;
            int num1 = r.nextInt(high-low) + low;
            int num2 = r.nextInt(high-low) + low;
            System.out.print(num1 + " + " + num2 + " = ");
            int input = sc.nextInt();
            if (num1+num2 == input) {
                score += 10;
            }
        }
        System.out.println("Score anda : " + score);
    }
    
    private void lihatProgressTeman() {
        System.out.println("case lihatProgressTeman");
    }
    
    private void lihatHasilSendiri() {
        System.out.println("case lihatHasilSendiri");
    }
    
    private void lihatPengerjaanSoal() {
        System.out.println("case lihatPengerjaanSoal");
    }
}
