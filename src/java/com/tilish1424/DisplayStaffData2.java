/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tilish1424;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean

public class DisplayStaffData2 {
      public List <DisplayStaffData> staffList;
    public List <DisplayStaffData> getStaffinformation(){
    staffList = new ArrayList<>();
    
    
      
    try{
        
           DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
             ResultSet rs = con.createStatement().executeQuery("select * from STAFFINFORMATION");
                 while (rs.next()) {
             
          
                String s_name = rs.getString("NAME");                             
               String  age1 = rs.getString("AGE");
                   String s_id = rs.getString("ID");
                   String  sex = rs.getString("GENDER");
                String  prof = rs.getString("PROFFESSION");
                 String  phone = rs.getString("PHONE");
                   String  address = rs.getString("ADDRRESS");
                  String  dates = rs.getString("DATES");
              
                staffList.add(new DisplayStaffData(s_name,age1,s_id,sex,prof,phone,address,dates));
            } 
             
    }catch( SQLException e)
    {
    
    
    }
    
    return staffList;
    }
}
