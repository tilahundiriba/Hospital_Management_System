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
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AddStaff {
   public AddStaff(){
       
        genderList = new ArrayList<>();
      
        genderList.add("Male");
        genderList.add("Female");
        
        
   }    
   List<String> genderList;

    public List<String> getGenderList() {
        return genderList;
    }

    public void setGenderList(List<String> genderList) {
        this.genderList = genderList;
    }
    private String name;
    private String age;
    private String id;
    private String gender;
    private String prof;
    private String phone;
    private String address;
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    Statement st;
    public void addStafff(){
          try {
           
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();

        PreparedStatement ps = con.prepareStatement("Insert into STAFFINFORMATION(NAME,AGE,ID,GENDER,PROFFESSION,PHONE,ADDRRESS,DATES)values(?,?,?,?,?,?,?,?)");
         ps.setString(1, name);
         ps.setString(2, age);
        ps.setString(3, id);
        ps.setString(4, gender);
       ps.setString(5, prof);
       ps.setString(6, phone);
         ps.setString(7, address);        
        ps.setString(8, date);
                     
           ps.executeUpdate();
       
             System.err.println("success");
          
        } catch (  SQLException e) {
             System.err.println(e);
        }
        
    }
}
