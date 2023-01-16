/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.tilish1424;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class test  {
     
    
private String pwd;
public void setPwd(String pwd){
this.pwd = pwd;
}
public String getPwd(){
return pwd;
}
   private String name;
    
     
   public void setName(String name){
       this.name=name;
   }
   public String getName(){
   
   return name;
   }
   public String diplayeName(){
       return "loginpage";
   }
        public void pateintInsert() {
        Statement st;
        try {
            
            
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
           st = con.createStatement();
            String sql = "Insert into PASSWORD(PASSWORD,USERNAME)"
                    + " values('"+pwd+"','"+name+"')";
            st.executeQuery(sql);
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, pwd);
//            ps.setString(2, name);
//         
//            ps.executeUpdate();
             System.err.println("success");
          
        } catch ( SQLException e) {
             System.err.println(e);
        }
    }
    public test() {
    }
    
}
