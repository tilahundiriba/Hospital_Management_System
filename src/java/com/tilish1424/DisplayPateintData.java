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

@ManagedBean(name="addPateint")
@RequestScoped

public class DisplayPateintData {
  public List <DataDisplayClass> arrayList;
    public List <DataDisplayClass> getpateintlist(){
    arrayList = new ArrayList<>();
    try{
        
           DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
             ResultSet rs = con.createStatement().executeQuery("select * from ADDPATEINT");
                 while (rs.next()) {
             
              String p_id = rs.getString("ID");
                String f_name = rs.getString("FRISTNAME");
               String  l_name = rs.getString("LASTNAME");
                String  sex = rs.getString("GENDER");
               String  age1 = rs.getString("AGE");
               String dr_name1 = rs.getString("DR_NAME");
              String b_group1 = rs.getString("BLOODGROUP");
               String  address1 = rs.getString("ADDRESS");
                 String  phone = rs.getString("CONTACT");
                  String  dates = rs.getString("DATES");
              
                arrayList.add(new DataDisplayClass(p_id,f_name,l_name,sex,age1,dr_name1,b_group1,address1,phone,dates));
            } 
             
    }catch( SQLException e)
    {
    
    
    }
    
    return arrayList;
    }
}
