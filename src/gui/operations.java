/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import database.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Imaxx
 */
public class operations {
    public static boolean isLogin(String companyname,String password,JFrame frame){
        try{
             ResultSet rs = database.dbclass.st.executeQuery("Select user_id,companyname from user where companyname = '"+companyname+"' and password = '"+password+"' ");
            while(rs.next()){
                loginsession.UID = rs.getInt("user_id");
                loginsession.Name_user = rs.getString("companyname");
                return true;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return false;
    }
    
       
}
