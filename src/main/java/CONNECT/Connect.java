/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONNECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class Connect {

    public static Connection con = null;
    private static final Connect instance = new Connect();

    public static Connect getInstance() {
        return instance;
    }

    public static void connect() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databasename=QuanLyBanVe";
            String user = "sa";
            String password = "1111";
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if (con == null) {
            connect();
        }
        return con;
    }

//    public static boolean isConnected() {
//        try {
//            return con != null && !con.isClosed();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
    public static void main(String[] args) {
        Connect.getInstance();
        Connection con = Connect.getConnection();

        if (con != null) {
            System.out.println("thanh cong");
        } else {
            System.out.println("that bai");
        }

    }
}
