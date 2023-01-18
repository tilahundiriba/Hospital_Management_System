/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tilish1424;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class ValidateClass {
     public static boolean validate(String name, String pass) {
        boolean check = false;
        try {

            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
            PreparedStatement ps = con.prepareStatement("select * from PASSWORD where USERNAME=? and PASSWORD=?");
            ps.setString(1, name);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            check = rs.next();

        } catch (Exception e) {
            System.out.println(e);
        }
        return check;
    }
}
