/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sfauzi.crudmahasiswasederhana.Helper;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author S FAUZI
 * SYAHRUL FAUZI - 21103015
 */
public class ConnectionHelper {
    public static Connection connect;
    public static Statement st;
    public static ResultSet rs;
    

    public static Connection getConnection() throws SQLException {
        String db = "sisteminformasi";
        String url = "jdbc:mysql://localhost:3306/"+db;
        String username = "root";
        String pass = "";
        if (connect == null) {
            try {
                System.out.println("Membuat koneksi...");
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sisteminformasi",
                        "root",
                        "");
                st = (Statement) connect.createStatement();
                JOptionPane.showMessageDialog(null, "Terkoneksi");
                System.out.println("Koneksi berhasil.");
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Tidak Terkoneksi");
                System.out.println("Koneksi berhasil.");
            }
        }
        return connect;
    }

    public static void main(String[] args) throws SQLException {
       ConnectionHelper.getConnection();
    }
   
}
