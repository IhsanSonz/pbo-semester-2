/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbopertemuan9;

import java.sql.*;

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
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pbo_pertemuan9", 
                    "root", 
                    ""
            );
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM mahasiswa");
            while (rs.next()) {
                System.out.println("NIM : " + rs.getString("nim"));
                System.out.println("Nama : " + rs.getString("nama"));
                System.out.println("Angkatan : " + rs.getString("angkatan"));
                System.out.println("Kelas : " + rs.getString("kelas"));
                System.out.println("===========================================");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
