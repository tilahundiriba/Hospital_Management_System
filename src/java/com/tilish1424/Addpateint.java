/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tilish1424;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Addpateint {
    private String fName;
    private String lName;
    private String age;
    private String id;
    private String dr_name;
    private String b_group;
    private String address;
     private String date;
    private String gender;


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
     
 
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
   
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDr_name() {
        return dr_name;
    }

    public void setDr_name(String dr_name) {
        this.dr_name = dr_name;
    }

    public String getB_group() {
        return b_group;
    }

    public void setB_group(String b_group) {
        this.b_group = b_group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    public String contact;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }
public Addpateint(){

       
       

}
     public void pateintInsert() {
       //  Statement s5;
        try {
            
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
//             s5 = con.createStatement();
//           String sql = "Insert into ADDPATEINT(ID,FRISTNAME,LASTNAME,AGE,DR_NAME,BLOODGROUP,ADDRESS,CONTACT,DATES)"
//                    + " values('"+id+"','"+fName+"','"+lName+"','"+age+"','"+dr_name+"','"+b_group+"','"+address+"','"+contact+"','"+date+"')";
//             String sql = "Insert into ADDPATEINT(ID,FRISTNAME,LASTNAME,AGE,DR_NAME,BLOODGROUP,ADDRESS,CONTACT,DATES)"
//                    + " values(?,?,?,?,?,?,?,?,?,?)";
           
           // s5.executeQuery(sql);
           PreparedStatement ps = con.prepareStatement("Insert into ADDPATEINT(ID,FRISTNAME,LASTNAME,AGE,DR_NAME,BLOODGROUP,ADDRESS,CONTACT,DATES)values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, fName);
           ps.setString(3, lName);
            ps.setString(4, age);
           ps.setString(5, dr_name);
              ps.setString(6, b_group);
                ps.setString(7, address);
                  ps.setString(8, contact);
                    ps.setString(9, date);
                      
            ps.executeUpdate();
       
             System.err.println("success");
          
        } catch (  SQLException e) {
             System.err.println(e);
        }
    }
    
}
