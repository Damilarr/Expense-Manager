/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.*;
import javax.swing.*;

public class dbclass {
    public static Connection con;
    public static Statement st;
    
    static{
        try {
//   for local connection         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expmanage","root","mysql@123");

       con = DriverManager.getConnection("jdbc:mysql://sql11.freesqldatabase.com:3306/sql11693310","sql11693310","MFrchxMBqs");//Remote mysql db
             st = con.createStatement();
            System.out.println("Connection successful.");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }catch (Exception ex){
        JOptionPane.showMessageDialog(null ,ex);
        }
}
}
