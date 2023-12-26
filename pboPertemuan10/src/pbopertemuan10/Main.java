/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbopertemuan10;

import java.sql.*;
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
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pbo_pertemuan10", 
                    "root", 
                    ""
            );
            Action act = new Action(conn);
            
            while (true) {
                act.setPengguna();
                act.getQuestion();
                
                System.out.print("Apakah akan lanjut (Y/n): ");
                String next = sc.next();
                if (!next.equals("y")) break;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
