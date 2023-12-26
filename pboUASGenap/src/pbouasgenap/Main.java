/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbouasgenap;

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
                    "jdbc:mysql://localhost:3306/dbuniversitas", 
                    "root", 
                    ""
            );
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM dosen ORDER BY nidn");
            while (rs.next()) {
                Dosen dosen = new Dosen(
                    rs.getString("nidn"), 
                    rs.getString("nama"), 
                    rs.getString("fakultas"),
                    rs.getInt("golongan")
                );
                dosen.printDataDosen();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
