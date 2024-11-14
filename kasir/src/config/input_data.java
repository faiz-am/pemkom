/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class input_data {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String id_admin;
    public String username;
    public String password;
    
    
    public void simpan()throws SQLException{
        conn = Koneksi.getKoneksi();
        sql = "INSERT INTO akun(id_admin, username, password)VALUE(?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, id_admin);
        pst.setString(2, username);
        pst.setString(3, password);
        pst.execute();
        pst.close();
    }
}
