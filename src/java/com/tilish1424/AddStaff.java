/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tilish1424;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class AddStaff {
   public AddStaff(){ // constructor for initialize some variables
       
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
    private int age;

    public int getAge() {
        
        return age;
    }

    public void setAge(int age) {
      
        
        this.age = age;
        
        
        
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private int id;
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
  
    public void addStafff(){ // method for insertion information about staff worker
          try {
           
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();

        PreparedStatement ps = con.prepareStatement("Insert into STAFFINFORMATION(NAME,AGE,ID,GENDER,PROFFESSION,PHONE,ADDRRESS,DATES)values(?,?,?,?,?,?,?,?)");
         ps.setString(1, name);
            if(age > 0 && age < 180)
        {
         ps.setInt(2, age);
        }
        else{
       FacesContext.getCurrentInstance().addMessage( // restricting that age cannot be zeroo or above 180 years.
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Age can't be Zero/above 180!!!",
                            ""));
        }
        
        ps.setInt(3, id);
        ps.setString(4, gender);
       ps.setString(5, prof);
       ps.setString(6, phone);
         ps.setString(7, address);        
        ps.setString(8, date);
                     
           ps.executeUpdate();
       
              FacesContext.getCurrentInstance().addMessage( // giving information wether insertion successfull or not.
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Successfully Inesrted",
                            ""));
          
        } catch (  SQLException e) {
             System.err.println(e);
        }
        
    }
}
