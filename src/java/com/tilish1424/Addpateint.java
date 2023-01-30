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
public class Addpateint {
    List<String> genderList;

    public List<String> getGenderList() {
        return genderList;
    }

    public void setGenderList(List<String> genderList) {
        this.genderList = genderList;
    }
    private String fName;
    private String lName;
    private int age;
    private int id;

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

 genderList = new ArrayList<>();
      
        genderList.add("Male");
        genderList.add("Female");
            
       

}
     public void pateintInsert() {
        try {
            
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();

           PreparedStatement ps = con.prepareStatement("Insert into ADDPATEINT(ID,FRISTNAME,LASTNAME,GENDER,AGE,DR_NAME,BLOODGROUP,ADDRESS,CONTACT,DATES)values(?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, fName);
           ps.setString(3, lName);
           ps.setString(4, gender);
           if(age > 0 && age < 180){
                ps.setInt(5, age);
           }else 
           {
               FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Age can't be Zero/above 180!!!",
                            ""));
           }
           
           ps.setString(6, dr_name);
              ps.setString(7, b_group);
                ps.setString(8, address);
                  ps.setString(9, contact);
                    ps.setString(10, date);
                      
            ps.executeUpdate();
       
               FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Successfully Inesrted",
                            ""));
          
        } catch (  SQLException e) {
             System.err.println(e);
        }
    }
    
}
