/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perez_program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MsConnectAccess {

     public static Connection conn() {

        try {

            String url =
                "jdbc:ucanaccess://C:/Users/CL2-PC/Documents/Database21.accdb";

            Connection connection =
                DriverManager.getConnection(url);

            return connection;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(
                null,
                "Database connection error:\n" + e.getMessage(),
                "Connection Error",
                JOptionPane.ERROR_MESSAGE
            );

            return null;
        }
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



