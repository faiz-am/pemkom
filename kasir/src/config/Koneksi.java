/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class Koneksi {
    private static Connection conn;
    public static Connection configDB()throws SQLException{
        try{
            String url= "jdbc:mysql://localhost:3306/_pointofsales";
            String ussername = "root";
            String password= "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = (Connection) DriverManager.getConnection(url,ussername,password);
        } catch (Exception e) {
            System.err.println("koneksi gagal"+ e.getMessage());
        }
        return conn;
    }

    static Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
